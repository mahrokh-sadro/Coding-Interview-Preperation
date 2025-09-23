// Given a string s, find the length of the longest without duplicate characters.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<2){
            return n;
        }

        int l=0;
        int[] lastSeen=new int[128];
        int max=0;
        Arrays.fill(lastSeen,-1);
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(lastSeen[ch]>=l){
                l=lastSeen[ch]+1;
            }
            lastSeen[ch]=r;
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}

//time complexity
//o(n)
//space complexity
//o(1)