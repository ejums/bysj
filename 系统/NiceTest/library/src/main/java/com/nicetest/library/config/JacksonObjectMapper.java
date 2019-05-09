package com.nicetest.library.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * @author hjm09
 */
@Configuration
public class JacksonObjectMapper {

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static <T> JsonSerializer<? super T> jsonSerializer(Class <?> clazz,
                                                               DateTimeFormatter formatter){
        return new JsonSerializer<T>(){
            @Override
            public void serialize(T value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                try {
                    Method format = value.getClass().getMethod("format", DateTimeFormatter.class);
                    gen.writeString((String) format.invoke(value, formatter));
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    @SuppressWarnings({"unchecked"})
    public static <T> JsonDeserializer<T> jsonDeserializer(Class <T> clazz,
                                                           DateTimeFormatter  formatter){
        return new JsonDeserializer<T>(){
            @Override
            public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                try {
                    Method parser = clazz.getMethod("parse", CharSequence.class, DateTimeFormatter.class);
                    Object invoke = parser.invoke(null, p.getValueAsString(), formatter);
                    return (T)invoke;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }

    @Bean
    @Primary
    @Order(1)
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDateTime.class, jsonSerializer(LocalDateTime.class, DATETIME_FORMATTER));
        javaTimeModule.addSerializer(LocalDate.class, jsonSerializer(LocalDate.class, DATE_FORMATTER));
        javaTimeModule.addSerializer(LocalTime.class, jsonSerializer(LocalTime.class, TIME_FORMATTER));
        javaTimeModule.addDeserializer(LocalDateTime.class, jsonDeserializer(LocalDateTime.class, DATETIME_FORMATTER));
        javaTimeModule.addDeserializer(LocalDate.class, jsonDeserializer(LocalDate.class, DATE_FORMATTER));
        javaTimeModule.addDeserializer(LocalTime.class, jsonDeserializer(LocalTime.class, TIME_FORMATTER));
        objectMapper.registerModule(javaTimeModule);
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));

        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator,
                                  SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString("");
            }
        });
        return objectMapper;
    }
}
