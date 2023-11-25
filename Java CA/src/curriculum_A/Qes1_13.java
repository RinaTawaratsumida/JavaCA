package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1から3
		byte b; // 宣言
		b = 0; //初期化
		b = 10; //値を代入
		
		short s; // 宣言
		s = 0; // 初期化
		s = 100; //値を代入
		
		int i; // 宣言
		i = 0; // 初期化
		i = 1000; //値を代入
		
		long l; // 宣言
		l = 0; // 初期化
		l = 10000; //値を代入
		
		float f; // 宣言
		f = 0.0f; // 初期化
		f = 9.5f; //値を代入
		
		double d; // 宣言
		d = 0.0; // 初期化
		d = 10.5; //値を代入
		
		char c; // 宣言
		c = '\u0000'; // 初期化
		c = 'a'; //値を代入
		
		String Str; // 宣言
		Str = null; // 初期化
		Str = "ハロー"; //値を代入
		
		boolean boo; // 宣言
		boo = false; // 初期化
		boo = true; //値を代入
		
		
		//問題4
		System.out.println(b+s+i+l); // 整数を足す
		System.out.println(f+d); // 小数点のある数字を足す
		System.out.println(c+Str+boo); // 文字列を並べる
		System.out.println(b+s+i+l+f+d); // 全ての数字を足す
		System.out.println(b*s*i*l); // 整数をかける
		System.out.println(d/s); //割り算
		System.out.println(b-s); //引き算
		
		
		//問題5
		int num= 20; // 値を宣言
		int num1=23; // 値を宣言
		System.out.println("ハローJAPAN" + (num + num1)); // 文字列と変数を連結してコンソール出力

		
		//問題6
		String name = "山田太郎"; // 文字列を宣言
		int age = 18; // 値を宣言
		double height = 170.5; // 値を宣言
		double weight = 62.5; // 値を宣言
		String food = "寿司"; // 文字列を宣言 
		
		System.out.println("初めまして" + name + "です"); // 文字列と変数を連結してコンソール出力
		System.out.println("年齢は" + age + "歳です"); // 文字列と変数を連結してコンソール出力
		System.out.println("身長は" + height + "cmです"); // 文字列と変数を連結してコンソール出力
		System.out.println("体重は" + weight + "kgです"); // 文字列と変数を連結してコンソール出力
		System.out.println("好きな食べ物は" + food + "です"); // 文字列と変数を	連結してコンソール出力
		
		
		//問題7
		double bmi = weight / ((height / 100) * (height / 100)); // BMIの数式を宣言
		System.out.println("BMIは" + Math.floor(bmi) + "です"); //文字列と数値を連結してコンソール出力
		
		
		//問題8
		// 値と文字を代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = weight / ((height / 100) * (height / 100)); // BMIの数式を宣言
		
		System.out.println("初めまして" + name + "です"); // 文字列と変数を連結してコンソール出力
		System.out.println("年齢は" + age + "歳です"); // 文字列と変数を連結してコンソール出力
		System.out.println("身長は" + height + "cmです"); // 文字列と変数を連結してコンソール出力
		System.out.println("体重は" + weight + "kgです"); // 文字列と変数を連結してコンソール出力
		System.out.println("好きな食べ物は" + food + "です"); // 文字列と変数を	連結してコンソール出力
		System.out.println("BMIは" + ((double) Math.round(bmi * 10)) / 10 + "です"); //文字列と数値を連結してコンソール出力
		
		
		//問題9
		System.out.println("初めまして" + name + "です"); // 文字列と変数を連結してコンソール出力
		age += age; // 自己代入
		System.out.println("年齢は" + age + "歳です"); // 文字列と変数を連結してコンソール出力
		height += height; // 自己代入
		System.out.println("身長は" + height + "cmです"); // 文字列と変数を連結してコンソール出力
		weight += weight; // 自己代入
		System.out.println("体重は" + weight + "kgです"); // 文字列と変数を連結してコンソール出力
		System.out.println("好きな食べ物は" + food + "です"); // 文字列と変数を	連結してコンソール出力
		
		double bmi2 = weight / (height / 100) * (height / 100); // BMIの数式を宣言
		System.out.println("BMIは" + ((double) Math.round(bmi2 * 100.0)) / 100.0 + "です"); // BMIを出力
		
		
		//問題10
		age = 24;
		System.out.println((age>=25)?"true":"false"); //25歳以上ならtrueを出力
		
		//問題11
		String strAge = Integer.toString(age); // 年齢を文字列型に型変換
		height = 168.5;
		String strHeight = Double.toString(height); // 身長を文字列型に型変換
		weight = 64.2;
		String strWeight = Double.toString(weight); //体重を文字列型に型変換
		System.out.println(strAge + strHeight + strWeight); //年齢と身長を体重を連結してコンソール出力
		
		//問題12
		int numAge =  Integer.parseInt(strAge); // 年齢を整数型に型変換
		double numHeight = Double.parseDouble(strHeight); // 身長を整数型に型変換
		System.out.println(numAge); // 整数型の年齢をコンソール出力
		System.out.println(numHeight); // 整数型の身長をコンソール出力
		
		//問題13
		//　年齢が25歳以上もしくは身長が160cm以上ならtrueを出力
		System.out.println(numAge >= 25 || numHeight >= 160?"true":"false"); 
		
	}
}

