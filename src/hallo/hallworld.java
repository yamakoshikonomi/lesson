package hallo;

public class hallworld {

	public static void main(String[] args) {
		System.out.println("こんばんは");

		//文字列型を利用
		String name = "桐島さん";
		System.out.println(name);

		//整数型を利用
		int x = 10;
		int y = 3;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		//小数点がある型を利用
		double dx = 10.55;
		double dy = 3.00;
		System.out.println(dx + dy);
		System.out.println(dx - dy);
		System.out.println(dx * dy);
		System.out.println(dx / dy);

		// 文字＋数字
		System.out.println("xは" + 10);
		System.out.println("xは" + 10 + 5);
		int z = x + y;
		System.out.println("x + y =" + z);

		// 論理型を利用
		boolean flag = false;
		System.out.println("flagは" + true);

		if (flag) {
			System.out.println("if");
		} else {
			System.out.println("else");
		}

		// 比較（x=10 y=3）
		// 一致
		boolean flag1 = x == y;
		System.out.println("x == yは" + flag1);
		// 不一致
		System.out.println(x != y);
		int a = 10;
		// 以上
		System.out.println(x >= a);
		// より大きい
		System.out.println(x > a);
		// 以下
		System.out.println(x <= a);
		// より小さい
		System.out.println(x < a);

		x = 6;
		if(x > 15) {
			System.out.println("x > 15");
		} else if (x >= 10) {
			System.out.println("x >= 10");
		} else {
			System.out.println("x < 10");
		}
		

	}

}
