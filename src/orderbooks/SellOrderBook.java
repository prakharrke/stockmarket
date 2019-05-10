package orderbooks;

import java.util.Collection;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Map.Entry;

import order.Order;
import order.OrderComparator;

public class SellOrderBook implements OrderBook {

	@Override
	public void clear() {
		
		sellOrderBook.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		
		return sellOrderBook.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		
		return sellOrderBook.containsValue(value);
	}

	@Override
	public Set<Entry<String, PriorityQueue<Order>>> entrySet() {
		
		return sellOrderBook.entrySet();
	}

	@Override
	public PriorityQueue<Order> get(Object key) {
		
		return sellOrderBook.get(key);
	}

	@Override
	public boolean isEmpty() {
		
		return sellOrderBook.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		
		return sellOrderBook.keySet();
	}

	@Override
	public PriorityQueue<Order> put(String key, PriorityQueue<Order> value) {
		// TODO Auto-generated method stub
		return sellOrderBook.put(key, value);
	}
	
	public void put(Order order) {
		String key = order.getOrderKey();
		if(sellOrderBook.containsKey(key)) {
			
			sellOrderBook.get(key).add(order);
		}else {
			PriorityQueue<Order> orderBookPriorityQueue = new PriorityQueue<Order>(new OrderComparator());
			orderBookPriorityQueue.add(order);
			sellOrderBook.put(key, orderBookPriorityQueue);
		}
		
		System.out.println( "Sell Peek " + sellOrderBook.get(key).peek());
	}

	@Override
	public void putAll(Map<? extends String, ? extends PriorityQueue<Order>> m) {
		// Unimplemented
		
	}

	@Override
	public PriorityQueue<Order> remove(Object key) {
		
		return sellOrderBook.remove(key);
	}

	@Override
	public int size() {
		
		return sellOrderBook.size();
	}

	@Override
	public Collection<PriorityQueue<Order>> values() {
		
		return sellOrderBook.values();
	}
}
