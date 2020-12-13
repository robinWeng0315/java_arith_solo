package com.qichenbabi.arith.sort;

public class MergeSort {
    public static int[] sort(int[] data) {
        int length = data.length;
        if(length ==1) {
            return data;
        }

        if(length == 2) {
            if(data[0] > data[1]) {
                int tmp = data[0];
                data[0] = data[1];
                data[1] = tmp;
            }

            return data;
        }

        int mid = length / 2;

        int[] left = new int[mid];
        System.arraycopy(data, 0, left, 0, mid);
        int[] right = new int[length-mid];
        System.arraycopy(data, mid, right, 0, length-mid);
        int[] sorted_left = sort(left);
        int[] sorted_right = sort(right);

        int i=0, j=0;
        int[] result = new int[data.length];
        int index = 0;
        while(i<sorted_left.length && j<sorted_right.length) {
            if(sorted_left[i] < sorted_right[j]) {
                result[index] = sorted_left[i];
                i ++;
            } else {
                result[index] = sorted_right[j];
                j ++;
            }

            index ++;
        }

        if(i<sorted_left.length) {
            System.arraycopy(sorted_left, i, result, index, sorted_left.length-i);
        }

        if(j<sorted_right.length) {
            System.arraycopy(sorted_right, j, result, index, sorted_right.length-j);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,9,5,7};
        int[] sort = sort(arr);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
