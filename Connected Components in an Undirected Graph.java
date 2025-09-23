// There is an undirected graph with n nodes. There is also an edges array, where edges[i] = [a, b] means that there is an edge between node a and node b in the graph.

// The nodes are numbered from 0 to n - 1.

// Return the total number of connected components in that graph.
class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        } 

        for(int[] edg:edges){
            list.get(edg[0]).add(edg[1]);
            list.get(edg[1]).add(edg[0]);
        }

        boolean[] visited=new boolean[n];  
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(list,i,visited);
                count++;
            }
        }

        return count;
    }

    private boolean dfs(List<List<Integer>> list,int node,boolean[] visited){
        if(visited[node]){
            return true;
        }
        visited[node]=true; 
        for(var neighbor:list.get(node)){
            dfs(list,neighbor,visited);
        }

        return false;
    }
}



//time complexity
//o(N+E)
//space complexity
//o(N+E)
