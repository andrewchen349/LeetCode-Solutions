class Solution {
    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        int counter = 0;
        int res = 0;
        for(int i : nums){
            if(maxHeap.contains(i)){
                continue;
            }
            else{
                 maxHeap.add(i);
            }
        }

        if(maxHeap.size() < 3){
            return maxHeap.remove();
        }

        while(maxHeap.size() > 0){
            maxHeap.remove();
            counter += 1;

            if(counter == 2){
                res = maxHeap.remove();
            }
        }
        return res;

    }
}
