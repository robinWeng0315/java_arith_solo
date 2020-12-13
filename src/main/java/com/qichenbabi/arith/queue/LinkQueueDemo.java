package com.qichenbabi.arith.queue;

import com.qichenbabi.arith.linklist.Node;

public class LinkQueueDemo {
    Node head;
    Node tail;

    public void push(Node data) {
        if(tail == null) {
            head = data;
            tail = data;
        } else {
            tail.setNext(data);
            tail = tail.getNext();
        }

    }

    public Node pop() {
        if(head == null) {
            return null;
        } else {
            Node pop = head;
            head = head.getNext();
            if(head == null) {
                tail = null;
            }

            return pop;
        }
    }

    public static void main(String[] args) {
        LinkQueueDemo linkQueueDemo = new LinkQueueDemo();
        int n= 1;
        for (int i = 0; i < n; i++) {
            linkQueueDemo.push(new Node(i));
        }

        n = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(linkQueueDemo.pop().getK());
        }
        System.out.println(" -------- ");
        n = 1;
        for (int i = 0; i < n; i++) {
            linkQueueDemo.push(new Node(10 + i));
        }



        n = 2;
        for (int i = 0; i < n; i++) {
            Node node;
            System.out.println((node = linkQueueDemo.pop()) == null?"empty":node.getK());
        }
    }
}
