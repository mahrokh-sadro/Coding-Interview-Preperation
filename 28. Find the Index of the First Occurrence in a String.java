// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=needle.length();
        int hLength=haystack.length();

        while(j<=hLength){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}

// time:O(M∗N)
// space:O(1)