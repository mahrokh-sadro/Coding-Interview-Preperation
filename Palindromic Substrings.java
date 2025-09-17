// Given a string s, return the number of palindromic substrings in it.
// A string is a palindrome when it reads the same backward as forward.
// A substring is a contiguous sequence of characters within the string


public int countSubstrings(String s){
    int n=s.length();
    if(n<2){
        return n;
    }
    
    int count=0;
    for(int i=0;i<n;i++){
        count+=count(s,i,i);
        count+=count(s,i,i+1);
    }
    return count;
}

private int count(String str,int l,int r){
    int count=0;
    while(l>=0 && r<str.length() && str.charAt(l)==s.charAt(r)){
        l--;
        r++;
        count++;
    }
    return count;
}
//time complexity
//o(n^2)
//space complexity
//o(1)







