package com.data.structures.leetcode;

public class SwapNodesInPairs {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode node= swapPairs(head);
        while(node!=null){
            System.out.print(node.val + " -> ");
            node=node.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode cur = head;

        while (cur != null && cur.next!=null) {
            int tempVal = cur.next.val;
            cur.next.val = cur.val;
            cur.val = tempVal;
            if (cur.next != null && cur.next.next != null) {
                cur = cur.next.next;
            }else{
                break;
            }
        }
        return head;
    }
}
