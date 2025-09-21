// Given the head of a linked list, rotate the list to the right by k places.
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int size=getSize(head);
        if(head==null || k==0 || k==size || k%size==0){
            return head;
        }

        k=k%size;
     
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode newHead=slow.next;
        fast.next=head;
        slow.next=null;
        return newHead;
    }

    private int getSize(ListNode head){
       ListNode cur=head;
       int size=0;
       while(cur!=null){
         cur=cur.next;
         size++;
       }
       return size;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)