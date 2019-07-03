package com.example.examplelistener.listener;

import com.example.examplelistener.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class RegisterUserEmailListener implements ApplicationListener<UserRegisterEvent> {

    @Override
    @Async
    public void onApplicationEvent(UserRegisterEvent event) {
        try {
            Thread.sleep(3000);//静静的沉睡3秒钟
            String name = Thread.currentThread().getName();
            System.out.println(name);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("用户注册成功，发送邮件。");
    }
}
