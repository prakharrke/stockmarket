package driver;

import java.nio.charset.MalformedInputException;
import java.text.ParseException;
import java.util.Scanner;

import inputparser.InputParser;
import order.Order;

public class StockMarketDriver {

	public static void main(String[] args) throws MalformedInputException, ParseException {
		
		Scanner scanner = new Scanner(System.in);  
	    System.out.println("Enter order details");

	    String orderDetails = scanner.nextLine();
	    
	    InputParser inputParser = new InputParser();
	    Order order = inputParser.generateOrder(orderDetails);
	    
	    System.out.println();
	}
	
	

}
