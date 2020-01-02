class Solution {
    public int arrangeCoins(int n) {

        int counterRow = 1;
        while( n != 0){
            if( n >= counterRow ){
                n =  n - counterRow;
                counterRow++;
            }
            else{
                return counterRow - 1;
            }

        }

        return counterRow - 1;

    }
}
