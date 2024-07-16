package DSA.LEETCODE;

public class buy_sell 
{
    public static int buysellstocks(int prices[]){
        int buy_price= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i])
            {    //profit
                int profit= prices[i]-buy_price; //today's profit
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                buy_price=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buysellstocks(prices));
    }
}
