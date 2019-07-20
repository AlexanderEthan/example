package com.example.lang.sort;

/**
 * @Desc: 快速排序
 * @Auther: 85047
 * @Date: 2019/7/20 16:44
 */
public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{21,53,42,35,86,85,23,18,65,54,32,96,13,87};
        long start = System.currentTimeMillis();
        //快速排序
        quickSort(arr,0,arr.length);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

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
}
