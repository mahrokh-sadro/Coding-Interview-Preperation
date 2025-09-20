// Given an array of strings strs, group the together. You can return the answer in any order.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        if(strs==null || strs.length==0){
            return new ArrayList<>(map.values());
        }
        
        for(String str:strs){
            char[] arrKey=str.toCharArray();
            Arrays.sort(arrKey);
            
            String key=new String(arrKey);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                map.put(key,new ArrayList<>());
                map.get(key).add(str);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}

//time complexity
//o(n * k log k)
//space complexity
//o(n*k)
//n is size of strs
//k is maximum length of a single string in the array
