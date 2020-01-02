class Solution {
    public String convertToBase7(int num) {

        //Base Case
        if( num == 0){
            return "0";
        }

        int numNoNeg = Math.abs(num); //Get rd of Negatives

        String result = "";

        while( numNoNeg > 0){
            result = (numNoNeg % 7) + result;
            numNoNeg = numNoNeg / 7;
        }

        if( num < 0){
            result = "-" + result;
        }

        return result;


    }
}
