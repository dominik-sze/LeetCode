public class Solution {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        if(N==0 || N==1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        int maxSoFar = 0;
        for(int i=1; i<N; i++) {
            maxSoFar = Math.max(0, prices[i] - minPrice);
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(maxSoFar, maxProfit);
        }
        return maxProfit;
    }
}
