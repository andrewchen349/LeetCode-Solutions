class Solution {
    public int numberOfSubstrings(String s) {
       int left = 0;
       int count = 0;
    
       HashMap<Character, Integer> map = new HashMap<>();
       for(int right = 0; right < s.length(); right++){
           //Expanding window
           if(map.containsKey(s.charAt(right))){
               map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
           }
           else{
               map.put(s.charAt(right), 1);
           }
           
           //Found substring that meets condition"
           while(map.size() == 3){
              //close the window
              map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
              
               //Remove mapping aka closing the window
              if(map.get(s.charAt(left)) == 0){
                map.remove(s.charAt(left));
              }
              left += 1;
           }
           count += left;
       }
        return count; 
    }
}