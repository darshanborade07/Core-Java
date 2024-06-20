package com.app.tester;

import static com.app.utils.PenUtils.discountedPens;
import static com.app.utils.PenUtils.populatedPenList;
import static com.app.utils.PenUtils.updateStock;
import static java.time.LocalDate.parse;

import java.util.List;
import java.util.Scanner;

import com.app.entity.Brand;
import com.app.entity.Pen;
import com.app.utils.PenUtils;
public class PenApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Pen> listOfPens = populatedPenList();
			while (true) {
				// clnt servicing phase
				System.out.println("Options : 1. Add a new Pen \n" + "2. Display All Pens \n"
						+ "3. Update stock of pens \n" + "4. Display all pens having discont 20% \n"
						+ "5. Remove Pens which are never sold once listed in 9 months \n"+"6. Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter: Brand, color, inkColor, material, stock, stockUpdatedate, stockListingDate, price, discount");
						Pen pen = new Pen( Brand.valueOf(sc.next().toUpperCase()),sc.next(), sc.next(), sc.next(), sc.nextLong(), parse(sc.next()), parse(sc.next()), sc.nextDouble(), sc.nextDouble());
						listOfPens.add(pen);
						System.out.println("Pens added successfully");
						break;
						
					case 2:
						//Display all pens
						System.out.println("All Pens Details");
						for (Pen p : listOfPens) {
							System.out.println("in display");
							System.out.println(p);
						}
						break;

					case 3:
						System.out.println("Enter a brand name, stock (quantity)");
						updateStock(sc.next(), sc.nextInt(),listOfPens);
						System.out.println("Stock updated successfully !!!");
						break;
						
					case 4:
						System.out.println("Pens having 20% discount !!!");
						List<Pen> discountedPens = discountedPens(listOfPens);
						listOfPens.forEach(i -> System.out.println(i));
						break;
						
					case 5:
						System.out.println("Removed Pens which are not sold in last 9 months");
						PenUtils.removedPens(listOfPens);
						break;
						
					case 6:
						return;
					
					default:
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
				}

			}
		}

	}
}
