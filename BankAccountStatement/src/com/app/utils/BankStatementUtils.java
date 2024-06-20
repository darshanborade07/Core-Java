package com.app.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.app.entity.BankStatement;

public class BankStatementUtils {

	public static String readDetails(String fileName) throws IOException {
		List<BankStatement> list = new ArrayList<BankStatement>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));
				FileWriter pw = new FileWriter(fileName)){	
			int v;
			
			if((v = br.read()) != -1) {
				pw.write(v);
			}
			
			return null;
		}
		
	}

}
