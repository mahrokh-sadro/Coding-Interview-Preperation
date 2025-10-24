// Given two strings s and t, return true if t is an of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int n=s.length();
        int[] arr=new int[26];

        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

        for(char ch:t.toCharArray()){
            arr[ch-'a']--;
        }

        for(int val:arr){
            if(val!=0){
                return false;
            }
        }
        return true;


    }
}