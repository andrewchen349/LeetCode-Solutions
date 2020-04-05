class Solution {
    public int countBinarySubstrings(String s) {

        int res = 0;
        int curr = 1;
        int prev = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr += 1;
            }
            else{
                prev = curr;
                curr = 1;
            }
            if(prev >= curr){
                res += 1;
            }
        }

        return res;

    }
}
