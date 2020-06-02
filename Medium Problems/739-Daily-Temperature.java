class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        
        if(T == null){
            return result;
        }
        
        Stack<Integer> days = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int ptr = T.length - 1;
        while(ptr >= 0){
            //No Days in Stack
            if(days.isEmpty()){
                days.push(T[ptr]);
                map.put(T[ptr], ptr);
                result[ptr] = 0;
                ptr -= 1;    
            }
            //Temp at Day in stack is not empty
            else if (!days.isEmpty() && days.peek() <= T[ptr]){
                while(!days.isEmpty()){
                    //Trying to find a warmer day
                    if(days.peek() <= T[ptr]){
                        days.pop();
                        map.remove(T[ptr]);
                    }
                    else{
                        result[ptr] = map.get(days.peek()) - ptr;
                        days.push(T[ptr]);
                        map.put(T[ptr], ptr);
                        ptr -= 1;
                        break;
                    }
                }
                
                //We went thru the whole stack and cant find warmer day
                if(days.isEmpty()){
                    days.push(T[ptr]);
                    map.put(T[ptr], ptr);
                    ptr -= 1;
                }
            }
            else if(!days.isEmpty() && days.peek() > T[ptr]){
                result[ptr] = map.get(days.peek()) - ptr;
                days.push(T[ptr]);
                map.put(T[ptr], ptr);
                ptr -= 1;
            }
            else{
                ptr -= 1;
            }
        }
        return result;
        
    }
}
