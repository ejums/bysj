# 基础微服务架构的嗲明处欻传统的设计与实现
### 编写人: 韩金明
### 指导老师: 罗代忠
## 系统简介
    本系统是致力于解决和简化试卷编写，设计和考试繁杂的过程，使得用户在使用该系统时可以快速，可定制的生成试卷，考试和计算成绩。系统拥有试题系统，试卷系统，考试系统和论坛系统等

#项目运行环境
    -- jdk8
    -- mysql8
    -- intellij idea
    -- gradle
    -- nginx
#项目运行方式
    1. 启动项目目录下的nginx/nginx.exe,启动图片服务器
    2. 在mysql8中执行db.sql，导入表结构和初始数据
    3.启动niceTest下的user, library项目，此项目为Springboot项目，已集成tomcat,启动方式将项目导入IDEA,
    配置jdk,启动springboot下载包，运行即可
