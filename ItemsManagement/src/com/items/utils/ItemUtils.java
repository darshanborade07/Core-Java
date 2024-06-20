package com.items.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.app.entity.Items;

public class ItemUtils {

	public static void writeDetails(String fileName, List<Items> list) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(list);
		}
		
	}

	public static List<Items> readDetails(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			return (List<Items>) in.readObject();
		}
		
	}

}
