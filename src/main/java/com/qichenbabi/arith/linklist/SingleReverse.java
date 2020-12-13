package com.qichenbabi.arith.linklist;

/**
 * 单链表反转
 */
public class SingleReverse {

    public Node reverse(Node node) {
        if(node == null) {
            return null;
        }

        Node next = node.next;

        if(next == null) {
            return node;
        }

        node.next = null;
        Node pre = node;
        while (next != null) {
            Node curr = next;
            next = next.next;
            curr.next = pre;
            pre = curr;
        }

        return pre;
    }


    public static void main(String[] args) {
        SingleReverse singleReverse = new SingleReverse();
        Node init = Node.init(2);
        Node.out(init);
        System.out.println(" ------------ ");
        Node reverse = singleReverse.reverse(init);
        Node.out(reverse);
    }


}
