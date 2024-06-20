package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.entity.Brand;
import com.app.entity.Pen;

public class PenUtils {
	
	public static List<Pen> populatedPenList(){
		List<Pen> list = new ArrayList<Pen>();
		//Brand brand, String color, String inkColor, String material, long stock, LocalDate stockUpdatedate, LocalDate stockListingDate, double price, double discount
		list.add(new Pen(Brand.CELLO, "Blue", "Blue", "Plastic", 1000, LocalDate.parse("2024-05-10"), LocalDate.parse("2024-01-01"), 10, 5));
		list.add(new Pen(Brand.GELPEN, "Blue", "Blue", "Alloy steel", 700, LocalDate.parse("2024-05-26"), LocalDate.parse("2024-02-14"), 25, 4));
		list.add(new Pen(Brand.PARKER, "Black", "Black", "Metal", 500, LocalDate.parse("2024-05-19"), LocalDate.parse("2024-02-24"), 20, 8));
		list.add(new Pen(Brand.REYNOLDS, "Blue", "Blue", "Metal", 613, LocalDate.parse("2024-06-01"), LocalDate.parse("2024-03-08"), 10, 5));
		list.add(new Pen(Brand.CELLO, "Blue", "Blue", "Plastic", 40, LocalDate.parse("2024-05-28"), LocalDate.parse("2024-03-26"), 10, 5));

		return list;
	}

	public static void updateStock(String brand, int stock,List<Pen> pens) {
		
			for (Pen pen : pens) {
				if(pen.getBrand() == Brand.valueOf(brand)) {
					pen.setStock(pen.getStock()+stock);
				}else
					throw new ResourceNotFoundException("Brand does not found !!!");
			}

	}

	public static List<Pen> discountedPens(List<Pen> pens) {
		List<Pen> list = new ArrayList<Pen>();
		for (Pen p : pens) {
			int period = Period.between(p.getStockUpdatedate(), LocalDate.now()).getMonths();
			if(period >= 3) {
				p.setPrice(p.getPrice()*0.8);
				list.add(p);
			}
		}
		return list;
	}
	
	public static void removedPens(List<Pen> pens){
		
		for (Pen p : pens) {
			int period = Period.between(p.getStockListingDate(), LocalDate.now()).getMonths();
			if(period >= 9) {
				pens.remove(p);
			}
		}
	}
}
