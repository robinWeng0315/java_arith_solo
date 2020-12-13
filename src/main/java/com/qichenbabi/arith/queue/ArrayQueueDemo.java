package com.qichenbabi.arith.queue;

public class ArrayQueueDemo {
    String[] data;
    int head;
    int tail;
    int size;

    public ArrayQueueDemo(int size) {
        data = new String[size];
        this.size = size;
        head = tail = 0;
    }

    public void push(String str) {
        if(tail == size) {
            if(head > 0) {
                System.arraycopy(data, head, data, 0, size-head);
                tail = tail - head;
                head = 0;
            } else {
                return;
            }
        }

        data[tail++] = str;
    }

    public String pop() {
        if(head == tail) {
            return "empty";
        }

        return data[head ++];
    }

    public static void main(String[] args) {
        ArrayQueueDemo arrayQueueDemo = new ArrayQueueDemo(10);
        int n = 10;
        for (int i = 0; i < n; i++) {
            arrayQueueDemo.push(String.valueOf(i));
        }

        n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(arrayQueueDemo.pop());
        }
        System.out.println(" ---- ");
        n = 3;
        for (int i = 0; i < n; i++) {
            arrayQueueDemo.push(String.valueOf(20 + i));
        }

        n = 8;
        for (int i = 0; i < n; i++) {
            System.out.println(arrayQueueDemo.pop());
        }
    }
}
