package vehicle;

public class Car {
	private String carID;
	private String brand;
	private String model;
	private double priceperday;
	private boolean isAvailbale;
	private boolean isAvailable;
	/**
	 * @param carID
	 * @param brand
	 * @param model
	 * @param priceperday
	 * @param isAvailbale
	 */
	public Car(String carID, String brand, String model, double priceperday) {
	
		this.carID = carID;
		this.brand = brand;
		this.model = model;
		this.priceperday = priceperday;
		this.isAvailable = true;
	}
	
	public void rentcar() {
		isAvailable = false;
	}
	
	public void returncar() {
		isAvailable = true;
	}

	
	
	
	
	
	public String getCarID() {
		return carID;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPriceperday() {
		return priceperday;
	}

	public boolean isAvailbale() {
		return isAvailbale;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	
	
	
	
	public void display_details() {
		System.out.println("Car [carID=" + carID + ", brand=" + brand + ", model=" + model + ", priceperday=" + priceperday
				+ ", isAvailbale=" + isAvailbale + "]");
	}
	
	
	
	
	
	
}
