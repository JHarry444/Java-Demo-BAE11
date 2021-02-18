package arrays;

public class Arrays {

	public static void main(String[] args) {
		String[] strings = { "ngvkjfn", "fjnbdb", "ndkjb" };

		System.out.println(strings[1]);

		strings = new String[] { "i'm", "a", "new", "array" };

		System.out.println(strings[1]);

		int[] nums = new int[5];

		nums[2] = 27;

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println();

		String s = new String("bloop");
		String s2 = "bloop";

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		int[][] ohGod = { { 3, 4, 7 }, { 9, 65, 5 }, { 12, 36, 97 } };

		for (int i = 0; i < ohGod.length; i++) {
			for (int j = 0; j < ohGod[i].length; j++) {
				int[] currentArray = ohGod[i];
				int currentValue = currentArray[j];
				System.out.print(currentValue + " ");
			}
			System.out.println();
		}

		String[] nulls = new String[9];
		for (int i = 0; i < nulls.length; i++) {
			System.out.println(nulls[i]);
		}
	}

}
