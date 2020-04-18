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
        //quickSort(arr,0,arr.length);
        quickSort1(arr,0,arr.length-1);
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

    private static <T extends Comparable<? super T>> void quickSort1(T[] arr, int low, int high) {

        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort1(arr, low, index - 1);
            quickSort1(arr, index + 1, high);
        }

    }

    private static <T extends Comparable<? super T>> int getIndex(T[] arr, int low, int high) {
        // 基准数据
        T tmp = arr[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && arr[high].compareTo(tmp) >= 0) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && arr[low].compareTo(tmp) <= 0) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high] = arr[low];

        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = tmp;
        return low; // 返回tmp的正确位置
    }
}
