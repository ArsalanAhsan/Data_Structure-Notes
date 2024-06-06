public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
    public static int maxProfit(int[] prices){
        int buy = prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            else if (prices[i]-buy > maxProfit) {
                maxProfit = prices[i] - buy;

                
            }
            
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
    
}
