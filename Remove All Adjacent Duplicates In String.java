// You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

// We repeatedly make duplicate removals on s until we no longer can.

// Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        if(n<2){
            return s;
        }

        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek() ){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();    
        
    }
}
// time:O(n)
// space:O(n)