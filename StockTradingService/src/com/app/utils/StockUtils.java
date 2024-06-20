package com.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.app.custom_exception.InvalidInputsException;
import com.app.entity.Stock;

public class StockUtils {

	public static List<Stock> displayByCompanyName(String companyNm, Map<String, Stock> map) throws InvalidInputsException {
		List<Stock> list = new ArrayList<Stock>();
		for (Stock s : map.values()) {
			
			if(s.getCompanyName().equals(companyNm)) {
				
				list.add(s);
			}
			else 
				throw new InvalidInputsException("Company name not found !!");
			
		}
		
		return list;
		
		
	}

	public static void purchaseStock(String stockId, int qty, Map<String, Stock> map) throws InvalidInputsException {
		for (Stock s : map.values()) {
			if(s.getStockId().equals(stockId)) {
				s.setQuantity(s.getQuantity()+qty);
			}
			else
				throw new InvalidInputsException("Stock id not found !!");
		}
		
	}

	public static void sellAStock(String stockId, int qty, Map<String, Stock> map) throws InvalidInputsException {
		for (Stock s : map.values()) {
			if(s.getStockId().equals(stockId)) {
				s.setQuantity(s.getQuantity()-qty);
			}
			else
				throw new InvalidInputsException("Stock id not found !!");
		}
		
	}

	public static void writeDetails(String fileName, Map<String, Stock> map) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(map);
		}
		
	}

	public static Map<String, Stock> readDetails(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			return (Map<String, Stock>) in.readObject();
		}
		
	}

}
