package com.qichenbabi.arith.sort;

public class QuickSort {
    public static void sort(int[] data, int left, int right) {
        int length = right-left;
        if(length == 1) {
            return ;
        }

        int p = data[right];
        int i=left;
        for(int j=left; j<right; j++) {
            if(data[j] < p) {
                if(i != j) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
                i ++;
            }
        }

        data[right] = data[i];
        data[i] = p;
        if(left < i-1) {

            sort(data, left, i-1);
        }

        if(right > i+1)
            sort(data, i+1, right);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,9,5,6,10,24,11};
        sort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
