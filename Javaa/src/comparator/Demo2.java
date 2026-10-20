package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DOB {
	int dob;

	public DOB(int dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return " " + this.dob + "";
	}

}
	

	class SortByDOB implements Comparator<DOB> {
		public int compare(DOB d1, DOB d2) {
			return d1.dob - d2.dob;
		}

	}

public class Demo2 {


public static void main(String[] args) {
	 List<DOB> l1 = new ArrayList<>();

     l1.add(new DOB(2005));
     l1.add(new DOB(2002));
     l1.add(new DOB(2004));
     l1.add(new DOB(2003));

     Collections.sort(l1,new SortByDOB());

     for (DOB d : l1) {
         System.out.println(d);
     }
}
}
