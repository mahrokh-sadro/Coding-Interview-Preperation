// Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.


class LRUCache {

     private class Node{
        int key;
        int value;
        Node next;
        Node pre;
        
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    
    Map<Integer,Node> cache;
    Node head;
    Node tail;
    int capacity;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.pre=head;
    }
    
    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        
        Node node=cache.get(key);
        remove(node);
        addToHead(node);
        return node.value;
        
    }
    
    public void put(int key,int value){
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            remove(node);
            addToHead(node);
            node.value=value;
        }
        else{
            Node node=new Node(key,value);
            cache.put(key,node);
            addToHead(node);
        }
        if(cache.size()>capacity){
            Node nodeToRemove=tail.pre;
            remove(nodeToRemove);
            cache.remove(nodeToRemove.key);
        }
    }
    
    private void remove(Node node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
    
    private void addToHead(Node node){
        node.next=head.next;
        node.pre=head;
        head.next.pre=node;
        head.next=node;
    }
    
}

//time complexity
//o(1)
//space complexity
//o(n)
