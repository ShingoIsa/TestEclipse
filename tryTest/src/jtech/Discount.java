package jtech;

public class Discount {

	/**
	 * ①
	 * @param price
	 * @return
	 */
	public boolean priceCheck(int price) {
		if (price >= 50000) {
			// 購入額が5万以上なら割引対象
			return true;
		} else {
			// 割引対象とならない
			return false;
		}
	}
	 
	/**
	 * 分岐網羅に相当する
	 * @param sex
	 * @return
	 */
	public double sexCheck(String sex) {
		if (sex == "f") {
			// 女性なら2割引
			return 0.2;
		} else {
			// 男性なら1割引
			return 0.1;
		}
	}
	
	/*
	 * ②
	 */
	public int ageCheck(int age) {
		if (age < 20) {
            // 5000円引き
			return 5000;
		} else {
			// 1000円引き
			return 1000;
		}
	}
}
