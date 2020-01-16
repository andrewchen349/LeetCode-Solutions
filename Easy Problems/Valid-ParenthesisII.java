class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        //corner case: string must always contain even number of chars
        //open and closing brace, 1 brace will never get pushed into the stack so
        //the stack will always be empty.. isEmpty() == true
        if(s.length() % 2 != 0){
            return false;
        }


        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);

            }
            else if(!stack.isEmpty() && c == ')' && stack.peek() == '('){
                stack.pop();
            }
             else if(!stack.isEmpty() && c == '}' && stack.peek() == '{'){
                stack.pop();
            }
             else if(!stack.isEmpty() && c == ']' && stack.peek() == '['){
                stack.pop();
            }
        }

//if the stack is empty, then we have matched every bracket with its corresponding brace
        return stack.isEmpty();

    }
}
