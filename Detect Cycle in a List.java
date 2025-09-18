// Given head, the head of a linked list, determine if the linked list has a cycle in it.
// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
// Return true if there is a cycle in the linked list. Otherwise, return false.


class Node{
    int val;
    Node next;
    
    public Node(){
        
    }
    
    public Node(int val){
        this.val=val;
    }
    
    public Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
    
    
    public boolean detectCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }
        
        var slow=head;
        var fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
    
        return false;
    }
    
}

//time complexity 
//o(n)
//space complexity 
//o(1)