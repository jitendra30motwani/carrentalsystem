/**
 * 
 */
package design.lld.carrentalsystem;

import java.util.Date;
import java.util.List;

/**
 * @author 91978
 *
 */
public class CarRentalSystem {

	/**
	 * @param args
	 */
	
	List<User> users;
	List<Store> stores;
	
	//CRUD
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Vehicle{
	
	int vehicleId;
	
	String vehicleNo;
	
	int kmsDriven;
	
	String model;
	
	VehicleType type;
	
	VehicleStatus status;
	
	Date manufactureDate;
}

enum VehicleType{
	
	CAR,BIKE;
	
}

enum VehicleStatus{
	
	ACTIVE,INACTIVE;
}

class Car extends Vehicle{
	
		
}

class Bike extends Vehicle{
	
}

class Store{
	
	int storeId;
	
	Address address;
	
	StoreInventoryManagement storeInventoryManagement;
	
	List<Reservation> reservations;
	
}

class StoreInventoryManagement{
	
	List<Vehicle> vehicles;
	
	//CRUD
	
}

class CarStoreInventoryManagement extends StoreInventoryManagement{
	
	
	
}

class BikeStoreInventoryManagement extends StoreInventoryManagement{
	
	
	
}

class Address{
	
	String country;
	String state;
	String city;
	String street;
	String pincode;
	
}

class Reservation{
	
	User user;
	Store store;
	Vehicle vehicle;
	Date startTime;
	Date endTime;
	double costPerHour;
	double costPerDay;
	ReservationStatus status;
}

class User{
	
	int userId;
	String licenseNumber;
	String name;
	
	
}

enum ReservationStatus{
	
	SCHEDULED,IN_PROGRESS,COMPLETED,CANCELLED;
	
}

class Bill{
	
	Reservation reservation;
	boolean paid;
	
	
	
}

class Payment{
	
	Bill bill;
	int amount;
	int txnId;
	Date txnDate;
	PaymentType type;
	PaymentStatus status;
	
	//public Payment makePayment(Bill bill, PaymentType type);
	
}

enum PaymentType{
	
	CREDIT,DEBIT,UPI,CASH;
}

enum PaymentStatus{
	
	PENDING, COMPLETED, DECLINED, CANCELLED, REFUNDED;
}

