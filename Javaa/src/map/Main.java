package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a1", 34);
		m.put("a2", 12);
		m.put("a3", null);
		System.out.println(m);
		System.out.println("the Size : " + m.size());
		System.out.println("Is Empty ? :" + m.isEmpty());
		m.clear();
		System.out.println("Is Empty ? :" + m.isEmpty());
		m.put("a1", 34);
		m.put("a2", 12);
		m.put("a1", 39);
		m.put("a3", null);
		System.out.println(m.get("a1"));
		System.out.println("Does it Conatins a1 :" + m.containsKey("a1"));
		System.out.println("Does it Conatins 34 :" + m.containsValue(34));
		System.out.println(m);
		m.remove("a1");
		System.out.println(m);
		m.remove("a2", 12);
		System.out.println(m);
		m.put("a1", 34);
		m.put("a2", 12);
		m.put("a1", 39);
		m.put("a3", null);

		System.out.println(m.values());
		System.out.println(m.keySet());
		System.out.println("---------");
		System.out.println(m.entrySet());
		System.out.println("---------");
		for (Map.Entry<String, Integer> enr : m.entrySet()) {
			System.out.print(enr.getKey() + " ");
			System.out.print(enr.getValue() + " ");
			System.out.println();
		}
System.out.println("+++++++++++++++++");
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("a9", 34);
		m1.put("a5", 12);
		m1.put("a7", null);
		m.putAll(m1);
		for (Map.Entry<String, Integer> enr : m.entrySet()) {
			System.out.print(enr.getKey() + " ");
			System.out.print(enr.getValue() + " ");
			System.out.println();
		}

	}
}
