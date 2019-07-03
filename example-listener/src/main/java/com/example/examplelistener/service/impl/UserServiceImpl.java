package com.example.examplelistener.service.impl;

import com.example.examplelistener.event.UserRegisterEvent;
import com.example.examplelistener.po.UserBean;
import com.example.examplelistener.service.IUserService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
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

}
