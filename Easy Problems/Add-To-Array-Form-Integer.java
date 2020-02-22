class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {

        int pointer = A.length - 1;
        int carry  = 0;

        List<Integer> result = new ArrayList<Integer>();

        while(pointer >= 0){
            if(carry == 0){
                int toAdd = K % 10;
                K/=10;
                int total = (A[pointer] + toAdd);
                int sum = (A[pointer] + toAdd) % 10;
                result.add(sum);
                carry = total / 10;
                pointer--;
            }

            else if(carry != 0){
                int toAdd = K % 10;
                K/=10;
                int total = (A[pointer] + toAdd + carry);
                int sum = (A[pointer] + toAdd + carry) % 10;
                result.add(sum);
                carry = total / 10;
                pointer--;
            }
        }
        while(K != 0){
            result.add((K % 10 + (carry)) % 10);
            carry = (K % 10 + (carry)) / 10;
            System.out.println(carry);
            K/= 10;
        }

        if(carry != 0){
            result.add(carry);
        }

        Collections.reverse(result);
        return result;

    }
}
