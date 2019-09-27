package com.example.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName AtomicIntegerTest
 * @Description TODO
 * @Author v_wangcaineng
 * @DATE 2019/9/17 10:53
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int temvalue = 0;
        AtomicInteger i = new AtomicInteger(0);
        temvalue = i.getAndSet(3);
        System.out.println("temvalue:" + temvalue + ";  i:" + i);//temvalue:0;  i:3
        temvalue = i.getAndIncrement();
        System.out.println("temvalue:" + temvalue + ";  i:" + i);//temvalue:3;  i:4
        temvalue = i.getAndAdd(5);
        System.out.println("temvalue:" + temvalue + ";  i:" + i);//temvalue:4;  i:9
    }
}
