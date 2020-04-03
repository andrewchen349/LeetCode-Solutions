class Solution {
    public int compress(char[] chars) {
        int p = 0;
        int len = 0;

        while(p < chars.length){
            char curr = chars[p];
            int count = 0;
            while( p < chars.length && curr == chars[p]){
                p+=1;
                count += 1;
            }

            chars[len++] = curr;
            if(count != 1){
                for(char c : Integer.toString(count).toCharArray())
                    chars[len++] = c;
            }
        }
        return len;
    }
}
