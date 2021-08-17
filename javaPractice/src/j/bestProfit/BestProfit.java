package j.bestProfit;

import java.util.Arrays;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * Find the maximum profit you can achieve. You may complete as many transactions as you like
 * (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 */
public class BestProfit {
    public static void main(String[]args){

        int[] prices = {2,6,5,10};
        int k = 0;
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices){

        int l = prices.length;

        int[] results = new int[100];
        int result=0;
        int r = 0;
     //   for(int r=0;r<results.length;r++){
            for(int i=0;i<l;i++){
                for(int j=i+1;j<l;j++){
                    if(prices[j]-prices[i]>result){
                        result = prices[j]-prices[i];
                        results[r]=result;
                        r++;
                        result=0;
                    }
                }
            }
      //  }
        Arrays.sort(results);
        return 0;
    }
}

