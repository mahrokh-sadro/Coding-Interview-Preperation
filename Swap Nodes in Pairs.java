// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        var dummy=new ListNode(-1);
        var dummyHead=dummy;
        dummy.next=head;

        ListNode swap1=null;
        ListNode swap2=null;

        while(dummy.next!=null && dummy.next.next!=null){
            swap1=dummy.next;
            swap2=dummy.next.next;

            swap1.next=swap2.next;
            swap2.next=swap1;

            dummy.next=swap2;
            dummy=swap1;

        }

        return dummyHead.next;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)
