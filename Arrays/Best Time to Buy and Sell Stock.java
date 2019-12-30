class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++){
           if(prices[i] < buyPrice){
               buyPrice = prices[i];
           }else{
               if(prices[i] - buyPrice > maxProfit){
                   maxProfit = prices[i] - buyPrice;
               }
           }
        }

        return maxProfit;
    }
}
