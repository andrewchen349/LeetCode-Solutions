class Solution {
    public int reverse(int x) {

        if( x == 0){
            return 0;
        }

        try{
            String resString = "";
            boolean neg = false;
            if( x < 0){
                x = x * -1;
                neg = true;
            }

            while ( x > 0){
                resString += x % 10;
                x = x /10;
            }


            //Check for Negatives
            if(neg){
                int res = Integer.parseInt(resString);
                return res * -1;
            }

            return Integer.parseInt(resString);
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
}
