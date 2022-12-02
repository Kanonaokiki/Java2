package check;
public class Pet {

    private String name;
    private String masterName;

//コンストラクタ化
    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }
//コンストラクタ化の返り値
    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }
//返り値をメソッドに入れる
    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

//クラスを継承し、メソッドに継承先の変数をsuperで呼び出す。
class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

  //返り値をメソッドに入れる
    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}