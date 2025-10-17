// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=getSize(headA);
        int sizeB=getSize(headB);
        var curA=headA;
        var curB=headB;

        while(sizeA<sizeB){
            curB=curB.next;
            sizeB--;
        }

        while(sizeB<sizeA){
            curA=curA.next;
            sizeA--;
        }

        while(curA!=null && curB!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }

    private int getSize(ListNode head){
        var cur=head;
        int size=0;
        while(cur!=null){
           cur=cur.next;
           size++;
        }
        return size;
    }
}

// Time: O(n + m)
// Space: O(1)