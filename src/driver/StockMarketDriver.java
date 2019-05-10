package driver;

import java.nio.charset.MalformedInputException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

import inputparser.InputParser;
import order.Order;
import stockmarket.StockMarket;

public class StockMarketDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws MalformedInputException, ParseException {
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter order details");

	    String orderDetails = scanner.nextLine();
	    
	    InputParser inputParser = new InputParser();
	    Order order = inputParser.generateOrder(orderDetails);
	   Queue<Order>executedOrders =  StockMarket.addOrder(order);
	   
	   Iterator<Order> itr = executedOrders.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next().toString());
	   }
	   
	}

		
	}
	
	

}
