class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] result = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>();

        //Edge Cases
        if( nums == null || nums.length == 0){
            return result;
        }

        int counter = 0;
        int pointer = 0;
        int i = 0;
        int t = 0;
        int accum = 1;
        int target = nums[0];

        while( counter < nums.length){

            if(pointer == nums.length){
                while(!stack.isEmpty()){
                    accum = accum * stack.pop();
                    result[i] = accum;
                }
                i += 1;
                accum = 1;
                counter += 1;
                if(counter == nums.length){
                    break;
                }
                pointer = 0;
                t++;
                target = nums[counter];

            }
            else{

                if( pointer < nums.length){
                    if(pointer == t){
                        pointer++;
                    }
                    else{
                        stack.push(nums[pointer]);
                        pointer++;
                    }
                }
            }
        }

        return result;
    }
}
