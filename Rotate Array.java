// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.


class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k % n == 0) return;

        k = k % n;

        // Step 1: reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: reverse the rest
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

}
// time: O(n) 
// space: O(1) 