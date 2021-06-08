package lckme;

import java.io.File;

public class DeleteFile {
	public static void removeFile(String fileName) {
		File myObj = new File(fileName);
		if(myObj.delete()) {
			System.out.println("Delete the File : " + myObj.getName());
		} else {
			System.out.println("Failed to delete file\n please check name of the file you entered");
		}

	}
}
