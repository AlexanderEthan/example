package com.example.lang;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(54813422));
        int i =3;
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
        /*Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int j = 0; j < 200; j++) {
            map.put(j,j);
        }
        Map<Integer,Integer> map1 = new HashMap<Integer, Integer>(map);
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }*/
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(100>>4);
        System.out.println(-100>>4);
        System.out.println(-100>>>4);
        System.out.println(100>>4);
        System.out.println(-4>>2);
        System.out.println("HelloWorld!!!");
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
