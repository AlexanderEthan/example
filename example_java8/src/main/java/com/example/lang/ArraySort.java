package com.example.lang;

/**
 * @Desc: 数组排序算法示例类
 * @Auther: 85047
 * @Date: 2019/7/20 15:12
 */
public class ArraySort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{21,53,42,35,86,85,23,18,65,54,32,96,13,87};
        long start = System.currentTimeMillis();
        //快速排序
        //quickSort(arr,0,arr.length);
        //冒泡排序
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    /**
     * 快速排序
     * @param arr
     * @param <T>
     */
    private static <T extends Comparable<? super T>> void quickSort(T[] arr,int start,int end) {
        if (start >= end - 1)
            return;
        int i = start;
        int j = end - 1;
        T mark = arr[i];
        while (i < j) {
            while (arr[j].compareTo(mark) >= 0 && i < j) {
                j--;
            }
            while (arr[i].compareTo(mark) <= 0 && i < j) {
                i++;
            }
            if (i < j) {
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[start] = arr[i];
        arr[i] = mark;
        quickSort(arr,start,i);
        quickSort(arr,i+1,end);
    }

    /**
     * 冒泡排序
     * @param arr
     * @param <T>
     */
    private static <T extends Comparable<? super T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j+1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
