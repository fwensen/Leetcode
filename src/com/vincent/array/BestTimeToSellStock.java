package com.vincent.array;

/**
 * Created by vincent on 2016/5/11.
 * problem: Say you have an array for which the ith element
 *              is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction
 *  (ie, buy one and sell one share of the stock),
 *  design an algorithm to find the maximum profit.
 *
 */
public class BestTimeToSellStock {

    //another faster solution
    public int maxProfit2(int[] prices) {
        // The trivial case.
        if (prices.length == 0)
            return 0;

        // The sequence will be divided into several segments, such that the first element
        // (which is the variable p) of each segment is strictly less than the previous one.

        // Every segment (subsequence) will yield a local optimum (which is the variable maxProfit).
        int maxProfit = 0;
        int min = prices[0];
        for (int p : prices){
            if (p >= min)
                maxProfit = (p - min > maxProfit) ? p - min : maxProfit;
            else
                min = p;
        }
        return maxProfit;
    }



    public int maxProfit(int[] prices) {

        if (prices.length <= 1)
            return 0;

        int max = prices[1] - prices[0];
        int j = 1;
        while (j < prices.length) {

            // like this: 1, 4,6,7,8,9, after this process, get ths max value
            while (((j + 1) < prices.length) && (prices[j + 1] >= prices[j])) {
                j++;
            }
            for (int i = 0; i < j; i++) {
                    int tmp = prices[j] - prices[i];
                    if (tmp > max) {
                        max = tmp;
                    }
                }
            // like this: 6,5,4,3,2   skip the minvalue
            while (((j + 1) < prices.length) && (prices[j + 1] < prices[j])) {
                j++;
            }

            j++;
        }
        return max > 0 ? max : 0;
    }

    public  static  void main(String[] args) {
        BestTimeToSellStock btss = new BestTimeToSellStock();
        int [] prices = {1,2,3,4,5,6,7,8,9};
        int result = btss.maxProfit(prices);
        System.out.println(result);
    }
}
