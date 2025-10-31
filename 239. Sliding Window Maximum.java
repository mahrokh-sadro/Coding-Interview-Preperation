// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

// Return the max sliding window.

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n=nums.length;
        int[] array=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int j=0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && i-k+1>dq.peekFirst()){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }

            dq.add(i);
            if(i>=k-1){
              array[j++]=nums[dq.peek()];
            }
        }

        return array;
    }
}

// time:o(n)
// space:o(k)