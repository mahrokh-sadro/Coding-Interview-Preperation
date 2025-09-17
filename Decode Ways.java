//Decode Ways: Given a string of digits, map "1"->A, …, "26"->Z. Return the number of ways to decode the string.
//Rules: "0" alone is invalid, only 1–26 are valid, leading zeros are invalid. Example: "11106" → valid: "AAJF" (1,1,10,6), "KJF" (11,10,6); invalid: "06".
//Multiple ways possible; answer fits in 32-bit int.



public int decodeWays(String s){
    if(s==null || s.length()==0 || s.charAt(0)=='0'){
        return 0;
    }
    int n=s.length();
    int[] dp=new int[n+1];
    dp[0]=1;
    dp[1]=1;
    
    for(int i=2;i<n+1;i++){
        if(s.charAt(i-1)!='0'){
            dp[i]+=dp[i-1];
        }
        
        int twoDigits=Integer.parseInt(s.substring(i-2,i));
        if(twoDigits>=10 && twoDigits<=26){
            dp[i]+=dp[i-2];
        }
    }
    
    return dp[n];
}

//time complexity
//o(n)
//space complexity
//o(n)