class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return "";
        }
        
        StringBuilder res = new StringBuilder();
        
        //Sort the Array, most different first
        Arrays.sort(strs);
        
        char [] a = strs[0].toCharArray();
        char [] b = strs[strs.length-1].toCharArray();
        
        for(int i = 0; i < a.length; i++){
            if( b[i] == a[i] ){
                res.append(a[i]);
            }
            else{
                return res.toString();
            }
        }
        
        return res.toString();
        
        
    }
}