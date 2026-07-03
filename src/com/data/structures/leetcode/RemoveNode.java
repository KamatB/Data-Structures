package com.data.structures.leetcode;

import com.data.structures.array.MergeLinkedList;

public class RemoveNode {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
//        list1.next.next=new ListNode(3);
//        list1.next.next.next=new ListNode(4);
//        list1.next.next.next.next=new ListNode(5);
        RemoveNode removeNode=new RemoveNode();
        ListNode finalList=removeNode.removeNthFromEnd(list1,2);
        while(finalList!=null){
            System.out.println(finalList.val);
            finalList=finalList.next;
        }

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        ListNode prev=head;
        int count=1;
        int prevCount=1;
        if(head.next==null){
            head=null;
        }
        while(curr.next!=null){
            curr=curr.next;
            count++;
        }
        if(count==n){
            head=head.next;
            return head;
        }
        while(prev!=null){
            int diff=count-prevCount;
            if(diff==n){
                ListNode tmp=prev.next;
                prev.next=tmp.next;
                tmp.next=null;
                break;
            }else{
                prev=prev.next;
                prevCount++;
            }
        }
        return head;
    }
}
