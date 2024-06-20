package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.custom_exception.AuthorizationException;
import com.app.entity.*;
import com.app.entity.Order;
import com.app.entity.Pet;
import com.app.utils.PetUtils;
import static com.app.utils.PetUtils.*;
public class PetStoreApp {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Pet> petList = populatedPetList();
			List<Order> orderPet = new ArrayList<Order>();
			List<User> userList = populatedUsersList();
			while (true) {
				System.out.println("0. Sign up \n" + "1. Add new Pet (Admin only functionality)\r\n"
						+ "2. Update Pet details (Admin only functionality)\r\n" + "3. Display all available pets\r\n"
						+ "4. Order a Pet\r\n" + "5. Check order status by Order Id\r\n"
						+ "6. Update order status (Admin only functionality)\r\n" + "7. Exit");

				System.out.println("choose an option : ");

				try {
					switch (sc.nextInt()) {
					case 0:
						System.out.println("Enter details for signup :- loginId, password, role");
						User user = new User(sc.next(), sc.next(), Role.valueOf(sc.next().toUpperCase()));
						userList.add(user);
						System.out.println("Sign up successfully !!!");
						break;

					case 1:
						System.out.println("Enter - Login id, password");
						user = User.login(sc.next(), sc.next(), userList);
						if (user.getRole().equals(Role.ADMIN)) {
							System.out.println("Enter Pet Details - petId, name, category, unitPrice, stock \n");
							Pet pet = new Pet(sc.nextInt(), sc.next(), Category.valueOf(sc.next()), sc.nextDouble(),
									sc.nextInt());
							petList.add(pet);
						} else {
							throw new AuthorizationException("Accessible for Admin only");
						}
						break;

					case 2:
						// PetUtils.updatePetDetails();
						break;

					case 3:
						System.out.println("-------- All Available Pets --------");
						petList.forEach(i -> System.out.println(i));
						break;

					case 4:
						System.out.println("Enter - Login id, password");
						user = User.login(sc.next(), sc.next(), userList);
						System.out.println("Login Successfully !!!");
						
						System.out.println("Enter - Pet id, quantity ");
						Order pet = PetUtils.orderPet(sc.nextInt(), sc.nextInt(), petList);
						orderPet.add(pet);
						orderPet.forEach(i->System.out.println(i));
						break;

					case 5:
						System.out.println("Enter - Login id, password");
						user = User.login(sc.next(), sc.next(), userList);
						System.out.println("Login Successfully !!!");
						orderPet.forEach(i -> System.out.println(i));
						System.out.println("Enter order id to check status");
						PetUtils.chkOrderStatus(sc.nextInt(), orderPet);

						break;

					case 6:
						System.out.println("Enter - Login id, password");
						user = User.login(sc.next(), sc.next(), userList);
						if (user.getRole().equals(Role.ADMIN)) {
							System.out.println("Enter order id, order status");
							PetUtils.updateOrderStatus(sc.nextInt(), sc.next(), orderPet);
						} else
							throw new AuthorizationException("Accessible for Admin only");
						break;

					case 7:
						System.out.println("Thank You !!!");
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