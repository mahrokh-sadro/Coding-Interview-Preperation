// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Note that the same word in the dictionary may be reused multiple times in the segmentation.



class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       Boolean[] dp=new Boolean[s.length()];
       return wordBreak(s, wordDict, dp,0);
    }

    private boolean wordBreak(String s, List<String> wordDict,Boolean[] dp,int index){
       if(index==s.length()){
        return true;
       }
       
       if(dp[index]!=null){
        return dp[index];
       }

       for(String word:wordDict){
         if(s.startsWith(word,index)){
            if(wordBreak(s,wordDict,dp,index+word.length())){
                return true;
            }
         }
       }

       dp[index]=false;
       return false;
    }
}


//time complexity
//o(n*k*m)
//space complexity
//o(n)
//n:s.length()
//m:for(String word:wordDict)
//k:s.startsWith(word, index)

