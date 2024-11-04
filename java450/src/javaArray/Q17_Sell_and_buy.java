package javaArray;

//best time to buy and sell the stock and get max profit
public class Q17_Sell_and_buy {
	public static int sellBuy(int [] prices) {
		
		int max_profit = 0;
		int buy_day = prices[0];
		for(int i =1; i<prices.length; i++) {
			//finding the lowest prices day
			if(buy_day > prices[i]) {
				buy_day = prices[i];
			}else if(prices[i]-buy_day>max_profit) {
				max_profit = prices[i]-buy_day;//finding max profit
			}
		}
		
		return max_profit ;
	}
	public static void main(String [] args) {
		int[] arr = {7,1,5,6,4};
		int output = sellBuy(arr);
		System.out.print(output);//5
		
	}
}
