class Solution {
    //Time Complexity: O(n^2), Space Complexity=O(1)
    public int numTeams(int[] rating) {
        if(rating == null){
            return 0;
        }
        int result = 0;
        for(int i = 1; i < rating.length; i++){
            int[] less = new int[2];
            int[] greater = new int[2];
            
            for(int j = 0; j < i; j++){
                if(rating[j] < rating[i]){
                    less[0]++;
                }
                else{
                    greater[0]++;
                }
            }
            
            for(int t = i + 1; t < rating.length; t++){
                if(rating[t] > rating[i]){
                    less[1]++;
                }
                else{
                    greater[1]++;
                }
            }
            result += (less[0] * less[1]) + (greater[0] * greater[1]);
        }
        return result;
    }
}