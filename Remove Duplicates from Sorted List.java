// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
         
        ListNode dummy=new ListNode(-1);
        ListNode dummyHead=dummy;
        dummy.next=head;

        while(dummy.next!=null && dummy.next.next!=null){
            if(dummy.next.val==dummy.next.next.val){
                dummy.next=dummy.next.next;
            }
            else{
                dummy=dummy.next;
            }
        } 

        return dummyHead.next;
        
    }
}

// Time: O(n)
// Space: O(1)