class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        //Add all stones weight to the maxHeap
        for(int i : stones){
            maxHeap.add(i);
        }
        
        //While maxHeap is more or equal to two we want to keep grabbin gthe top 2 element
        while(maxHeap.size() >= 2){
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            
            //If x!= y we add the difference y-x back to the heap, else we dont do anything
            if(x != y){
                maxHeap.add(y - x);
            }
        }
        
        //Case if no stone is left
        if(maxHeap.size() == 0){
            return 0;
        }
        
        //Case if one stone is left
        return maxHeap.poll();
        
    }
}