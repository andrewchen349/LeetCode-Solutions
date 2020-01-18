class Solution {
    public char findTheDifference(String s, String t) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
           int count = 1;
           if(map.containsKey(s.charAt(i))){
               count = map.get(s.charAt(i));
               count += 1;
               map.replace(s.charAt(i), count);
           }
           map.put(s.charAt(i), count);
        }

        for(int i = 0; i < t.length(); i++ ){
            System.out.println(map.containsKey(t.charAt(i)));
            if(!map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }
            else if(map.get(t.charAt(i)) <= 0){
                return t.charAt(i);
            }
            else{
                int temp = map.get(t.charAt(i));
                temp -= 1;
                map.replace(t.charAt(i), temp);
            }
        }

        char res = 0;

        return res;

    }
}
