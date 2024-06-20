package com.app.tester;

import static java.time.LocalDate.parse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Stock;
import com.app.utils.StockUtils;
public class StockTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Stock> map = new HashMap<>();
			
			while(true) {
				System.out.println("1. Add a stock \n"+"2. Display all Stocks \n"+"3. Display available stock by company \n"
									+"4. Purchase a Stock \n"+"5. Sell Stock \n"
									+"6. save all stock details in a binary file \n"+"7. read stock details binary file \n"
									+"8. Exit");
				System.out.println("Choose an option : ");
				
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Stock Details - Stock id, Stock name, Company name, Price, Closing date, Quantity ");
						Stock stock = new Stock(sc.next(),sc.next(),sc.next(),sc.nextDouble(),parse(sc.next()),sc.nextInt());
						map.put(stock.getStockId(), stock);
						System.out.println("Stocks added successfully !!!");
						break;
						
					case 2:
						System.out.println("------------------ All Stock Details ----------------");
						for(Stock s: map.values()) {
							System.out.println(s);
						}
						break;

					case 3:
						System.out.println("Enter a company name : ");
//						List<Stock> list = StockUtils.displayByCompanyName(sc.next(),map);
//						list.forEach(i -> System.out.println(i));
//						String cname=sc.next();
						map.values().stream().filter(s->s.getCompanyName().equals(sc.next())).forEach(i->System.out.println(i));
						break;
						
					case 4:
						System.out.println("Enter stock id and quantity : ");
						StockUtils.purchaseStock(sc.next(),sc.nextInt(),map);
						break;
						
					case 5:
						System.out.println("Enter stock id and quantity : ");
						StockUtils.sellAStock(sc.next(),sc.nextInt(),map);
						break;
						
					case 6:
						System.out.println("Enter file name to store : ");
						StockUtils.writeDetails(sc.next(), map);
						break;
						
					case 7:
						System.out.println("Enter file name to restore details : ");
						Map<String, Stock> stockDetails = StockUtils.readDetails(sc.next());
						stockDetails.forEach((k,v) -> System.out.println(v));
						break;
						
					case 8:
						System.out.println("Thank You !!!");
						return;
						
					default:
						System.out.println("Invalid choice !!!");
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
				}
			}
		}

	}

}
