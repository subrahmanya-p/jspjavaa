package collectionss;

import java.lang.foreign.AddressLayout;
import java.util.Arrays;

public class Main3 {
	static Object[] srcArr = { 2, 3, 4, 6, 0,8 };
	static Object[] destArr = new Object[6];
	  static int size = 0;

	    static int size() {
	        return size;
	    }

	    static void add(Object obj) {
	        destArr[size] = obj;
	        size++;
	    }
	    //copy ned
	    static void copyend( ) {
	    	System.arraycopy(srcArr, 0, destArr, size, srcArr.length/2);
	    	
	    	
	    	
	    }
	    static void  middle() {
	    	System.arraycopy(srcArr, 1, destArr, 1, srcArr.length-2);
	    }
	    
	    public static void main(String[] args) {
			add(23);
			add(25);
			add(90);
			System.out.println(destArr.length);
			System.out.println("Before Copying to End :");
			System.out.println(Arrays.toString(destArr));
			copyend();
			System.out.println("After Copying to End :");
			System.out.println(Arrays.toString(destArr));
			System.out.println("Before Copying to middle :");
			System.out.println(Arrays.toString(destArr));
			middle();
			System.out.println("After Copying to middle :");
			System.out.println(Arrays.toString(destArr));

			
		}
	    
}
