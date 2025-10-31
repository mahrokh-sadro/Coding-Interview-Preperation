// You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln

// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …

// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return ;
        }
        //find the middle
        //reverse secod part
        //if f!=null slow.next
        var fast=head;
        var slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

       

        var slowHead=reverse(slow.next);
        fast=head;
        slow.next=null;
        
        var dummy=new ListNode(-1);
        while(fast!=null && slowHead!=null){
             dummy.next=fast;
             dummy=dummy.next;
             fast=fast.next;
             dummy.next=slowHead;
             slowHead=slowHead.next;
             dummy=dummy.next;   
        }

        if(fast!=null){
            dummy.next=fast;
        }

        // return dummyHead.next;

    }

    private ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        var cur=head;
        ListNode pre=null;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;

    }
}

// Time : O(n)
// Space : O(1)