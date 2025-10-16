//Reverse String with Stack

    public void reverseString(char[] s) {
        int n=s.length;
        if(n<2){
            return;
        }
        
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            stack.push(ch);
        }
        
        for(int i=0;i<n;i++){
            s[i]=stack.pop();
        }
    }
    
// Time: O(n)
// Space: O(n)