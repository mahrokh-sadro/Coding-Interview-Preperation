//Identify the second largest element in the array.


//second largest in the sorted, nit distinct
public int findSecondLargest(int[] nums){
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int num:nums){
        pq.add(num);
        
        if(pq.size()>2){
            pq.poll();
        }
    }
    
    return pq.peek();
}

//time complexity 
//o(n)
//space complexity 
//o(1)
 

 