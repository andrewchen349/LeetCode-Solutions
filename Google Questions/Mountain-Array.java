class Solution {

    public boolean validMountainArray(int[] A) {

        if( A.length < 3 || A == null){
            return false;
        }

        int i = 0;
        // Check if Increasing
        while( i < A.length && i + 1 < A.length && A[i] < A[i+1]){
            i++;
        }

        //Corner Case if i reach last element
        if( i == A.length - 1){
            return false;
        }

        //Now Pointer i should be at the dec point of A
        if( i == 0 || i+1 > A.length || i > A.length){
            return false;
        }

        //Check if Decreasing
        while( i < A.length && i + 1 < A.length){
            if(A[i] <= A[i + 1]){
                return false;
            }
            i++;
        }

        return true;
    }
}
