package com.wl.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @Author W Lin
 * @Description
 * @Date 2020/5/15 17:38
 **/
@Configuration
public class BeanConfig {

    //定义存放消息的队列
//    @Bean
//    public Queue queue1() {
//        return new ActiveMQQueue("ActiveMQQueue1");
//    }
//    @Bean
//    public Queue queue2() {
//        return new ActiveMQQueue("ActiveMQQueue2");
//    }
//    @Bean
//    public Queue queue3() {
//        return new ActiveMQQueue("ActiveMQQueue3");
//    }
}
