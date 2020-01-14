class Solution {

    public boolean helper(String s, int i, int r){
        while(i < r){
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            i++;
            r--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0;
        int r = s.length() - 1;
        int counter = 0;

        //Base Case
        if(s.length() == 0 || s == null){
            return true;
        }

        while (i < r){
            while( i < r && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while( i < r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }

            if(!(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(r)))){
                return helper(s, i+1, r) || helper(s, i, r-1);
            }

            i++;
            r--;

        }

        return true;

    }
}
