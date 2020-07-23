class Solution {
    //Time Complexity: O(n^2), SpaceComplexity: O(1)
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            int startFromMid = expandFromMiddle(s, i, i);
            int startFromTwo = expandFromMiddle(s, i, i + 1);
            int len = Math.max(startFromMid, startFromTwo);
            
            if(len > (end - start)){
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandFromMiddle(String s, int left, int right){
        if(left > right || s == null){
            return 0;
        }
        
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left -= 1;
            right += 1;
        }
        return right - left - 1;
    }
}