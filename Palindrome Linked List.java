//Given the head of a singly linked list, return true if it is a or false otherwise.


//
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode slowHead=reverse(slow);
        slow.next=null;
        fast=head;
        while(fast!=null && slowHead!=null){
            if(fast.val!=slowHead.val){
                return false;
            }
            fast=fast.next;
            slowHead=slowHead.next;
        }

        return true;


    }

    private ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
           ListNode next=cur.next;
           cur.next=pre;
           pre=cur;
           cur=next;
        }
        return pre;
    }
}