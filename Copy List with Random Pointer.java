// A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
// Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
// For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
// Return the head of the copied linked list.
// The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
//     val: an integer representing Node.val
//     random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
// Your code will only be given the head of the original linked list.

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null ){
            return null;
        }

        var cur=head;
        while(cur!=null){
            Node node=new Node(cur.val);
            node.next=cur.next;
            cur.next=node;
            cur=cur.next.next;
        }

        cur=head;
        while(cur!=null){
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next==null? cur.next:cur.next.next;
        }

        Node old_head=head;
        Node new_head=head.next;
        Node old_cur=old_head;
        Node new_cur=new_head;

        while(old_cur!=null){
            old_cur.next=old_cur.next.next;
            new_cur.next=new_cur.next==null?new_cur.next:new_cur.next.next;
            old_cur=old_cur.next;
            new_cur=new_cur.next;
        }

        return new_head;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)







