package com.example.lang.sort;

/**
 * @Desc: 冒泡排序
 * @Auther: 85047
 * @Date: 2019/7/20 16:39
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{21,53,42,35,86,85,23,18,65,54,32,96,13,87};
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

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
