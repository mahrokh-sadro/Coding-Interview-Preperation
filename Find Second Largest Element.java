//Find Second Largest Element

public static int findSecondLargest(int[] arr){
         int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num>max){
                second=max;
                max=num;
            }
            else if(num>second && num<max){
                second=num;
            }
        }
        
        return second;
    }