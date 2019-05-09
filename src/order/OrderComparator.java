package order;

import java.util.Comparator;

public class OrderComparator implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		
		if(order1.getOrderTimeStamp() > order2.getOrderTimeStamp())
			return 1;
		if(order1.getOrderTimeStamp() < order2.getOrderTimeStamp())
			return -1;
		else
			return 0;
	}

}
