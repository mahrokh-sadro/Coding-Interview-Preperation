// Given an integer array nums, find the with the largest sum, and return its sum.


class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cur=Math.max(cur+nums[i],nums[i]);
            max=Math.max(max,cur);
        }
        return max;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)
