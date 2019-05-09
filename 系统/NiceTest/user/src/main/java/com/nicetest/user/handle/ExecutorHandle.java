package com.nicetest.user.handle;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

/**
 * @author hjm09
 */
@Component
public class ExecutorHandle{

    @Bean
    @ConfigurationProperties(prefix = "threads")
    public ThreadPoolTaskExecutor threadPoolExecutor(){
        return new ThreadPoolTaskExecutor();
    }
}
