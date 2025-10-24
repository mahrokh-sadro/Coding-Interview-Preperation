// Check if Array is Sorted

public boolean isSorted(int[] arr){
    int n=arr.length;
    if(n<2){
        return true;
    }
    
    for(int i=1;i<n;i++){
        if(arr[i-1]>arr[i]) return false;
    }
    return true;
}
