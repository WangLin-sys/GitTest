package com.wl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Queue;

/**
 * @Author W Lin
 * @Description
 * @Date 2020/5/15 17:40
 **/
@RestController
@RequestMapping("test")
public class ProviderController {

    //注入存放消息的队列，用于下列方法一
    @Autowired
    private Queue queue;

    //注入springboot封装的工具类
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("send")
    public void send(String name) {
        //方法一：添加消息到消息队列
        //jmsMessagingTemplate.convertAndSend(queue, name);
        //方法二：这种方式不需要手动创建queue，系统会自行创建名为test的队列
        jmsMessagingTemplate.convertAndSend("test", name);
    }


}
