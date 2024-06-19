 package inheritence;

public class Driver extends UserApp {
	
	public int acceptBooking() {
		System.out.println("Booking Accepted by the driver with booking id>>"+100);
		return 100;
	}
	
	public void declineBooking() {
		System.out.println("Booking Declined by the driver.");
	}
	public void registerVehicle() {
		System.out.println("Your vehicle has been registered.");
	}
}
