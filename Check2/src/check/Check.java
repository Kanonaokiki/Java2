package check;

import constants.Constants;

public class Check {

	private static String firstName = "狩野";
	private static String lastName = "尚輝";

//	メソッドを作成し、引数に上記の変数を入れて返り文を作る。
	private static String printName(String firstName, String lastName) {
		//2番目の処理
		return firstName + lastName;
		//3番目の処理
	}

	public static void main(String[] args) {

//		メソッドをstring型に代入し、変数を表示させる。
		String Name = printName(firstName, lastName);
		//1番目の処理
		System.out.println("printNameメソッド → " + Name);
		//4番目の処理

//		インスタンス化をし、その中の引数に別クラスの定数を引き出してくる。その後、作成したものを
//		メソッドで呼び出してくる。
//		下の文も同様
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();

	}

}
