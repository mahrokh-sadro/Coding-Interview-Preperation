
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int expectedSum=(n+1)* n/2;

        int sum=0;
        for(int num:nums){
           sum+=num;
        }

        return expectedSum-sum;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)