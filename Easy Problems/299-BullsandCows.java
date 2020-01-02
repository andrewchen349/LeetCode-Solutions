class Solution {
    public String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;

        HashMap<Character, Integer> pass = new HashMap<>(); //Creates a new HashMap;

        //Check Bulls
        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls += 1;

            }
            else{
                if(pass.containsKey(secret.charAt(i))){
                    int freq = pass.get(secret.charAt(i));
                    freq += 1;
                    pass.put(secret.charAt(i), freq);
                }
                else{
                    pass.put(secret.charAt(i), 1);
                }
            }
        }

        //Check Cows
        for(int i = 0; i < secret.length(); i++){
            //Check if its a bull
            if(secret.charAt(i) != guess.charAt(i)){
                //Check if Char exist in Secret
                if(pass.containsKey(guess.charAt(i))){
                    cows += 1;
                    if(pass.get(guess.charAt(i)) == 1){
                        pass.remove(guess.charAt(i));
                    }
                    else{
                        int freq = pass.get(guess.charAt(i));
                        freq--;
                        pass.put(guess.charAt(i), freq);
                    }
                }
            }
        }


        return bulls + "A" + cows + "B";

    }
}
