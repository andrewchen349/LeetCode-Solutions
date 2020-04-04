class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        int p = a.length() - 1;
        int p2 = b.length() - 1;

        int carry = 0;
        while(p >= 0 || p2 >= 0){
            int sum = carry;
            if(p >= 0){
                sum += a.charAt(p) - '0';
                p -= 1;
            }
            if(p2 >= 0){
                sum += b.charAt(p2) - '0';
                p2 -= 1;
            }

            if(sum == 3){
                res.append(1);
                carry = 1;
            }
            if(sum == 2){
                res.append(0);
                carry = 1;
            }
            if(sum == 1){
                res.append(1);
                carry = 0;
            }
            if(sum == 0){
                res.append(0);
                carry = 0;
            }

        }

        //Check Last Carry
        if( carry != 0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
