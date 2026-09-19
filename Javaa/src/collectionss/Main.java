package collectionss;

import java.util.Arrays;

public class Main {

    static Object[] arr = new Object[10];

    static int size = 0;

    static int size() {
        return size;
    }

    static void add(Object obj) {
        arr[size] = obj;
        size++;
    }
public static void add(Object obj ,int index) {
	System.arraycopy(arr, index, arr, index+1, size-index);
	arr[index]=obj;
	size++;
	
}
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));

        add(60);
        add(8);
        add(6);

        System.out.println(Arrays.toString(arr));
        System.out.println("Size: " + size());

        add(20, 1);

        System.out.println(Arrays.toString(arr));
        System.out.println("Size: " + size());

        System.out.println(Arrays.toString(arr));
        System.out.println("Size: " + size());

        add(10, 4);
      

        System.out.println(Arrays.toString(arr));
    }
}