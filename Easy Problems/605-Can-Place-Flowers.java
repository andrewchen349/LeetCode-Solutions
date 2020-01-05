class Solution {

    int counter = 0;
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed == null){
            return false;
        }

        if(flowerbed[0] == 0 && flowerbed.length == 1){
            if(n == 1 || n == 0){
                return true;
            }
            else{
                return false;
            }
        }

        //Handle First and Last Index Cases
        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            counter++;
            flowerbed[flowerbed.length - 1] = 1;

        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            counter++;
            flowerbed[0] = 1;
        }

        for(int i = 1; i < flowerbed.length - 1; i++){
            if(flowerbed[i] == 0 && flowerbed[i - 1] != 1 && flowerbed[i+1] != 1){
                counter++;
                flowerbed[i] = 1;
            }
        }

        if(counter >= n){
            return true;
        }
        return false;

    }
}
