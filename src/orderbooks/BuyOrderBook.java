package orderbooks;

import java.util.Collection;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import order.Order;
import order.OrderComparator;

public class BuyOrderBook implements OrderBook{

	@Override
	public void clear() {
		
		buyOrderBook.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		
		return buyOrderBook.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		
		return buyOrderBook.containsValue(value);
	}

	@Override
	public Set<Entry<String, PriorityQueue<Order>>> entrySet() {
		
		return buyOrderBook.entrySet();
	}

	@Override
	public PriorityQueue<Order> get(Object key) {
		
		return buyOrderBook.get(key);
	}

	@Override
	public boolean isEmpty() {
		
		return buyOrderBook.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		
		return buyOrderBook.keySet();
	}

	@Override
	public PriorityQueue<Order> put(String key, PriorityQueue<Order> value) {
		
		return buyOrderBook.put(key, value);
	}
	
	public void put(Order order) {
		String key = order.getOrderKey();
		if(buyOrderBook.containsKey(key)) {
			
			buyOrderBook.get(key).add(order);
		}else {
			PriorityQueue<Order> orderBookPriorityQueue = new PriorityQueue<Order>(new OrderComparator());
			orderBookPriorityQueue.add(order);
			buyOrderBook.put(key, orderBookPriorityQueue);
		}
	}

	@Override
	public void putAll(Map<? extends String, ? extends PriorityQueue<Order>> m) {
		// Unimplemented
		
	}

	@Override
	public PriorityQueue<Order> remove(Object key) {
		
		return buyOrderBook.remove(key);
	}

	@Override
	public int size() {
		
		return buyOrderBook.size();
	}

	@Override
	public Collection<PriorityQueue<Order>> values() {
		
		return buyOrderBook.values();
	}


	
	
}
