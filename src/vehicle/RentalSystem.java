package vehicle;
import java.util.*;
public class RentalSystem {
	private ArrayList<Car> cars;

	/**
	 * @param cars
	 */
	public RentalSystem() {
		
		cars = new ArrayList<>();
	}
	public void addcar(Car car) {
		cars.add(car);
	}
	
	//display all cars
	public void showAvailableCars(){
		System.out.println("--------------AVAILABLE CARS------------");
		for(Car c : cars) {
			c.display_details();
		}
		
	}
	public void rentCar(String carID,int days) {
		for(Car c:cars) {
			if(c.getCarID().equals(carID) && c.isAvailable()) {
				c.rentcar();
				double total = c.getPriceperday() * days;
				System.out.println("car rented successfully");
				
				System.out.println("car :" + c.getBrand() + " " + c.getModel());
				System.out.println("Total Rent: "+total);
				return;
			}
		}
		System.out.println("car not avilable");
	}/*
    // Return a car
    public void returnCar(String carId) {
        for (Car c : cars) {
            if (c.getCarId().equals(carId) && !c.isAvailable()) {
                c.returnCar();
                System.out.println("✅ Car returned successfully!");
                return;
            }
        }
        System.out.println("❌ Invalid Car ID or car not rented.");
    }*/
	public void returnCar(String carID) {
		for(Car c:cars) {
			if(c.getCarID().equals(carID) && c.isAvailable()) {
		         c.returncar();
	                System.out.println("✅ Car returned successfully!");
	                return;
	            }
	        }
	        System.out.println("❌ Invalid Car ID or car not rented.");
	    }


	

}
