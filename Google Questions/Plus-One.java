class Solution {
    public int[] plusOne(int[] digits) {

        //Edge Case
        if( digits == null){
            return digits;
        }

        if(digits.length == 1){
            int temp = digits[0];
            if( temp == 9){
                int [] result = new int[2];
                result[1] = 0;
                result[0] = 1;
                return result;
            }
            temp += 1;
            digits[0] = temp;
            return digits;
        }

        int pointer = digits.length - 1;
        int carry = digits.length - 2;

        while( pointer > 0){
            int temp = digits[pointer];

            //Check For Carry
            if(temp == 9){
                digits[pointer] = 0;
                while( digits[carry] == 9 && carry - 1 >= 0){
                    digits[carry] = 0;
                    carry--;
                }

                int temp2 = digits[carry];
                digits[carry] = temp2 += 1;
                if(digits[carry] == 10){
                    digits[carry] = 0;
                    int[] result = new int[digits.length + 1];
                    result[carry] = digits[carry] + 1;
                    for(int i = carry + 1; i < result.length - 1; i++){
                        result[i] = digits[i];
                    }
                    return result;
                }
                return digits;
            }

           else{
               digits[pointer] = temp += 1;
               return digits;
           }

      }

        return digits;

    }
}
