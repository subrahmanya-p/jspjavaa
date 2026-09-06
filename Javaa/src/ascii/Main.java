package ascii;

public class Main {

	public static void main(String[] args) {
		//hello
		//HellO
		 String str="hello";
		 System.out.println("Original String:"+str);
		  char first=(char)   (str.charAt(0)-32);
		  char last=(char)   (str.charAt(str.length()-1)-32);
		  String middle=str.substring(1, str.length()-1);
		  System.out.println("String after Replacement:"+(first+middle+last));
		  
		  
	}

}
