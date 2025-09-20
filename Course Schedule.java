// There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

//     For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.

// Return true if you can finish all courses. Otherwise, return false.

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }
        
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
           if(dfs(graph,visited,i)){
            return false;
           } 
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> graph,int[] visited,int node){
        if(visited[node]==1){
           return true;
        }

        if(visited[node]==2){
           return false;
        }

        visited[node]=1;
        for(var neighbor:graph.get(node)){
            if(dfs(graph,visited, neighbor)){
                return true;
            }
        }
        
        visited[node]=2;
        return false;
    }
}



//time complexity
//o(N+E)  
//space complexity
//o(N)   
// N is number of courses, and E is prerequisites.length