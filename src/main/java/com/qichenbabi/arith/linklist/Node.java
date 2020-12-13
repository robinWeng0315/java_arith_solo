package com.qichenbabi.arith.linklist;

public class Node<K> {

    K k;
    Node<K> next;

    public Node(K k) {
        this.k = k;
    }

    public static Node init(int n) {
        return init(n, 1);
    }

    public static Node init(int n, int step) {
        Node head = null;
        Node pre = null;
        for (int i = 0; i < n; i++) {
            Node<Integer> node = new Node<>(i*step);
            if(head == null) {
                head = node;
            } else {
                pre.next = node;
            }

            pre = node;
        }

        return head;
    }



    public static void out(Node node) {
        Node next = node;
        while (next != null) {
            System.out.println(next.k);
            next = next.next;
        }
    }

    public static void out(Node node, int size) {
        Node next = node;
        int i = 0;
        while (next != null && i<size) {
            System.out.println(next.k);
            next = next.next;
            i ++;
        }
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public Node<K> getNext() {
        return next;
    }

    public void setNext(Node<K> next) {
        this.next = next;
    }
}
