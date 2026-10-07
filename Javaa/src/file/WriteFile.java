package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		File f1 = new File("F:\\file\\data\\another.java");
		if (f1.createNewFile()) {
			
			System.out.println("Done");
		}
		else {
			System.out.println("not Created");
		}

		FileWriter wf = new FileWriter(f1);
		wf.write("Hello Babyy");
		wf.flush();
	}
}
