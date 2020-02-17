class Solution{
    public String sub(String s ){
        int max = 0;
        int slow = 0;
        int fast = 1;
        int counter = 0;

        if(s.length() == 1 || s.length() == 0){
            return s;
        }

        while( slow != fast && slow < s.length() && fast < s.length()){
            if(s.charAt(slow) != s.charAt(fast)){
                counter += 1;
            }
            if(s.charAt(slow) == s.charAt(fast)){
                if(counter > max){
                    max = counter;
                }
            }
            slow += 1;
            fast += 1;
        }

        return max;
    }
}
