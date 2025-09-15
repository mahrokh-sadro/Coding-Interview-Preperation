//Implementing an LRU cache

class LRUCache {

private class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    
    Map<Integer,Node> cache;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.pre=head;
    }
    
    public int get(int key) {
         if(!cache.containsKey(key)){
            return -1;
        }
        var node=cache.get(key);
        remove(node);
        addToHead(node);
        return node.value;
        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            var node=cache.get(key);
            node.value=value;
            remove(node);
            addToHead(node);
        }
        else{
            Node node=new Node(key,value);
            cache.put(key,node);
            addToHead(node);
        }
        
        if(cache.size()>capacity){
            var node=tail.pre;
            remove(node);
            cache.remove(node.key);
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
o(1)
//space complexity
o(capacity)