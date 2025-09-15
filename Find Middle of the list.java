//Find Middle of the list


class Node{
    int value;
    Node next;
    
    public Node(){
        this.value=value;
    }
    
    public Node(int value){
        this.value=value;
    }
    
    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
    
    //if there is 2 middles, returning the seconds one
    public Node findMiddle(Node head){
        if(head==null || head.next==null){
            return head;
        }
        
        var slow=head;
        var fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }
}

//time complexity 
//o(n)
//space complexity 
//o(1)