// We are given an array asteroids of integers representing asteroids in a row. The indices of the asteroid in the array represent their relative position in space.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        boolean alive=true;
        for(int a:asteroids){
            alive=true;
            while(alive && a<0 && !stack.isEmpty() && stack.peek()>0){
               if(stack.peek()<-a){
                 stack.pop();
               }
               else if(stack.peek()==-a){
                 stack.pop();
                 alive=false;
               }
               else{
                 alive=false;
               }
            }
            if(alive){
                stack.push(a);
            }
        }
        int n=stack.size();
        int[] ret=new int[n];
        int j=n-1;
        while(!stack.isEmpty()){
           ret[j--]=stack.pop();
        }
        return ret;


    }
}