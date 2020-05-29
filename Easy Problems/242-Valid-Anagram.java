class Solution {
    public boolean isAnagram(String s, String t) { 
        if(s.length() > t.length() || t.length() > s.length()){
            return false;
        }
        
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         for(int i = 0; i < s.length(); i++){
//             if(map.containsKey(s.charAt(i))){
//                 map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//             }
//             else{
//                 map.put(s.charAt(i), 1);
//             }
//         }
        
//         for(int i = 0; i < t.length(); i++){
//             if(!map.containsKey(t.charAt(i))){
//                 return false;
//             }
//             if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) == 0){
//                 return false;
//             }
//             else{
//                 map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
//             }
//         }
        
//         return true;
        
        //Faster Solution
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            
            //Ofsetting by A gets u to correct letter corresponding with the index in count, increment when we see letter
            count[s.charAt(i) - 'a']++;
            
            //decrement when we see letter in other string
            count[t.charAt(i) - 'a']--;
        }
        
        //if its anagram, letter count shold be same so count should be array of zeros, if not return false
        for(int i : count){
            if(i != 0){
                return false;
            }
        }
        
        //is anagram
        return true;
    }
}