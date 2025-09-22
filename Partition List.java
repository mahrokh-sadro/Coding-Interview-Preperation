// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of the two partitions.


class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode lower=new ListNode(-1);
        ListNode higher=new ListNode(-1);
        ListNode lowerHead=lower;
        ListNode higherHead=higher;

        while(head!=null){
            if(head.val<x){
               lower.next=head;
               lower=lower.next;
            }
            else{
               higher.next=head;
               higher=higher.next;
            }
            head=head.next;
        }
        // lower.next=null;
        higher.next=null;
        lower.next=higherHead.next;
        return lowerHead.next;
    }
}



//time complexity
//o(n)
//space complexity
//o(1)
