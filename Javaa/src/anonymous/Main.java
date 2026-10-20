package anonymous;


 interface A{
  void  disp();
 }
public class Main {
public static void main(String[] args) {
	
	 A  a1 = new A() {

		@Override
		public void disp() {
			 System.out.println(" helo Im a anaonymous class !");
			
		}
		 
	 };
	 a1.disp();
}
}