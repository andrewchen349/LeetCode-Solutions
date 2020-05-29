class Solution {
    public String reverseWords(String s) {
        
        //Edge Case
        if(s.length() == 0){
            return s;
        }
        
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            //If char is not space, then we have a word
            if(s.charAt(i) != ' '){
                stack.push(s.charAt(i));
            }
            
            //Else we have a word
            else{
                //Empty Stack to reverse
                while(!stack.isEmpty()){
                    builder.append(stack.pop());
                }
                //Add Space
                builder.append(' ');
            }
        }
        
        //Handle Last Word
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        
        //Convert to String
        return builder.toString();
        
    
    }
}