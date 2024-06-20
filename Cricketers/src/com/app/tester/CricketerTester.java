package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.custom_ordering.CricketerRatingComparator;
import com.app.entity.Cricketer;
import com.app.utils.CricketersUtils;

public class CricketerTester {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			List<Cricketer> list = new ArrayList<>();
			
			while (true) {
				System.out.println("1.Accept minimum 5 Cricketers in the collection.\n"
						+ "2.Modify Cricketer's rating\n"
						+ "3.Search Cricketer by name\n"						
						+ "4. Display all Cricketers added in collection.\n"
						+ "5.Display All Cricketers in sorted form by rating.\n"
						+ "6. Exit");
				System.out.println("Enter your choice : ");
				
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Cricketer Details - name, age, email_id, phoneNo, ratings");
						Cricketer cricketers = new Cricketer(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
						list.add(cricketers);
						System.out.println("Cricketers added successfully !!");
						System.out.println();
						break;
						
					case 2:
						System.out.println("Enter Cricketer name and ratings");
						Cricketer cricketer = CricketersUtils.modifyRatings(sc.next(),sc.nextInt(),list);
						if (cricketer == null) {
							System.out.println("invalid name");
						}
						else
							System.out.println(cricketer);
						System.out.println();
						break;
						
					case 3:
						System.out.println("Enter cricketer name :");
						CricketersUtils.searchByName(sc.next(),list);
						System.out.println();
						break;
						
					case 4:
						System.out.println("----------- All Cricketer Details ---------");
						for (Cricketer c : list) {
							System.out.println(c);
						}
						System.out.println();
						break;
	
					case 5:
						Collections.sort(list, new CricketerRatingComparator());
						System.out.println();
						break;
						
					case 6:
						System.out.println("Thank You !!!");
						return;
						
					default:
						break;
					}
					
				}catch (Exception e) {
					sc.nextLine();
				}				
			}
		} 

	}

}
