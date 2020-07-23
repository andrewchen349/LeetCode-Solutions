class Solution {
    //Time Complexity; O(Aa + Bb), Space Complexity: O(26) = O(1)
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();
        
        //Get Max freq of characters from each string in B[]
        int[] maxBFreq=new int[26];
        for(String b : B){
            int[] charFreq=getCharFreq(b);
            for(int j = 0; j < 26; j++){
                maxBFreq[j]=Math.max(maxBFreq[j], charFreq[j]);
            } 
        }
        
        //Traverse A get freq of characters for each word
        int[] maxAFreq=new int[26];
        for(String a : A){
            boolean canAdd = true;
            int[] charFreq = getCharFreq(a);
            for(int i = 0; i < charFreq.length; i++){
                if(maxBFreq[i] > charFreq[i]){
                    canAdd = false;
                    break;
                }
            }
            if(canAdd == true){
                result.add(a);
            }
            
        }
        return result;   
    }
    
    public int[] getCharFreq(String s){
        int res[]=new int[26];
        for(char c:s.toCharArray()){
            res[c-'a']++;
        }
        return res;
    }
}