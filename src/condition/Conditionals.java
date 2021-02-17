package condition;

public class Conditionals {

	public static boolean bloop() {
		System.out.println("bloop");
		return false;
	}

	public static void main(String[] args) {

		if (true || bloop()) {
			System.out.println("hello");
		}

		int i = 37;

		if (i % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		int day = Integer.MIN_VALUE;

		switch (day) { // Valid with Strings, numbers and Enums
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("There's only seven days in a week you plonker.");
		}

		System.out.println(day);
	}

}
