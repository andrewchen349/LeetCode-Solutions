class Solution {
    public int maxProfit(int[] prices) {

        //Edge Case for Null Array
        if(prices == null || prices.length <= 1){
            return 0;
        }

        //Turn into ArrayList
        //List<Integer> priceList = Arrays.asList(prices);
        List<Integer> priceList = new ArrayList<Integer>(prices.length);
        for(int i : prices){
            priceList.add(i);
        }

        int diff = 0;
        for(int i = 0; i < priceList.size(); i++){
            int max = Collections.max(priceList.subList(i, priceList.size()));
            if(diff < (max - priceList.get(i))){
                diff = (max - priceList.get(i));
            }
        }

        return diff;

    }
}
