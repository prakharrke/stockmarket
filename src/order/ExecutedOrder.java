package order;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExecutedOrder extends Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public String toString() {
		Date orderTime = new Date(this.getOrderTimeStamp());
		DateFormat dateFormat = new SimpleDateFormat("hh:mm");
		String orderTimeString = dateFormat.format(orderTime);
		return "#" + this.getSellOrder().getOrderID() + " " + this.getOrderQuantity() + " " + this.getSellOrder().getOrderPrice() + " #" + this.getBuyOrder().getOrderID();
	}

}
