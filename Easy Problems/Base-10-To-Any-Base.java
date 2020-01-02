public class Solution{
    public String conversion(int num, int baseTo){

        //Create a Stack
        Stack<Integer> s = new Stack<>();
        while(num >= baseTo){
            stack.push(num % baseTo); //Store the Right Digit
            num = num / 10; //Decrease Num
        }

        String result = new String("" + num);
        while(!s.isEmpty()){
            result = result + s.pop(); //Pop digit and add it to result
        }

        return result;
    }
