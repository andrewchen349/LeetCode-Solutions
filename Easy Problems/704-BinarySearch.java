class Solution {
    public int search(int[] nums, int target) {

       int start = 0;
       int middle;
       int end = nums.length - 1;


       while( start <= end){
           middle = (start + end) / 2;
           if( target == nums[middle]){
               return middle;
           }
           if( target > nums[middle]){
               start = middle + 1;
           }
           if( target < nums[middle]){
               end = middle - 1;
           }
       }

       return -1; //Nothing found



    }
}
