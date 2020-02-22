class Solution {
    public int pivotIndex(int[] nums) {

        //Edge Case
        if(nums == null || nums.length == 0){
            return -1;
        }

        int sum = 0;
        int leftSum = 0;

        //Find Total Sum
        for(int x : nums){
            sum += x;
        }

        for(int i = 0; i < nums.length; i++){
            if(sum - leftSum - nums[i] == leftSum ){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
