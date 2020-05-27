class Solution {
    public String removeDuplicates(String S) {
        
        Stack<Character>stack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty()){
                stack.add(S.charAt(i));
            }
            else if(!stack.isEmpty() && stack.peek() != S.charAt(i)){
                stack.add(S.charAt(i));
            }
            else{
                stack.pop();
            }
            
        }
        
        StringBuilder res = new StringBuilder();
        
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        
        return res.reverse().toString();
        
    }
}