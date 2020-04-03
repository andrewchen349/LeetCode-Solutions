class Solution {
    public boolean buddyStrings(String A, String B) {

        //Unequal Length Strings is not a Buddy
        if(A.length() != B.length()){
            return false;
        }

        //Take Care of Equal String
        if(A.equals(B)){
            HashSet<Character> hash = new HashSet<>();
            for(char c : A.toCharArray()){
                hash.add(c);
            }
            if(hash.size() < A.length()){
                return true;
            }
            return false;
        }

        //Take Care of Unique String
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 0;

        while( a < A.length() && b < B.length()){
            if(A.charAt(a) != B.charAt(b)){
                list.add(a);
            }
            a += 1;
            b += 1;
        }

        //Edge Case
        if(list.size() > 2 || (A.charAt(list.get(0)) != B.charAt(list.get(1)) || B.charAt(list.get(0)) != A.charAt(list.get(1)))){
            return false;
        }
        return true;


    }

}
