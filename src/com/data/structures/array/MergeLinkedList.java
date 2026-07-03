package com.data.structures.array;

import java.util.List;

public class MergeLinkedList {
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
        list1.next.next=new ListNode(4);

        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);
        MergeLinkedList mergeLinkedList=new MergeLinkedList();
        ListNode finalList=mergeLinkedList.mergeTwoLists(list1,list2);
        while(finalList!=null){
            System.out.println(finalList.val);
            finalList=finalList.next;
        }

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=new ListNode();
        ListNode mergedList=curr;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                  mergedList.next=new ListNode(list1.val);
                  list1=list1.next;
            }else{
                mergedList.next=new ListNode(list2.val);
                list2=list2.next;
            }
            mergedList=mergedList.next;
        }

        while(list1!=null) {
            mergedList.next = new ListNode(list1.val);
            list1 = list1.next;
            mergedList = mergedList.next;
        }

        while(list2!=null) {
            mergedList.next = new ListNode(list2.val);
            list2 = list2.next;
            mergedList = mergedList.next;
        }

        return curr.next;
    }
}
