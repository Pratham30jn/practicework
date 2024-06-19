package Arrays;

public class BuySellStock {
	public static int buySell(int[]price) {
		int bp= Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<price.length;i++){
			if(bp<price[i]) {
				 int profit=price[i]-bp;
				if(profit>maxProfit) {
					maxProfit=profit;
				}
			}else {
				bp=price[i];
			}
			
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int stock[]= {7,1,2,5,3,6,4};
		System.out.println(buySell(stock));
	}

}
