package com.qichenbabi.arith;

public class LRUTest {
    class Node<K> {
        K k;
        Node<K> next;
        Node(K k) {
            this.k = k;
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

    public Node init(int n) {
        Node pre = null;
        Node head = null;
        for (int i = 0; i < n; i++) {
            Node curr = new Node(i);
            if(head == null) {
                head = curr;
            } else {
                pre.next = curr;
            }
            pre = curr;
        }

        return head;
    }

    public static void main(String[] args) {
        Node init = new LRUTest().init(10);
        System.out.println(init.getK());
        Node next = init;
        while ((next = next.next) != null) {
            System.out.println(next.getK());
        }
    }
}
