// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        if(n==1){
           return;
        }

        int l=0;
        int r=n-1;

        while(l<r){
            char ch=s[l];
            s[l]=s[r];
            s[r]=ch;
            l++;
            r--;
        }

        

    }
}


//Time: O(n)

//Space: O(1)