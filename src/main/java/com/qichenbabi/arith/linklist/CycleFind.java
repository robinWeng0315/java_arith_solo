package com.qichenbabi.arith.linklist;

import sun.util.resources.cldr.yav.CurrencyNames_yav;

import java.util.Objects;

public class CycleFind {
    public Node find(Node init) {
        if(init == null || init.next==null || init.next.next==null) {
            return null;
        }

        if(init.next == null) {
            return null;
        }
        Node fast = init.next.next, slow = init.next;
        while (fast!=null && fast.next!=null && slow!=null) {

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return fast;
            }
        }


        return null;
    }

    public void cycle(Node head, int index) {
        int i = 0;
        Node cycle = null;
        Node curr = head;
        Node pre = null;
        do  {
            if(i == index) {
                cycle = curr;
            }

            pre = curr;
            curr = curr.next;
            i ++;
        } while (curr != null);

        pre.next = cycle;
    }

    public static void main(String[] args) {
        CycleFind cycleFind = new CycleFind();
        Node init = Node.init(6);
        Node.out(init);
        System.out.println(" -------- ");
        cycleFind.cycle(init, 3);
        Node.out(init, 5);
        System.out.println(" ----- ");
        Node node = cycleFind.find(init);
        System.out.println(node==null? "null":node.k);
    }
}
