import java.util.Arrays;
import java.lang.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //Edge Cases
        if(nums == null){
            return false;
        }
        if(nums.length == 1){
            return false;
        }


       HashMap<Integer, Integer> hash = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
           if(hash.containsKey(nums[i])){
               int diff = Math.abs(hash.get(nums[i]) - i);
               if( diff <= k){
                   return true;
               }
           }
           hash.put(nums[i], i);

       }
        return false;



    }
}
