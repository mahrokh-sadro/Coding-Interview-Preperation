// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        if(n==1){
            return new int[0];
        }
        
        int[] pre=new int[n];
        pre[0]=1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1] * nums[i-1];
        }
        
        int postfix=1;
        for(int j=n-1;j>=0;j--){
            pre[j]*=postfix;
            postfix*=nums[j];
        }
        
        return pre;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)



class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        if(n==1){
            return new int[0];
        }
        
        int[] pre=new int[n];
        int[] post=new int[n];
        pre[0]=1;
        post[n-1]=1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1] * nums[i-1];
        }
        
        for(int j=n-2;j>=0;j--){
            post[j]=post[j+1]*nums[j+1];
        }
        
        for(int i=0;i<n;i++){
            pre[i]*=post[i];
        }
        
        return pre;
    }
}


//time complexity
//o(n)
//space complexity
//o(n)
