package hallo;

public class For {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 初期値; 完了条件; 増加値(i++ → i=i+1)
		for (int i=0; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i + "は10の倍数");
			} else {
			System.out.println(i);
			}
		}
		// 配列書き方
		// とりあえず宣言だけする
		int[] a;
		int b[];
		// あまり使わない 何個ってわからないことが多い[数]
		int [] c = new int [5];
		int [] d = { 28, 27, 23, 40, 50 };
		int num = 2;
		System.out.println(d[num]);
		System.out.println(d.length);
		System.out.println("一回目");
		for(int n=0; n < d.length; n++) {
			System.out.println(d[n]);
		}
		d[4] = 1234;
		System.out.println("二回目");
		for(int n=0; n < d.length; n++) {
			System.out.println(d[n]);
		}
	}

}
