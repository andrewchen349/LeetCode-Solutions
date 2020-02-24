class Solution {
    public int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];

        if(T == null){
            return result;
        }

        if(T.length == 1 ){
           result[0] = 1;
           return result;
        }

        int fast = 1;
        int slow = 0;

        while(fast < T.length && slow < T.length){
            int counter  = 0;

            if(T[fast] > T[slow]){
                counter += 1;
                result[slow] = counter;
                slow += 1;
                fast = slow + 1;
            }

            else{
                while(T[fast] <= T[slow] && fast < T.length - 1){
                    if(T[fast] > T[slow]){
                        counter++;
                        break;
                    }
                    else{
                        counter += 1;
                        fast++;
                    }
                }

                if(T[fast] > T[slow]){
                    result[slow] = counter + 1;
                    slow += 1;
                    fast = slow + 1;
                }
                else{
                    result[slow] = 0;
                    slow += 1;
                    fast = slow + 1;
                }

            }
        }

        return result;
    }
}
