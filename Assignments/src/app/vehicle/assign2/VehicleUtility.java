package app.vehicle.assign2;

import java.time.LocalDate;
import java.util.Scanner;
import static app.vehicle.assign2.VehicleValidations.validateInputs;
public class VehicleUtility {
	static int count = 0;

	
	public static void addVehicle(Vehicle v[]) throws VehicleException {
		Scanner sc = new Scanner(System.in);
		if(count<v.length) {
		for (int i = 0; i<v.length;i++) {
		System.out.println("Enter chasis no : ");
		int chasisNo = sc.nextInt();
		System.out.println("Enter colour : ");
		String col = sc.next();
		System.out.println("Enter price of vehicle : ");
		double price = sc.nextDouble();
		System.out.println("Enter Manufacturing Date : ");
		String manufacturedate = sc.next();
		System.out.println("Enter Insurance Date : ");
		String insurancedate = sc.next();
		System.out.println("Enter Pollution Level : ");
		double pollutionlevel = sc.nextDouble();
		
		Vehicle veh = validateInputs(chasisNo,col,price,manufacturedate,insurancedate,pollutionlevel,v);
		v[count++]=veh;
		}
		
		}
		else
			System.out.println("Full !!!");
	}
	
	public static void driveCar(int km) {
		
	}
}
