package com.qichenbabi.arith.stack;

public class StackDemo {
    String[] data;
    int count;
    int size;

    public StackDemo(int size) {
        this.data = new String[size];
        this.size = size;
        this.count = 0;
    }

    public String add(String str) {
        if(count == data.length) {
            return "fill over";
        }

        data[count] = str;
        count ++;

        return "";
    }

    public String pop() {
        if(count == 0) {
            return "empty";
        }
        count --;
        return data[count];
    }

    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo(5);
        stackDemo.add("a");
        stackDemo.add("b");
        stackDemo.add("c");
        stackDemo.add("d");
        int n = 7;
        for (int i = 0; i < n; i++) {
            System.out.println(stackDemo.pop());
        }
    }
}
