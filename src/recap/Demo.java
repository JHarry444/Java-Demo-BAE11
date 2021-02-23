package recap;

public class Demo {

	public static void main(String[] args) {
		System.out.println("bloop" == "bloop");

		System.out.println("bloop" == new String("bloop"));

		System.out.println("bloop".equals(new String("bloop")));

		System.out.println(new Chair(4) == new Chair(4));

		System.out.println(new Chair(4).equals(new Chair(4)));
	}

}
