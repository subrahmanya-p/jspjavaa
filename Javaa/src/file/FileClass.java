package file;

import java.io.File;

public class FileClass {
	public static void main(String[] args) throws InterruptedException {
		File f1 = new File("F:\\file\\data");
		if (f1.mkdir()) {

			System.out.println("Succesfully Craeted!");
		} else {
			System.out.println("Somethig Went Wrrong");
		}
		if (f1.exists()) {

			System.out.println("Already exists!");
		} else {
			System.out.println("File is not Exists");
		}
		Thread.sleep(5000);
//		if (f1.delete()) {
//			System.out.println("File Deleted ");
//
//		} else {
//			System.out.println("File Not Deleted");
//
//		}
	}
}
