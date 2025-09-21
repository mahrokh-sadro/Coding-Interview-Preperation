// Given an integer array nums, return the length of the longest strictly increasing .

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        // tails[i] = smallest possible tail of an increasing subsequence of length i+1
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int l = 0, r = list.size() - 1;
            // binary search for the first element >= num
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (list.get(mid) < num) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            // if left == size, num is greater than all tails → append
            if (l == list.size()) {
                list.add(num);
            } else {
                // replace the first tail >= num
                list.set(l, num);
            }
        }

        return list.size();
    }
}
//time complexity
//o(nlogn)
//space complexity
//o(n)


class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n<2){
            return n;
        }
        
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int max=0;
        for(int num:dp){
            if(max<num){
              max=num;
            }
        }

        return max;
    }
}

//time complexity
//o(n^2)
//space complexity
//o(n)