class Solution {
    public int longestPalindrome(String s) {

        int[] char_count = new int[128];

        for(char c : s.toCharArray()){
            char_count[c]++;
        }

        int result = 0;
        for(int i : char_count){
            result = (result) + ((i / 2) * 2);
            if( result % 2 == 0 && i % 2 == 1){
                result += 1;
            }
        }

        return result;

    }
}
