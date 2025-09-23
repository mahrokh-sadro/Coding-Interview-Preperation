// Given two strings s and t of lengths m and n respectively, return the minimum window

// of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.

class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int l=0,r=0,minStart=0;
        int minLen=Integer.MAX_VALUE;
        int count=t.length();
        int[] arr=new int[128];
        for(char ch:t.toCharArray()){
            arr[ch]++;
        }  

        while(r<s.length()){
            char rchar=s.charAt(r);
            if(arr[rchar]>0){
                count--;
            }

            arr[rchar]--;
            r++;

            while(count==0){
                if(r-l<minLen){
                    minLen=r-l;
                    minStart=l;
                }

                char lchar=s.charAt(l);
                arr[lchar]++;
                if(arr[lchar]>0){
                    count++;
                }

                l++;
            }
        }

        return minLen==Integer.MAX_VALUE?"":s.substring(minStart,minStart+minLen);

    }
}

//time complexity
//o(n+m)
//space complexity
//o(1)
//n & m are sizes of s & t