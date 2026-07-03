package com.data.structures.leetcode;

public class ReverseKGroup {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ReverseKGroup reverseKGroup=new ReverseKGroup();
        ListNode finalList=reverseKGroup.reverseKGroup(head,2);
        while(finalList!=null){
            System.out.println(finalList.val);
            finalList=finalList.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        int count=0;

        while (cur!=null && count<k){
            cur=cur.next;
            count++;
        }

        if(count==k){
            cur=reverseKGroup(cur,k);

            while(count-->0){
                ListNode tmp=head.next;
                head.next=cur;
                cur=head;
                head=tmp;
            }
            head=cur;
        }
        return head;
    }
}
