package com.wl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 开启定时器开关
public class SpringtimerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtimerApplication.class, args);
    }

}
