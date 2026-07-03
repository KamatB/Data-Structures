package com.data.structures.array;


public class Solution {

    class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    ListNode head;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Solution sol=new Solution();
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null && cur2!=null){
            int sum=cur1.val+cur2.val;
            ListNode newNode=new ListNode(sum);
            sol.addToList(newNode);
            cur1=cur1.next;
            cur2=cur2.next;
        }

        return head;
    }

    public void addToList(ListNode newNode){
        if(head==null){
            head=newNode;
        }else{
            ListNode cur=head;
            while(cur!=null){
                cur=cur.next;
            }
            cur=newNode;
        }
    }

    public static void main(String[] args) {

    }
}
