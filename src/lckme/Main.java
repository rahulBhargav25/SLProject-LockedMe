package lckme;

import java.util.Scanner;
import java.util.Timer;
public class Main {
	
	public static void main(String[] args) {
		//Object scan of scanner class to take input from user
		Scanner scan = new Scanner(System.in);
		//Directory object is called here 
		FileStorage.folder();
		//path of directory to be liked with all files so all files are saved in that directory
		String path = "userFilesDirectory\\";
		/*boolean variable for outer most while loop to be passed as parameter so looop can keep running unless 
		  the variable is set to false
		*/
		boolean outerClose = true;
		
		/*boolean variable for inner most while loop to be passed as parameter so looop can keep running unless 
		  the variable is set to false
		*/
		boolean innerNestedClose = true;
		System.out.println("[]           [] [][][][]  []     [][][][] [][][][] []    [] [][][][]             ");
		System.out.println(" []   []    []  [][]      []     []       []    [] [] [] [] [][]            ");
		System.out.println("  [] [] [] []   [][]      []     []       []    [] []    [] [][]         ");
		System.out.println("   []    []     [][][][]  [][][] [][][][] [][][][] []    [] [][][][]               ");
		
		
		System.out.println("Developer Name :Rahul Bhargav");
		
		//label to continue with application menu
		label :
		while(outerClose) {
			
			System.out.println("choose from below options");
			System.out.println("1. Retrieve List of all saved files in ascending order");
			System.out.println("2. File operations(Create/Delete/Search)");
			System.out.println("3. Close Application");
			
			//user input to select the desired menu option
			int userInputForMainMenu = scan.nextInt();
			
			switch(userInputForMainMenu) {
			
			case 1 :
				System.out.println("These are your files: \\||/");
				ListFiles.listOfUserFiles();
				continue label;
			case 2 :
				//sub label to continue the inner loop
				subLabel :
				while(innerNestedClose) {
					System.out.println("1. Add file");
					System.out.println("2. Delete file");
					System.out.println("3.Search");
					System.out.println("4.Return to main menu");
					System.out.println("Please choose an option:");
					int subOption=scan.nextInt();
					//to avoid the blank input
					scan.nextLine();
					
					switch(subOption) {
						//case to add user desired file
						case 1:
							System.out.println("enter filename you want to add");
							String fileName = scan.nextLine();
							String FileName = path + fileName;
							CreateFile.addFile(FileName);
							break;
						//case to delete user desired files
						case 2:
							System.out.println("enter file name you want to delete");
							String delFileName = scan.nextLine();
							String DelFileName = path + delFileName;
							DeleteFile.removeFile(DelFileName);
							break;
						//case to search user desired files
						case 3 :
							System.out.println("enter file name you want to search");
							String searchFileName = scan.nextLine();
							String SearchFileName = path + searchFileName;
							SearchFile.search(SearchFileName);
							break;
						//case to continue this to the main label means outer while loop
						case 4 :
							//return to main menu
							continue label;
						//default for any other inut from user other than the specified output
						default :
							System.out.println("Invalid option selected, please select again from below menu");
							continue subLabel;
						}
					}	
				//case to close the application after confirming it
				case 3 :
					System.out.println("Are you sure you want to close this application? y/n");
					char closingIt=scan.next().charAt(0);
				
					if(closingIt=='Y' || closingIt=='y') {
						outerClose=false;
						continue label;
					}
					continue label;
				
				//default case for main menu to run for any input beside the provided cases can accept 
				default :
					System.out.println("Not valid, please again choose from below menu");
					continue label;
				}
			
				//System.out.println("Thank you for visiting the page");
			
			
			
			
			
			
			
			
			}
		
		
			System.out.println("thanks for using this application");
		}		
	}
	

