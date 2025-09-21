// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        int sum=0;
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;

        while(l1!=null || l2!=null || carry>0){
            sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            sum+=carry;
            carry=sum/10;
            ListNode cur=new ListNode(sum%10);
            dummy.next=cur;
            dummy=dummy.next;

        }
        return head.next;
    }
}

//time complexity
//o(n+m)
//space complexity
//o(n+m)
//n size of l1
//m size of l2