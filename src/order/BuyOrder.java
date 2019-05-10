package order;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BuyOrder extends Order {
	
	public BuyOrder() {
		
	}

	@Override
	public String toString() {
		Date orderTime = new Date(this.getOrderTimeStamp());
		DateFormat dateFormat = new SimpleDateFormat("hh:mm");
		String orderTimeString = dateFormat.format(orderTime);
		return "#" + this.getOrderID() + " " + orderTimeString + " " + this.getOrderKey() + " " + this.BUY + " " +  this.getOrderQuantity() + " " + this.getOrderPrice() ;
	}
}
