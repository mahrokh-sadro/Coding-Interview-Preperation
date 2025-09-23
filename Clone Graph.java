// Given a reference of a node in a connected undirected graph.

// Return a deep copy (clone) of the graph.

// Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }

        Node newNode=new Node(node.val);
        Map<Node,Node> map=new HashMap<>();
        map.put(node,newNode);

        Queue<Node> que=new LinkedList<>();
        que.add(node);

        while(!que.isEmpty()){
            Node polled=que.poll();
            for(var neighbor:polled.neighbors){
               if(!map.containsKey(neighbor)){
                  Node newNeighbor=new Node(neighbor.val);
                  map.put(neighbor,newNeighbor);
                  que.add(neighbor) ;
               }
               map.get(polled).neighbors.add(map.get(neighbor));

            }
        }

        return newNode;
    }
}
//time complexity
//o(N+E)
//space complexity
//o(N)