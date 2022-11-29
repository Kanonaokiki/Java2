package check;

import constants.Constants;

public class Check {

	private static String firstName = "狩野";
	private static String lastName = "尚輝";

	private static String printName(String firstName, String lastName) {
		//2番目の処理
		return firstName + lastName;
		//3番目の処理
	}

	public static void main(String[] args) {

		String Name = printName(firstName, lastName);
		//1番目の処理
		System.out.println("printNameメソッド → " + Name);
		//4番目の処理

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();

	}

}
