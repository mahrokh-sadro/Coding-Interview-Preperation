// Find Min and Max

public int[] findMinAndMax(int[] arr){
   int n=arr.length;
   if(n==0){
       return new int[0];
   }
   if(n==1){
       return new int[]{arr[0],arr[0]};
   }
   
   int min=Integer.MAX_VALUE;
   int max=Integer.MIN_VALUE;
   
   for(int num:arr){
       min=Math.min(min,num);
       max=Math.max(max,num);
   }
   
   return new int[]{min,max};
   
}