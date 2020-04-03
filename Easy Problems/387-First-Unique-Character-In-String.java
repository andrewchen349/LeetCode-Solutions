class Solution {
    public int firstUniqChar(String s) {

        //Edge Cases
        if(s.length() == 0){
            return -1;
        }
        if(s.length() == 1){
            return 0;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int pointer = 0;
        while(pointer < s.length()){
            if(!hashMap.containsKey(s.charAt(pointer))){
                hashMap.put(s.charAt(pointer), 1);
                pointer += 1;
            }
            else{
                int temp = hashMap.get(s.charAt(pointer));
                hashMap.replace(s.charAt(pointer), temp, temp + 1);
                pointer += 1;
            }

        }

        for(int i = 0; i < s.length(); i++){
            if(hashMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

    }
}
