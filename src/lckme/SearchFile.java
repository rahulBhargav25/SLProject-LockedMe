package lckme;

import java.io.File;

public class SearchFile {
	public static void search(String fileName) {
		File myObj = new File(fileName);
		if(myObj.exists()) {
			System.out.println("File found: " + myObj.getName() + myObj.getAbsolutePath());
		} else {
			System.out.println("FNF");
		}
	} 
}
