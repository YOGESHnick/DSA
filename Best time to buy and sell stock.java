public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        int min = Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if( prices[i]<min ){
                min = prices[i];
            }
            if( prices[i]-min > max ){
                max = prices[i]-min;
            }
        }
        return max;
    }
}
