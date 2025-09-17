//Given an array, find all pairs that sum up to a specific target.
//Given an array, find all pairs that sum up to a specific target.
//1. Does it mean a list of two numbers?
//2. Do the indices need to be contiguous?
//3. Do the indices need to be distinct?
//4. What about duplicates?


public List<int[]> findPairs(int[] nums,int target){
  int n=nums.length;
  List<int[]> list=new ArrayList<>();
  if(n<2){
      return list;
  }
  
  Map<Integer,Integer> map=new HashMap<>();
  for(int i=0;i<n;i++){
      int other=target-nums[i];
      //map.add(nums[i],i); considering self-paired 
      if(map.containsKey(other)){
          list.add(new int[]{other,nums});
      }
      map.put(nums[i],i);
  }
  return list;
}


//time complexity 
//o(n)
//space complexity 
//o(n)
 
public List<int[]> findPairs(int[] nums,int target){
  int n=nums.length;
  List<int[]> list=new ArrayList<>();
  if(n<2){
      return list;
  }
  
  Set<Integer> set=new HashSet<>();
  for(int i=0;i<n;i++){
      int other=target-nums[i];
      if(set.contains(other)){
          list.add(new int[]{other,nums});
      }
      set.add(nums[i]);
  }
  return list;
}

//time complexity 
//o(n)
//space complexity 
//o(n)		

 



