class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        int pointer = nums.length - 1;
        while(pointer >= 0){
            if(k == 1){
                return nums[pointer];
            }
            else{
                pointer--;
                k--;
            }
        }

        return nums[pointer];

    }
}
