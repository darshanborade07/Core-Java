package app.vehicle.assign2;

import java.time.LocalDate;
import java.util.Scanner;

import static app.vehicle.assign2.VehicleUtility.addVehicle;
import static app.vehicle.assign2.VehicleValidations.validateInputs;
public class VehicleManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of vehicles : ");
		Vehicle[] v=new Vehicle[sc.nextInt()];
			// start up : init phase
			boolean exit = false;
			
			int counter = 0;
			
			while (!exit) {
				// clnt servicing phase
				System.out.println("1. Add vehicle \n" + "2. Display Vehicle details \n" 
				+ "" + "0. Exit ");

				System.out.println("Choose an option");
				try {
				switch (sc.nextInt()) {
				case 1:
					addVehicle(v);
					
					// boundary condition checking
//					if (counter < v.length) {
//						System.out.println("Enter vehicle details -  chasisNo,  colour,"
//
//								+ " price,  mfgDate,  insDate, Polllution level");
//						Vehicle veh = validateInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
//								sc.nextDouble(),v);
//						v[counter++] = veh;
//						System.out.println("A/c created !");
//
//					} else
//						System.out.println(" full !!!!");
				break;
				
				case 2:
					for (Vehicle vehicle : v) {
						if(vehicle!=null)
						System.out.println(vehicle);
					}
					break;
					
				case 3:
					
					break;
					
				case 0:
					exit = true;
					break;
				}

			}
	
				catch (Exception e) {
				System.out.println(e);
				}
	}
}
}