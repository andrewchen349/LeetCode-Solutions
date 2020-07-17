class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Base Case
        if(s == null || s.length() == 0){
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int max = 0;
        int p = 0;
        int p2 = 0;
        
        while(p2 < s.length()){
            if(!map.containsKey(s.charAt(p2))){
              map.put(s.charAt(p2), p2);
              p2 += 1;
              max = Math.max(max, map.size());
            }
            else{
               map.remove(s.charAt(p));
               p += 1;
            }
        }
        return max;
        
    }
}