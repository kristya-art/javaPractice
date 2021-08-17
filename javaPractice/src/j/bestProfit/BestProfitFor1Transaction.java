package j.bestProfit;

import java.util.Arrays;
public class BestProfitFor1Transaction {
    public static void main(String[]args) {
        int[] prices = {1,3,7,2,10};

        System.out.println(bestProfit(prices));

    }

    public static int bestProfit(int[] prices){
        int l = prices.length;

        int profit = 0;

        for(int i=0;i<l;i++){
            for(int j= i+1;j<l;j++){
                if((prices[j]-prices[i])>profit){
                    profit=prices[j]-prices[i];
                }
            }
        }

        return profit;
    }
}
