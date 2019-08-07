package com.example.examplelistener.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Desc:
 * @Auther: 85047
 * @Date: 2019/7/30 21:15
 */
@Component
public class ScheduledTest {

    @Scheduled(cron = "3/10 51 21 * * ?")
    public void test01() {
        System.out.println("定时任务执行。。。。。"+LocalDateTime.now().toString());
    }
}
