// Given the head of a linked list, remove the nth node from the end of the list and return its head.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        ListNode dummyHead=dummy;
        dummy.next=head;

        ListNode slow=dummy;
        ListNode fast=dummy;

        for(int i=0;i<n+1;i++){
            fast=fast.next;
        }

        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return dummyHead.next;
   }
}

//time complexity
//o(n)
//space complexity
//o(1)