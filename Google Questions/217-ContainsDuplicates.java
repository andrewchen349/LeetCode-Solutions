class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

            for (int i = 0; i < nums.length - 1; i++){
                if(nums[i] == nums[i + 1]){
                    return true;
                }
            }

        //Alternative Way with HashMap
        HashMap<Integer, Integer> hash = new HashMap<>();
           for(int i = 0; i < nums.length; i++){
               if(hash.containsKey(nums[i])){
                   return true;
               }
               hash.put(nums[i],0);
           }
       return false;
