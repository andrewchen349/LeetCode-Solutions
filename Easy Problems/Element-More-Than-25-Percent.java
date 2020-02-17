class Solution {
    public int findSpecialInteger(int[] arr) {

        //Edge Cases
        if(arr.length == 1){
            return arr[0];
        }

        double target =  arr.length * .25;

        int real = (int) target;

        int counter = 0;

        int slow = 0;
        int fast = 1;

        while( slow != fast && slow < arr.length && fast < arr.length){
            if(arr[slow] == arr[fast]){
                counter++;
                slow += 1;
                fast +=1;
            }
            else{

                //Check if counter equals target
                if(counter >= target){
                    return arr[slow];
                }
                else{
                    counter = 0;
                    slow++;
                    fast++;
                }
            }



        }

        return arr[slow];



    }
}
