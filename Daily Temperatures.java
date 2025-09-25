// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.


class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n=temps.length;
        if(n<2){
            return new int[0];
        }

        Stack<Integer> stack=new Stack<>(); 
        int[] array=new int[n];
        for(int i=0;i<n;i++){
           while(!stack.isEmpty() && temps[i]>temps[stack.peek()]){
             int index=stack.pop();
             array[index]=i-index;
           }
           stack.push(i);
        }
        return array;
    }
}
//time complexity
//o(n)
//space complexity
//o(n)