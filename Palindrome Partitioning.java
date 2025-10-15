// Given a string s, partition s such that every of the partition is a . Return all possible palindrome partitioning of s.

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),s,0);         
        return list;
    }

    private void backtrack(List<List<String>> list,List<String> curlist,String s,int index){
        if(index==s.length()){
           list.add(new ArrayList<>(curlist));
        } 

        for(int i=index;i<s.length();i++){
            if(isPalin(s,index,i)){
                curlist.add(s.substring(index,i+1));
                backtrack(list,curlist, s,i+1);
                curlist.remove(curlist.size()-1);
            }
        }
    }

    private boolean isPalin(String s,int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}

// Time : O(n × 2ⁿ)  
// Space: O(n)  
// Space(including output): O(n × 2ⁿ)  