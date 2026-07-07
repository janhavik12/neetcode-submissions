
class Solution {
    public int maxProfit(int[] prices) {//Input: prices = [10,1,5,6,7,1]


        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;


        for(int i=0;i<prices.length;i++){
            
                minPrice=Math.min(minPrice, prices[i]);
                int profit=prices[i]-minPrice;
                maxProfit=Math.max(maxProfit, profit);

            
        }

        return maxProfit;
    }
}