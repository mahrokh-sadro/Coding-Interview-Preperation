// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int[] product=new int[m+n];

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mud=(num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int sum=mud+product[i+j+1];
                product[i+j+1]=sum%10;
                product[i+j]+=sum/10;
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int p:product){
            if(!(sb.length()==0 && p==0)){
                sb.append(p);
            }
        }
        return sb.length() == 0?"0":sb.toString();
    }
}


//time complexity
//o(m*n)
//space complexity
//o(m+n)