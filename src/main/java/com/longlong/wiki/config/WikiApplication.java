package com.longlong.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

// 默认扫描启动类所在包下的子包
@ComponentScan("com.longlong")
@SpringBootApplication
@MapperScan("com.longlong.wiki.mapper")
public class WikiApplication {


    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        // env方法读取配置项
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }


}
