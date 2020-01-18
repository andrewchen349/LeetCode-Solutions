class Solution {
    public int findPeakElement(int[] nums) {

        if( nums == null || nums.length == 0){
            return 0;
        }

        List<Integer> temp = new ArrayList<Integer>();

        for(int i : nums){
            temp.add(i);
        }

        Arrays.sort(nums);
        int largest = nums[nums.length - 1];

        int result = 0;
        for (int i = 0; i < temp.size(); i++){
            if(temp.get(i) == largest){
                result = i;
                return result;
            }
        }

        return result;

    }
}
