package com.example.examplelistener.service.impl;

import com.example.examplelistener.event.UserRegisterEvent;
import com.example.examplelistener.po.UserBean;
import com.example.examplelistener.service.IUserService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService,ApplicationEventPublisherAware {

    //@Autowired
    //private ApplicationContext        applicationContext;
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void register(UserBean user) {
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this,user));
    }

    /**
     * 由于spring aop原理,同一个类调用类里面的异步方法不起作用
     */
    @Override
    @Async
    public void asnycTest() {
        try {
            Thread.sleep(4000);//静静的沉睡4秒钟
            String name = Thread.currentThread().getName();
            System.out.println(name);
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("用户注册异步任务执行...");
    }

}
