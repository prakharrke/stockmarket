package inputparser;

import java.nio.charset.MalformedInputException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import order.BuyOrder;
import order.Order;
import order.SellOrder;

public class InputParser {
	
public Order generateOrder(String orderDetails) throws MalformedInputException, ParseException {
		
		/*
		 *  order input format - <order-id> <order-key> <time> <action> <quantity> <price>
		 */
	int orderID;
	String orderKey;
	Date orderDate;
	String action;
	int quantity;
	double price;
	Order order;
	String[] inputParameters = orderDetails.split("[\\s+]");
		if(inputParameters.length != 6)
			throw new IllegalArgumentException("Bad Input");
		String orderIDString = inputParameters[0].trim();
			if(orderIDString.startsWith("#")) {
				orderIDString = orderIDString.replace("#","");
				orderID = Integer.parseInt(orderIDString);
			}else {
				throw new IllegalArgumentException("Bad Input for order ID");
			}
			
		
		
		String timeString = inputParameters[1].trim();
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm");
		orderDate = dateFormat.parse(timeString);
		
		orderKey = inputParameters[2].trim();
		
		String actionString = inputParameters[3].trim();
		if(actionString.equals("BUY") || actionString.equals("SELL")) {
			action = actionString;
		}else {
			throw new IllegalArgumentException("Bad Input for order action");
		}
		
		String quantityString = inputParameters[4].trim();
		quantity = Integer.parseInt(quantityString);
		
		String priceString = inputParameters[5].trim();
		price = Double.parseDouble(priceString);
		
		order = action.equals("BUY") ? new BuyOrder() : new SellOrder(); 	
		order.setOrderID(orderID)
			 .setOrderKey(orderKey)
			 .setorderTimeStamp(orderDate.getTime())
			 .setOrderQuantity(quantity)
			 .setOrderPrice(price);
		return order;
		
	}
}
