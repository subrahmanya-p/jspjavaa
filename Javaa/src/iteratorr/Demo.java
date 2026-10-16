package iteratorr;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(34);
		l1.add(234);
		l1.add("subbu");
		l1.add(false);
		l1.add(true);
		ListIterator it = l1.listIterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
		}
		while (it.hasPrevious()) {
			Object object = it.previous();
			System.out.println(object);

		}
	}
}
