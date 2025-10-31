// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        if(n==1) return 0;
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

        for(int i=0;i<n;i++){
           if(arr[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
