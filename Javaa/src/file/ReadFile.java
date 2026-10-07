package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//import com.sun.org.apache.bcel.internal.generic.NEW;

//import com.sun.org.apache.bcel.internal.generic.NEW;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		File f1 = new File("F:\\file\\data\\another.txt");
		FileReader fReader = new FileReader(f1);
		char ch[] = new char[(int) f1.length()];
		fReader.read(ch);
		System.out.println(new String(ch));
		for (char c : ch) {
		System.out.println(c);	
		}

	}
}
