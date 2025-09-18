//Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

//Implement the LRUCache class:

  //  LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
  //  int get(int key) Return the value of the key if the key exists, otherwise return -1.
  //  void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

//The functions get and put must each run in O(1) average time complexity.

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
//o(1)
//space complexity
//o(capacity)