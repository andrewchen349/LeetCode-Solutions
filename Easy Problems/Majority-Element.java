class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maj = nums.length / 2;
        int result = 0;

        //Put Key Bindings Into Map
        for(int i : nums){
            map.put(i , 0);
        }

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count += 1;
                map.replace(nums[i], count);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) > maj){
                    return nums[i];
                }
            }
        }

        return result;


    }
}
