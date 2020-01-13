public class Solution {
    public boolean isPalindrome(String s) {

        //Base Case
        if(s.length() == 0 || s == null){
            return true;
        }

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer){
            while( leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }
            while( leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }

            if( leftPointer < rightPointer && !(Character.toLowerCase(s.charAt(leftPointer)) == Character.toLowerCase(s.charAt(rightPointer)))){
                return false;
            }
            else{
                leftPointer++;
                rightPointer--;
            }

        }

        return true;

    }
}
