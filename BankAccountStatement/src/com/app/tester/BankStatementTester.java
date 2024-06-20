package com.app.tester;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.entity.BankStatement;
import com.app.utils.BankStatementUtils;

public class BankStatementTester {

	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			List<BankStatement> statements = new ArrayList<>();
			System.out.println("Enter a file name to read the data : ");
			System.out.println(BankStatementUtils.readDetails(sc.next()));
			
			while (true) {
				System.out.println("1. Sum of all deposits \n"
						+ "2. Max deposit amount \n"
						+ "3. Shopping expenses (sum of withdrawals for shopping) \n"
						+ "4. Date on which maximum amount withdrawn \n"
						+ "5. Exit");
				
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter a file name : ");
						System.out.println(BankStatementUtils.readDetails(sc.next()));
						
						break;

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
