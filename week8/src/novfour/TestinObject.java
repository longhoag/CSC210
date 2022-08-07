package novfour;

public class TestinObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock my = new Stock("ap", "hey", 424234, 24234242);
		
		
		
		System.out.println(my.previousClosingPrice);
		

	}
	
}
class Stock {
	
	String symbol;
	String name;
	
	double previousClosingPrice;
	double currentPrice;
	
	
	
	Stock() {
		symbol = " ";
		name = " ";
		previousClosingPrice = 0;
		currentPrice = 0;
	
	}
	
	Stock(String newsymbol, String newname, double newpreviousClosingPrice, double newcurrentPrice) {
		symbol = newsymbol;
		name = newname;
		previousClosingPrice = newpreviousClosingPrice;
		currentPrice = newcurrentPrice;
		
	}
	
	double getChangePercent() {
		return (currentPrice - previousClosingPrice)/previousClosingPrice;
	}
	
	
}