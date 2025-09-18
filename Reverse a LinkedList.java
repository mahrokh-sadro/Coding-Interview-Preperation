//Given the head of a singly linked list, reverse the list, and return the reversed list.


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
    
    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node cur=head;
        Node pre=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }

}

//time complexity 
//o(n)
//space complexity 
//o(1)
