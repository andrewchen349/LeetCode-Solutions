class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return result;
        }

        Arrays.sort(nums);

        for( int i = 0; i < nums.length - 2; i++){

            //Handles Duplciates
            if((i == 0) || (nums[i] != nums[i - 1])){
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];
                while( left < right){

                    if(nums[left] + nums[right] == sum){
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        if(nums[left] == nums[left + 1] && left < right){
                            left++;
                        }

                        if(nums[right] == nums[right - 1] && left < right){
                            right--;
                        }

                    }

                    right--;
                    if(left == right){
                        left++;
                        right = nums.length - 1;
                    }
                }
            }
        }

        //Remove Duplicates
        HashSet<List<Integer>> set = new HashSet<>();

        set.addAll(result);

        result.clear();
        result.addAll(set);

        return result;

    }
}
