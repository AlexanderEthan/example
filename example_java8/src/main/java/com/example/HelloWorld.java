package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println((Long.MAX_VALUE+"").length());
        System.out.println("18446744073709551615".length());
        System.out.println(Math.pow(2,2));
        //System.out.println(18446744073709551615/Long.MAX_VALUE);
        /*System.out.println(Integer.toBinaryString(54813422));
        int i =3;
        String s = "aaaa";
        String ss = new String("aaaa");
        String sss = new String("aaaa").intern();
        System.out.println(s == ss);
        System.out.println(s == sss);
        System.out.println(ss == sss);
        if (i > 0) {
            System.out.println(0);
        } else if (i > 1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        if (i > 2) {
            System.out.println(3);
        }
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(100>>4);
        System.out.println(-100>>4);
        System.out.println(-100>>>4);
        System.out.println(100>>4);
        System.out.println(-4>>2);
        System.out.println("HelloWorld!!!");*/
        /*static final int tableSizeFor(int cap) {
            int n = cap - 1;
            n |= n >>> 1;
            n |= n >>> 2;
            n |= n >>> 4;
            n |= n >>> 8;
            n |= n >>> 16;
            return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
        }*/
    }
}
