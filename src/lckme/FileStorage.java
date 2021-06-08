package lckme;

import java.io.File;
//to create a directory which will store all files of user
public class FileStorage {
	public static void folder() {
		//object of File class to create  a directory
		File myObj = new File("userFilesDirectory");
		if(myObj.mkdir()) {
			System.out.println("Directory created successfully : " + myObj.getName() + " path : " + myObj.getAbsolutePath());
		}
		else {
			System.out.println("Directory has been initiated ");
		}
	}
}
