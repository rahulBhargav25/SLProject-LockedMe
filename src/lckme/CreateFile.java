package lckme;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void addFile(String fileName) {
		File myObj = new File(fileName);
		try {
			if(myObj.createNewFile()) {
				System.out.println("File created : " + myObj.getName());
			} else {
				System.out.println("File exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
