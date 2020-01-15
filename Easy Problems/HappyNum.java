class Solution {


    public int square(int n ){
        int sum = 0;

        while(n > 0 ){
            int num = n % 10;
            sum += num * num;
            n = n / 10;
        }

        return sum;
    }


    public boolean isHappy(int n) {

        //Base Case
        if(n == 1){
            return true;
        }

        int counter = 0;
        while(n != 1){

            if(counter == 20){
                break;
            }

            int temp = n;
            n = square(temp);
            if( n == 1){
                return true;
            }
            counter++;
        }
        return false;
    }
}
