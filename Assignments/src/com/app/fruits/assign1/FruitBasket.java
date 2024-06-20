package com.app.fruits.assign1;

import java.util.Iterator;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of fruits do you want to add : ");
		int n = sc.nextInt();
		Fruit[] fruit = new Fruit[n];
		int count = 0;
		while (true) {

			System.out.println("Enter :\n " + "1.Add Apple \n" + "2.Add Mango \n" + "3.Add Orange\n"
					+ "4.Display names of all fruits in the basket\n"
					+ "5.Display name,color,weight,taste of all fresh fruits in the basket\n"
					+ "6. Mark a fruit in a basket , as stale\n" + "7. Mark all sour fruits stale \n"
					+ "8. Invoke fruit specific functionality (pulp / juice / jam)\n" + "9. Exit \n");

			int ch = sc.nextInt();

			switch (ch) {
			case 1: {
				if (count < n) {
					System.out.println("Enter name of the fruit : ");
					String name = sc.next();
					System.out.println("Enter a colour of fruit : ");
					String colour = sc.next();
					System.out.println("Enter weight of a fruit : ");
					int weight = sc.nextInt();
					System.out.println("Is a fruit fresh :- true/false");
					boolean fresh = sc.nextBoolean();

					if (fresh) {
						fruit[count] = new Apple(name, colour, weight, fresh);
						count++;
					} else {
						System.out.println("Fruit is Stale");
						break;
					}
				} else
					System.out.println("Basket is full!!\n");
				break;
			}

			case 2: {
				if (count < n) {
					System.out.println("Enter name of the fruit : ");
					String name = sc.next();
					System.out.println("Enter a colour of fruit : ");
					String colour = sc.next();
					System.out.println("Enter weight of a fruit : ");
					int weight = sc.nextInt();
					System.out.println("Is a fruit fresh :- true/false");
					boolean fresh = sc.nextBoolean();

					if (fresh) {
						fruit[count++] = new Mango(name, colour, weight, fresh);
						 
					} else {
						System.out.println("Fruit is stale");
						break;
					}
				} else
					System.out.println("Basket is full!!\n");
				break;
			}

			case 3: {
				if (count < n) {
					System.out.println("Enter name of the fruit : ");
					String name = sc.next();
					System.out.println("Enter a colour of fruit : ");
					String colour = sc.next();
					System.out.println("Enter weight of a fruit : ");
					int weight = sc.nextInt();
					System.out.println("Is a fruit fresh :- true/false");
					boolean fresh = sc.nextBoolean();

					if (fresh) {
						fruit[count++] = new Orange(name, colour, weight, fresh);
					
					} else {
						System.out.println("Fruit is Stale");
						break;
					}
				} else
					System.out.println("Basket is full!!\n");
				break;
			}

			case 4:
				for (int i = 0; i < count; i++) {
					System.out.println(fruit[i].getName() + "\n");
				}
				break;

			case 5:
//				for (int i = 0; i < count; i++) {
//					System.out.println(fruit[i].toString() + "\n");
//				}
				
				for (Fruit f : fruit) {
					if(f != null ) //null checking
					System.out.println(f); //type of ref : Fruit, type of obj : Apple, Mango, Orange 
					
				}
				break;

			case 6:
				System.out.println("Enter index no ");
				int s = sc.nextInt();
				if (s < count) {
					if (fruit[s].isFresh()) {
						fruit[s].setFresh(false);
					} else {
						System.out.println("Fruit is already Stale");
					}
				} else
					System.out.println("Invalid index");
				break;

			case 7:
				for (int i = 0; i < count; i++) {
					if (fruit[i].test().equals("Sour")) {
						fruit[i].setFresh(false);
					}
				}
				break;

			case 8: {

				boolean flag = true;
				while (flag) {
					System.out.println("\n choose the fruit application :1.pulp 2.juice 3.jam 4.Exit");
					int c = sc.nextInt();
					switch (c) {
					case 1: {
						for (int a = 0; a < count; a++) {
							if (fruit[a] instanceof Mango) {
								Mango m = (Mango) fruit[a];

								m.pulp();
								break;
							}
							break;
						}
						break;
					}
					case 2: {
						for (int a = 0; a < count; a++) {
							if (fruit[a] instanceof Orange) {
								Orange o = (Orange) fruit[a];
								o.juice();
								
								break;
							}
							break;
						}
						break;
					}
					case 3: {
						for (int a = 0; a < count; a++) {
							if (fruit[a] instanceof Apple) {
								Apple o = (Apple) fruit[a];
								o.jam();

								break;
							}
							break;
						}
						break;

					}

					case 4: {
						flag = false;
						break;
					}
					}
				}
				break;
			}

			case 9:
				System.out.println("Thank you");
				return;

			}
		}

	}

}
