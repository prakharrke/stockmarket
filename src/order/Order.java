package order;

public class Order {
	final String BUY = "BUY";
	final String SELL = "SELL";
	int orderID;
	String orderKey;
	long orderTimeStamp;
	int orderQuantity;
	double price;
	Order buyOrder;
	Order sellOrder;
//	public Order(int orderID, String orderKey, long orderTimeStamp, String orderAction, int orderQuantity, double price) {
//		
//		this.orderID = orderID;
//		this.orderKey = orderKey;
//		this.orderTimeStamp = orderTimeStamp;
//		
//		this.orderQuantity = orderQuantity;
//		this.price = price;
//	}
	
	// * FACTORY METHOD DESIGN PATTERN IMPLEMENTED - Dependency Inversion Principle
	
	public Order createOrder(String orderAction) {
		if(orderAction.equals("BUY"))
			return new BuyOrder();
		if(orderAction.equals("SELL"))
			return new SellOrder();
		
		return null;
	}
	
	public Order setOrderID(int orderID) {
		this.orderID = orderID;
		return this;
	}
	public Order setorderTimeStamp(long timeStamp) {
		this.orderTimeStamp = timeStamp;
		return this;
	}
	public Order setOrderKey(String key) {
		this.orderKey = key;
		return this;
	}
	public Order setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
		return this;
	}
	public Order setOrderPrice(double price) {
		this.price = price;
		return this;
	}
	public int getOrderID() {
		return this.orderID;
	}
	public String getOrderKey() {
		return this.orderKey;
	}
	public long getOrderTimeStamp() {
		return this.orderTimeStamp;
	}
	
	public int getOrderQuantity() {
		return this.orderQuantity;
	}
	public double getOrderPrice() {
		return this.price;
	}
	
	public Order setBuyOrder(Order buyOrder) {
		this.buyOrder = buyOrder;
		return this;
	}
	public Order setSellOrder(Order sellOrder) {
		this.sellOrder = sellOrder;
		return this;
	}
	
	public Order getBuyOrder() {
		return this.buyOrder;
	}
	public Order getSellOrder() {
		return this.sellOrder;
	}
	
	
	
	
}
