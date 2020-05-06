package test;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArithmeticSample amz = new ArithmeticSample();

		System.out.print("足し算をします.\n");
		int ans = amz.sum(100, 200);
		System.out.print("答えは" + ans  + "です.");
		ww();
	}

	/**
	 * 
	 */
	private static void ww() {
		for (int i = 0, num = 0; i < 100; i++) {
			num++;
			System.out.print(num);
		}
	}

}
