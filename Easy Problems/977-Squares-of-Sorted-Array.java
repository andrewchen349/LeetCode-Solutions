class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            int temp = A[i];
            A[i] = temp * temp;
        }
        Arrays.sort(A);
        return A;
    }
}
