package iteratorr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		Set l1 = new LinkedHashSet();
		l1.add(34);
		l1.add(234);
		l1.add("subbu");
		l1.add(false);
		Iterator it = l1.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
		}

	}
}
