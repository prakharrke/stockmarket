package stockmarket;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import order.Order;

public class StockMarket {

	static Map<String, PriorityQueue<Order>>sellOrderBook = new HashMap<String, PriorityQueue<Order>>();
	static Map<String, PriorityQueue<Order>>buyOrderBook = new HashMap<String, PriorityQueue<Order>>();
	
	public static void addOrder(Order order) {
		
	}
}
