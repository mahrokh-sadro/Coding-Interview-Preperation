
// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && target<=nums[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[r]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}

//time complexity
//o(log n)
//space complexity
//o(1)

class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }

    private int binary(int[] nums,int target,int l,int r){
        if(l>r){
            return -1;
        }        

        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            return mid;
        }

        if(nums[l]<=nums[mid]){
          if(nums[l]<=target && target<=nums[mid]){
            return binary(nums, target, l,mid-1);
          }
          else{
            return binary(nums, target, mid+1,r);
          }
        }
        else{
          if(nums[mid]<=target && target<=nums[r]){
            return binary(nums, target, mid+1,r);
          }
          else{
            return binary(nums, target, l,mid-1);
          }
        }
    }
}

//time complexity
//o(log n)
//space complexity
//o(logn)