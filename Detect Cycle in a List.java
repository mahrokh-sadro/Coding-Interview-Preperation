//Detect Cycle in a List


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