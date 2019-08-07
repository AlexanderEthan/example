package com.example.examplelistener.listener;

import com.example.examplelistener.event.UserRegisterEvent;
import com.example.examplelistener.po.UserBean;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent> {

    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        UserBean user = userRegisterEvent.getUser();
        System.out.println("注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }

}
