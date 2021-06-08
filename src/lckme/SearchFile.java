package lckme;

import java.io.File;

public class SearchFile {
	public static void search(String fileName) {
		File myObj = new File(fileName);
		if(myObj.exists()) {
			System.out.println("File found: " + myObj.getName() +" at this location :-  "+ myObj.getAbsolutePath());
		} else {
			System.out.println("FNF");
		}
	} 
}
