// Given two strings s and p, return an array of all the start indices of p's in s. You may return the answer in any order.

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int[] arr_p=new int[26];
        int[] arr_s=new int[26];
        for(int i=0;i<p.length();i++){
            arr_p[p.charAt(i)-'a']++;
            arr_s[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(arr_p,arr_s)){
            list.add(0);
        } 
        
        int l=0;
        int r=p.length();
        while(r<s.length()){
            arr_s[s.charAt(l)-'a']--;
            arr_s[s.charAt(r)-'a']++;
            l++;
            r++;
            if(Arrays.equals(arr_p,arr_s)){
                list.add(l);
            } 
        }
        return list;

    }
}


//time complexity
//o(n)
//space complexity
//o(1)