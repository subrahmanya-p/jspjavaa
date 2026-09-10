package stringss;

public class Main {
	public static void main(String[] args) {
		
String s1= "HelloG";
String s2= "Hello";
String s3 =s2+"G";
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s3==s2);
System.out.println(s3.equals(s1));


String  a1 = new String("Hii");
String  a2 = new String("Hii");
System.out.println(a1==a2);
System.out.println(a1.equals(a2));

}
}
