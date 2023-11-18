public class ar_bestTimeToBuyAndSellStock {
    // brute force approach:= use nested loop to calculate profit for each element
    // and store the maxprofit TC: O(n^2)
    // better appracoh is use another array to store min price so far and subtract
    // it from each element and store the max profit. TC: O(n) SC:O(n)

    // optimized
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        int minA[] = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(prices[i] - min, maxProfit);
        }
        return maxProfit;

    }
}
