class Solution {
    //Time Complexity: O(N^2), Space Complexity: O(1)
    int count = 0;
    public int countSubstrings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        for(int i = 0; i < s.length(); i++){
            search(s, i, i);
            search(s, i, i + 1);
        }
        return count;
        
    }
    private void search(String s, int left, int right){
        if(s == null || left > right){
            return;
        }
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count += 1;
            left -= 1;
            right += 1;
        }
    }
}