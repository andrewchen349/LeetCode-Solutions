class Solution {
    public boolean checkIfExist(int[] arr) {

        if(arr == null){
            return false;
        }


        //Sort the Array
        Arrays.sort(arr);

        //Make HashMap
        HashMap<Integer, Integer> map = new HashMap<>();


        //Two Pointers
        int slow = 0;
        int fast = arr.length - 1;

        while(slow < arr.length && fast > 0 ){
            int toCheck = arr[slow] * 2;
            if(arr[fast] == toCheck || map.containsKey(toCheck)){
                return true;
            }
            fast--;
            if(slow == fast && slow != arr.length - 1){
                map.put(arr[slow], slow);
                slow++;
                fast = arr.length - 1;
            }

        }

        return false;



    }
}
