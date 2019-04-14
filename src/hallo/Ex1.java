package hallo;

public class Ex1 {

	// 実行される
	// void 何も返さない
	public static void main(String[] args) {
		// returnの部分が返されている
		// 自分のクラス
		String message = msg();
		System.out.println(message);
		// 違うクラス
		double ensyu = Keisan.en(5);
		System.out.println(ensyu);
		double taiseki = Keisan.enmenseki(5);
		System.out.println(taiseki);


	}
	// String msg 返す部分も合わせる
	private static String msg() {
		String msg ="お疲れ様";
		return msg;
	}


}
