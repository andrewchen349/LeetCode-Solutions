class Solution{
    public int reverseInt(int i){

        //Edge Case For One Digit
        if(x % 10 == x){
            return x;
        }

        int result = 0;
        while( x != 0){
            int tail = x % 10;
            newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;

            //Decrement
            x = x / 10;
        }
        return result;
    }
}
