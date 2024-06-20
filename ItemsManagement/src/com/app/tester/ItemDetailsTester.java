package com.app.tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.app.custom_ordering.ItemsPriceComparator;
import com.app.entity.Items;
import com.items.utils.ItemUtils;

public class ItemDetailsTester {
	int count=0;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Items> items = new LinkedList<Items>();
			
			while (true) {
				System.out.println("1. Add Item Details \n"
						+"2. Display All Item Details \n"
						+"3. Sort Item details by item code and store in binary file using serialization \n"
						+"4. Sort Item details by item price and store in binary file using serialization \n"
						+"5. Exit");
					System.out.println("Choose an option : ");
				try {
					switch (sc.nextInt()) {
					case 1:
							
						System.out.println("Enter Item Details :- Item code, description, price, shipment date \n");
						Items it = new Items(sc.next(), sc.next(), sc.nextDouble(), LocalDate.parse(sc.next()));
						items.add(it);
						
						break;

					case 2:
						System.out.println("----- All Item Details -----");
						items.forEach(i -> System.out.println(i));
						break;
						
					case 3:
						//natural ordering
						Collections.sort(items);
						System.out.println("Enter a file name to store item details by item code : ");
						ItemUtils.writeDetails(sc.next(),items);
						
						break;
						
					case 4:
										
						Collections.sort(items, new ItemsPriceComparator());
						System.out.println("Enter a file name to store item details by item price : ");
						ItemUtils.writeDetails(sc.next(),items);
						break;
						
					case 5:
						System.out.println("To restore file - \n 1.sorted by Item code (Item_code.ser) 2. sorted by Item price (Item_price.ser) \n ");
						List<Items> list = ItemUtils.readDetails(sc.next());
						list.forEach(i -> System.out.println(i));
						break;
						
					case 6:
						System.out.println("Thank You !!");
						return;
						
				
					}
				}catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}
	}

}
