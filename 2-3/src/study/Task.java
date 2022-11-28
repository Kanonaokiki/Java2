package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	//aに10、bに20、cに30の引数を付与する。

    	String  a = "plusメソッドの引数が一つの場合:" + super.plus(10);
    	String  b = "plusメソッドの引数が二つの場合:"+ super.plus(10,20);
    	String  c = "plusメソッドの引数が三つの場合:"+ super.plus(10,20,30);


       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
    }
}