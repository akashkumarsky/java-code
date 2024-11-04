package MAY12;

public class Stock {
	public static void buySell(int [] prices) {
		int maxprofit = 0;
		int buyday = prices[0];
		
		for(int i = 0; i<prices.length; i++) {
			if(buyday>prices[i]) {
				buyday=prices[i];
			}else if(prices[i]-buyday>maxprofit) {
				maxprofit=prices[i]-buyday;
			}
			
		}
		System.out.print(maxprofit);
		
	}
	public static void main(String [] args) {
		int prices[] = { 7, 1, 5, 6, 4 };
		Stock.buySell(prices);
	}
}
