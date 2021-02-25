package enums;

import java.time.LocalDate;
import java.time.Month;

public class Runner {

	public static void main(String[] args) {
		System.out.println(flipCoin(CoinFlip.HEADS));

//		LocalDate date = LocalDate.of(1994, 15, 4);
//		System.out.println(date);

		LocalDate dateWithEnum = LocalDate.of(1994, Month.APRIL, 4);
		System.out.println(dateWithEnum);

//		for (int i = 0; i < 100; i++) {
//			System.out.println(flipCoin());
//		}
	}

	private static boolean flipCoin(CoinFlip decision) {
		CoinFlip actual = flipCoin();
		return decision == actual;
	}

	private static CoinFlip flipCoin() {
		double random = Math.random();
		if (random < 0.5) {
			return CoinFlip.TAILS;
		} else if (random < 0.9) {
			return CoinFlip.HEADS;
		} else {
			return CoinFlip.EDGE;
		}
	}

}
