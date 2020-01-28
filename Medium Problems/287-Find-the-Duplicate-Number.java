class Solution {
    public int findDuplicate(int[] nums) {

        //Edge Case
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);


        int slow = 0;
        int fast = 1;

        while( fast < nums.length){
            if(nums[slow] == nums[fast]){
                return nums[slow];
            }
            else{
                slow++;
                fast++;
            }
        }

        return 0;



    }
}
