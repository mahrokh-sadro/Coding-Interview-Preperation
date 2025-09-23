// Given a string s, find the longest palindromic subsequence's length in s.

// A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
class Solution {
    public int longestPalindromeSubseq(String s) {
       int n=s.length();
       if(n<2){
         return n;
       }

       String rev=new StringBuilder(s).reverse().toString();
       int[][] dp=new int[n+1][n+1];

       for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                  dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                  dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
       }

       return dp[n][n];
    }
}

//time complexity
//o(n^2)
//space complexity
//o(n^2)