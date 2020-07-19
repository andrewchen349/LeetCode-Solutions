class Solution {
    public int maxVowels(String s, int k) {
        //TimeComplexity : O(n), SpaceComplexity O(1)
        int max = 0;
        if(s == null){
            return max;
        }
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            //If we see a vowel we increment
            if(vowels.contains(s.charAt(i))){
                counter += 1;
            }
            
            //Sliding window, we only need to check if we are leaving a vowel, then decrement
            if(i >= k && vowels.contains(s.charAt(i - k))){
                counter -= 1;
            }
            
            //Get the max
            max = Math.max(counter, max);
        }
        return max;
    }
}