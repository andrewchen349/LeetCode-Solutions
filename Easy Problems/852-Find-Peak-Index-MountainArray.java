class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
        int slow = 0;
        int fast = 1;
        
        while(slow != fast && fast < A.length){
            if(A[fast] >= A[slow]){
                slow += 1;
                fast += 1;
            }
            else{
                return slow;
            }
            
        }
        return slow;
        
    }
}