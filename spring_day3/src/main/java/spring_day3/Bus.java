package spring_day3;

public class Bus {
	
	private int busId;
	
	private String busName;
	
	private String busColor;
	
	private double busPrice;
	
	private String busNumber;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getBusColor() {
		return busColor;
	}

	public void setBusColor(String busColor) {
		this.busColor = busColor;
	}

	public double getBusPrice() {
		return busPrice;
	}

	public void setBusPrice(double busPrice) {
		this.busPrice = busPrice;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Bus(int busId, String busName, String busColor, double busPrice, String busNumber) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.busColor = busColor;
		this.busPrice = busPrice;
		this.busNumber = busNumber;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", busColor=" + busColor + ", busPrice=" + busPrice
				+ ", busNumber=" + busNumber + "]";
	}
	
	

}
