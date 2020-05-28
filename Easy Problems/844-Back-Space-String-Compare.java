class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        //Edge Cases
        //both empty
        if(S.length() == 0 && T.length() == 0){
            return true;
        }
        //One is empty, one is not
        if(S.length() != 0 && T.length() == 0){
            return false;
        }
        //One is empty one is not
        if(S.length() == 0 && T.length() != 0){
            return false;
        }
        
        //Intialize two stack, one for each string, S and T
        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();
        
        //Add to Stack
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) != '#'){
                s.push(S.charAt(i));
            }
            if(S.charAt(i) == '#' && !s.isEmpty()){
                s.pop();
            }
        }
        
        for(int i = 0; i < T.length(); i++){
            if(T.charAt(i) != '#'){
                t.push(T.charAt(i));
            }
            if(T.charAt(i) == '#' && !t.isEmpty()){
                t.pop();
            }
        }
        
        //Compare stack
        while(!s.isEmpty() && !t.isEmpty()){
            if(s.peek() == t.peek()){
                s.pop();
                t.pop();
            }
            else{
                return false;
            }
        }
        
        //If Empty, that means equal string
        if(s.isEmpty() && t.isEmpty()){
            return true;
        }
        
        //Not equal string
        return false;
        
    }
}