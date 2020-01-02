public class Solution{
    public String conversion(int num, int baseTo){

        //Create a Stack
        Stack<Integer> s = new Stack<>();
        while(num >= baseTo){
            stack.push(num % baseTo);
            num = num / 10;
        }

        String result = new String("" + num);
        while(!s.isEmpty()){
            result = result + s.pop();    
        }

        return result;
    }
can we change songgg
not yet tpolo goodplssssssno:((())):
