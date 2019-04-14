package hallo;

import dto.UserDto;

public class meibo {

	public static void main(String[] args) {
		// クラス名(インスタンス) 変数名＝このファイル名 =新たなファイルをつくる このフォーマットで
		// そのファイルフォーマットで新しいものを作るイメージ
		UserDto yamakoshi= new UserDto();
		yamakoshi.setName("yamakoshi");
		yamakoshi.setBlood("A");
		//yamakoshi.setSex("女");
		yamakoshi.setSexint(1);
		yamakoshi.setHeigth(170);
		yamakoshi.setWeight(0);
		System.out.println(yamakoshi.getSex());
		UserDto kirishima= new UserDto();
	}

}
