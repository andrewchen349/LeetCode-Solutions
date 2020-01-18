class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();

        if(nums == null || nums.length == 0){
            return result;
        }

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : nums){
            set.add(i);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }

        return result;


    }
}
