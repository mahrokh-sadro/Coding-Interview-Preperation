// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }

        for(int i=index;i<n;i++){
            nums[i]=0;
        }
    }
}


//time complexity
//o(n)
//space complexity
//o(1)