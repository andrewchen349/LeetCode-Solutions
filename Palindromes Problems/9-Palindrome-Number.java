public class Solution {
    public boolean isPalindrome(int x) {

        //Base Case
        if(x == 0){
            return true;
        }

        //Handle Neg and Mutiples of 10
        if( x < 0 || x % 10 == 0){
            return false;
        }

        int reverseInt = 0;
        while( x > reverseInt){
            int lastDigit = x % 10;
            x = x / 10;
            reverseInt = (reverseInt * 10) + lastDigit;
        }

        if(x == reverseInt || x == reverseInt / 10){
            return true;
        }

        return false;


    }
}
