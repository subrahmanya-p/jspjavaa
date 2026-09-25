package collectionss;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		s1.add(10);
		s1.add(0, 0);
		s1.add(100);
		s1.add(56);
		s1.add(230);
		s1.add(-555);
		s1.add(120);
		System.out.println(s1);
		s1.remove(5);
		System.out.println(s1);
		s1.remove((Object) 120);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		s1.push(1010);
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.capacity());
		System.out.println(s1.contains(45));
		System.out.println(s1.clone());
		

	}

}
