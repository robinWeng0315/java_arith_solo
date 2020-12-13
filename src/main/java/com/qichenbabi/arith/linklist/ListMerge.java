package com.qichenbabi.arith.linklist;

public class ListMerge {
    public static Node<Integer> merger(Node<Integer> left, Node<Integer> right) {
        if(left == null) {
            return right;
        }

        if(right == null) {
            return left;
        }

        Node<Integer> soldier = new Node<>(0);
        Node<Integer> temp = soldier;


        while (left!=null && right!=null) {
            if(left.k < right.k) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }

            temp = temp.next;
        }

        if(left == null) {
            temp.next = right;
        }

        if(right == null) {
            temp.next = left;
        }

        return soldier.next;
    }

    public static void main(String[] args) {
        Node left = Node.init(10);
        Node.out(left);
        System.out.println(" ------------ ");

        Node right = Node.init(3, 3);
        Node.out(right);
        System.out.println(" ------------ ");

        Node merger = merger(left, right);
        Node.out(merger);
    }
}
