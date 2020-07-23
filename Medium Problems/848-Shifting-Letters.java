class Solution {
    //Time Complexity: O(n), Space Complexity: O(1)
    public String shiftingLetters(String S, int[] shifts) {
        if(S == null){
            return "";
        }
        StringBuilder result = new StringBuilder();
        
        //If string is length 1;
        if(S.length() == 1){
            int s = shifts[0] % 26;
            int cur = (int)S.charAt(0) + s;
            //See explanation below
            if(s > 122){
                cur = cur - 122 + (96);
            }
            result.append((char)(cur));
            return result.toString();
        }
        
        //Adjusting shift array, to proper shift numbers
        for(int i = shifts.length - 2; i >= 0; i --){
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }
        
        int s = 0;
        for(int i = 0; i < S.length(); i++){
            int cur = ((int) S.charAt(i)) + shifts[s] % 26;
            //If ascii value bigger then 122 last possible lowercase letter we subtract diff and add onto 96
            if(cur > 122){
                cur = cur - 122 + (96);
            }
            result.append((char)cur);
            s += 1;
        }
        return result.toString();

    }
}