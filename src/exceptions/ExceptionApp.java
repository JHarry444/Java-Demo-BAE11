package exceptions;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionApp {

	public static void main(String[] args) {
//		ExceptionApp.main(null); StackOverflowError

		Object obj = null;

//		obj.hashCode(); NullPointer

		int[] arr = { 27 };
//		System.out.println(arr[99]); ArrayIndexOutOfBounds

//		throw new ConcurrentModificationException("oops"); throw a new exception

		MyList myList = new MyList(); // list of size 0

		try {
			throw new FileNotFoundException();
		} catch (Exception e) {
			System.out.println(e);
		}

		Scanner scan = new Scanner(System.in);

		try {
			throw new NullPointerException();
//			scan.nextLine();
		} catch (NoSuchElementException nse) {
			System.out.println("oops");
		} finally {
			System.out.println("CLOSE THE DOOR");
			scan.close();
		}

		throw new IndexOutOfBoundsException();

//		try {
//			myList.getByIndex(9999);
//		} catch (IndexOutOfBoundsException ioobe) {
//			System.out.println();
//		} catch (Exception e) {
//			System.out.println(e);
//		}

//		System.out.println("Hallo!");
	}

}
