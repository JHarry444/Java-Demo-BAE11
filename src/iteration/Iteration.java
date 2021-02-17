package iteration;

public class Iteration {

	public static void main(String[] args) {
		// do something 10 times
		// counter; end condition; iterator
		for (int iteration = 1; iteration <= 10; iteration++) {
			System.out.println(iteration);
		}

		for (int iteration = 10; iteration >= 1; iteration--) {
			System.out.println(iteration);
		}

		for (int iteration = 1; iteration <= 10; iteration += 2) {
			System.out.println(iteration);
		}

		boolean condition = false;

		while (condition) {
			System.out.println("help i'm stuck in a loop");
			condition = false;
		}

		do {
			System.out.println("do one");
		} while (condition);

		while (true) {
			System.out.println("Let's do the time warp again");
			for (int iteration = 1; iteration <= 10; iteration++) {
				if (iteration % 2 == 0) {
					continue;
				} else if (iteration == 5) {
					return;
				}
				System.out.println(iteration);
			}
			break;
		}
	}

}
