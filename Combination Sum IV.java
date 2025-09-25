// Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.

// The test cases are generated so that the answer can fit in a 32-bit integer.

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int[] dp=new int[target+1];
        dp[0]=1;

        for(int i=1;i<=target;i++){
            for(int num:nums){
                if(i-num>=0){
                    dp[i]+=dp[i-num];
                }
            }
        }

        return dp[target];
    }
}

//time complexity
//o(n*m)
//space complexity
//o(m)