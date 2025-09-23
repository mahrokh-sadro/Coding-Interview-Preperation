// You are given an m x n grid where each cell can have one of three values:

//     0 representing an empty cell,
//     1 representing a fresh orange, or
//     2 representing a rotten orange.

// Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

// Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
class Solution {
    public int orangesRotting(int[][] grid) {
       if (grid.length == 0 || grid[0].length == 0) return -1;


        int freshCount=0;
        Queue<int[]> que=new LinkedList<>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                  freshCount++;
                }
                else if(grid[i][j]==2){
                  que.add(new int[]{i,j});
                }
            }
        }

        if(freshCount==0){
            return 0;
        }

        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        int mins=0;
        while(!que.isEmpty()){
            int size=que.size();
            for(int i=0;i<size;i++){
                int[] rotton=que.poll();
                for(int[] dir:directions){
                    int r=dir[0]+rotton[0];
                    int c=dir[1]+rotton[1];

                    if(r>=0 && r<grid.length && c>=0 && c<grid[0].length && grid[r][c]==1){
                        grid[r][c]=2;
                        freshCount--;
                        que.add(new int[]{r,c});
                    }
                }
            }
            mins++;
        }
        return freshCount==0?mins-1:-1;
    }
}

//time complexity
//o(n*m)
//space complexity
//o(n*m)