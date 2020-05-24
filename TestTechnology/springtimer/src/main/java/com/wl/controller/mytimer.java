package com.wl.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author W Lin
 * @Description
 * @Date 2020/5/8 17:30
 **/
@Component
public class mytimer {

    /**
     * cron表达式
     * 格式: cron = [秒] [分] [小时] [日] [月] [周] [年]
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void runTimer() {
        //调用userService方法查询用户id为200的用户信息，并输出
        System.out.println("两秒一次");
    }
}
