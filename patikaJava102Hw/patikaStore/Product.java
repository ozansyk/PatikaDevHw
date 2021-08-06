package patikaJava102Hw.patikaStore;

public abstract class Product {
	private int id;
	private String name;
	private double price;
	private int discountRate;
	private int unitsInStock;
	private Brand brand;
	private String memory;
	private String screenSize;
	private String ram;
	
	public Product(int id, String name, double price, int discountRate, int unitsInStock, Brand brand, String memory,
			String screenSize, String ram) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
		this.unitsInStock = unitsInStock;
		this.brand = brand;
		this.memory = memory;
		this.screenSize = screenSize;
		this.ram = ram;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getBrand() {
		return brand.getName();
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
}
