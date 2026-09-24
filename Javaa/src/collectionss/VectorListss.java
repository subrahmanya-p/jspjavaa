package collectionss;

import java.util.Vector;

public class VectorListss {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(10);
		list.add(20);
		list.add(60);
		list.add(2, 50);
		list.add(30);
	
		
		System.out.println(list);
		System.out.println("The Size of the list : " + list.size());
		System.out.println(" Is 50 is present ? " + list.contains(50));
		System.out.println("Getting the Value 30 :" + list.get(4));
		list.set(0, 11);
		System.out.println("After Replacing the Value of 10  with the 11 : " + list);
		list.remove(0);
		System.out.println("After Removing the Value from the 1st index : " + list);
		list.remove((Object) 50);
		System.out.println("After Removing the Value  50 : " + list);
		list.clear();
		System.out.println("After Clearing the list : " + list);
		list.add(10);
		list.add(20);
		list.add(60);
		Vector list2 = new Vector();
		list2.add(10);
		list2.add(20);
		list2.add(60);
		System.out.println("The Value of the list :"+list);
		System.out.println("The Value of the list2 :"+list2);
		list2.addAll(list);
		System.out.println("After Adding  the list to the list2 , The value of the list2 : " + list2);
		Vector namelist = new Vector();
		namelist.add("subrahmanya");
		namelist.add("helo");
		namelist.add("another");
		System.out.println("The Value of the list2 :"+list2);
		System.out.println("The Value of the namelist :"+namelist);
		list2.addAll(1, namelist);
		System.out.println("List 2 After Adding the  namelist at the index 1 : " + list2);
		list2.removeAll(namelist);
		System.out.println(" List 2 After removing the same value which is present in the namelist  list 2 : " + list2);
		list.clear();
		list.add(10);
		System.out.println("the valus  of the list : "+list);
		System.out.println("the valus  of the list2 : "+list2);
		list2.retainAll(list);
		System.out.println("List 2 after retaining the same value which  is present in the list" + list2);

	}
}
