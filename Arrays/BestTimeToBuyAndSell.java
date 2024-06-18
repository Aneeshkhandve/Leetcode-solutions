
public class BestTimeToBuyAndSell{
    
    public static int maxProfit(int prices[]){
        int maxprofit=0;
        int minsofar = prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(prices[i],minsofar);
            int profit = prices[i]-minsofar;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }

    public static void main(String args[]){

       int nums[]={7,1,5,3,6,4}; System.out.println(maxProfit(nums));
    }
}
