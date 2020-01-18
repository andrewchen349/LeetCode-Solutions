class Solution {
    public void moveZeroes(int[] nums) {

        int moves = 0;
        int count = 0;
        int end = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                moves += 1;
                count += 1;
            }
            else{
                nums[i - moves] = nums[i];
            }
        }

        //Put Zeros At The End
        int i = 0;
        while(i < count){
            nums[end] = 0;
            i++;
            end--;
        }

    }
}
