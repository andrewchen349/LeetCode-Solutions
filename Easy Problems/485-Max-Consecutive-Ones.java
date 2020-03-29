class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int p1 = 0;

        int counter = 0;
        int res = 0;


        while( p1 < nums.length){
            if(nums[p1] == 1){
                counter += 1;
            }
            if(nums[p1] == 0 || p1 + 1 == nums.length){
                if(counter > res){
                    res = counter;
                }
                counter = 0;
            }
            p1 += 1;
        }
        return res;
    }
}
