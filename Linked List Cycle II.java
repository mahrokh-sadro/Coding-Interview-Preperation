// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

// Do not modify the linked list.

public class Solution {
    public ListNode detectCycle(ListNode head) {
          if(head==null){
        return head;
    }
    
    ListNode slow=head;
    ListNode fast=head;
    
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            ListNode cur=head;
            while(cur!=slow){
                cur=cur.next;
                slow=slow.next;
            }
            return slow;
        }
    }
    
    return null;
    }
}

//time complexity
//o(n)   as the loops dont happen at the same time it is o(n)+o(n)
//space complexity
//o(1)