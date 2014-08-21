public class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        int N = prices.length - 1;
        for(int i=0; i<N; i++) {
            if(prices[i+1]>prices[i]) {
                total += prices[i+1] - prices[i];
            }
        }
        return total;
    }
}
