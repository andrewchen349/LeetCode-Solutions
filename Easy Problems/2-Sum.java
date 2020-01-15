class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums == null){
            return nums;
        }

        Map<Integer,Integer> map = new HashMap<>();
        int[] results = new int[2];


        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                results[0] = i;
                results[1] = map.get(diff);
                System.out.print(results[1]);
                return results;
            }
            map.put(nums[i], i);
        }

        return results;

    }
}
