public class Solution{

    //Helper Function
    public boolean matchHelper(char c, char c2){
        if(c == '(' && c2 == ')'){
            return true;
        }

        if(c == '[' && c2 == ']'){
            return true;
        }

        if(c == '{' && c2 == '}'){
            return true;
        }
        return false;
    }

    public boolean Balance( String s){

        //Make a New stack
        Stack<Character> s = new Stack<>();

        //Traverse through the String
        for( int i = 0; i < s.length(); i++){
            //Check for Opening Parenthesis
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                s.push(s.charAt(i));
            }

            //Handle Close Parenthesis Case
            if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'){
                //If Stack is Empty That Means Ending Parenthesis Does Not Have Closing Pair
                if(s.isEmpty()){
                    return false;
                }
                else if (!matchHelper(s.pop(), s.charAt(i))){
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
