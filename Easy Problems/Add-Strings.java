class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();

        //Create Pointers
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        int carry = 0;

        while( p1 >=0 || p2 >= 0){
            int sum = carry;

            if(p1 >= 0){
                sum += num1.charAt(p1) - '0';
                p1--;
            }

            if(p2 >= 0){
                sum += num2.charAt(p2) - '0';
                p2--;
            }

            result.append(sum % 10);
            carry = sum / 10;
        }

        //Check Last Carry
        if( carry != 0){
            result.append(carry);
        }

        return result.reverse().toString();

    }
}
