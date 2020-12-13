package com.qichenbabi.arith.sort;

public class InsertSort {
    public static void sort(int[] src) {
        int length = src.length;
        for (int i = 1; i < length; i++) {
            int curr = src[i];
            int j=i-1;
            for(; j>=0; j--) {
                if(curr < src[j]) {
                    src[j+1] = src[j];
                } else {
                    // 到最左边后进不来
                    // src[j+1] = curr;
                    break;
                }
            }
            src[j+1] = curr;
        }
    }

    // 插入排序，a表示数组，n表示数组大小
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,6,9};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(" ----- ");
        arr = new int[]{3,2,5,4,6,9};
        insertionSort(arr, 6);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
