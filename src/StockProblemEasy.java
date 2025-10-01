import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StockProblemEasy {
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = prices[0];

        for(int val : prices)
        {
            if(val < minPrice)
                minPrice = val;

            int profit = val - minPrice;

            if(profit > maxProfit)
                maxProfit = profit;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        /*System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

        System.out.println(maxProfit(new int[]{2,4,1}));*/
        System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }
}
