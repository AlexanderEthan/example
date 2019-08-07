package com.example.examplelistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class ExampleListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleListenerApplication.class, args);
    }

    /**
     * 在上下文中找到多个TaskExecutor bean，并且没有一个被命名为“taskExecutor”。
     * 将其中一个标记为primary或将其命名为“taskExecutor”（可能作为别名），以便将其用于异步处理：
     * 如果存在多个线程池TaskExecutor，而没有标记@Primary或者命名不是taskExecutor，则使用SimpleAsyncTaskExecutor
     * @return
     */
    @Bean
    @Primary
    public Executor getAsyncExecutor() {
        //使用Spring内置线程池任务对象
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //设置线程池参数
        taskExecutor.setThreadNamePrefix("自定义线程池");
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        System.out.println("线程池开启成功。。。。。。。");
        return taskExecutor;
    }
    /*@Bean
    public Executor getAsyncExecutor1() {
        //使用Spring内置线程池任务对象
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //设置线程池参数
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.setThreadNamePrefix("111111111111111111");
        taskExecutor.initialize();
        System.out.println("线程池1开启成功。。。。。。。");
        return taskExecutor;
    }*/
}
