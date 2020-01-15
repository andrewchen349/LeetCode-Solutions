class Solution {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        //Traverse array, Add to Map
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], 0);
        }

        //Traverse array
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int counter = map.get(nums[i]);
                counter += 1;
                map.replace(nums[i], counter);
            }
        }

        int result = 0;
        //Search for the element With only One occurence
        for(int i = 0; i< nums.length; i++){
            if(map.get(nums[i]) == 1){
                result = nums[i];
            }
        }

        return result;
    }
}
