//Given an array of size n with elements from 1 to n, find the missing number.
public int findMissing(int[] nums){
    int i=0;
    int n=nums.length;
    while(i<n){
        int expectedIndex=nums[i]-1;
        if(nums[i]>=1 && nums[i]<=n &&  nums[i]!=nums[expectedIndex]){
            int temp=nums[i];
            nums[i]=nums[expectedIndex];
            nums[expectedIndex]=temp;
        }
        else{
            i++;
        }
    }
    
    for(int j=0;j<n;j++){
        if(nums[j]!=j+1){
            return j+1;
        }
    }
    
    return n+1;
}

//time complexity 
//o(n)
//space complexity 
//o(1)