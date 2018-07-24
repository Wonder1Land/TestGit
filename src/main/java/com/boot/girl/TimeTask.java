package com.boot.girl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类名:TimeTask
 * 作者:朱利斌
 * 日期:2018/7/23 16:30
 * 说明:
 */
@Component
public class TimeTask {
    @Scheduled(cron = "0/5 * * * * ?")
     public void task(){
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
}
