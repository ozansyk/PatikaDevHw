package patikaJava102Hw.patikaStore;

public class MobilePhone extends Product {
	private int battery;
	private String color;
	
	public MobilePhone(int id, String name, int price, int discountRate, int unitsInStock, Brand brand, String memory,
			String screenSize, String ram, int battery, String color) {
		super(id, name, price, discountRate, unitsInStock, brand, memory, screenSize, ram);
		this.battery = battery;
		this.color = color;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
