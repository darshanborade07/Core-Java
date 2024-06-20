package com.app.utils;

import java.util.List;

import com.app.entity.Cricketer;

public class CricketersUtils {

	public static Cricketer modifyRatings(String cname,int ratings,List<Cricketer> list) {
		for (Cricketer c : list) {
			if (c.getName().equals(cname)) {
				c.setRating(ratings);
				return c;
			}
		}
		return null;
		
	}

	public static void searchByName(String name, List<Cricketer> list) {
		for (Cricketer c : list) {
			if (c.getName().equals(name)) {
				System.out.println(c);
			}
		}
	}

	
}
