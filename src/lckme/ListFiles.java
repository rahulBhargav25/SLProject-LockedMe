package lckme;

import java.io.File;

public class ListFiles {
	public static void listOfUserFiles() {
		File myObj = new File("userFilesDirectory\\");
		
		String[] list = myObj.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
