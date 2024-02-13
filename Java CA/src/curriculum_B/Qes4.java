package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// 1から9までの数字を宣言
		int[] kuku = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		// 九九の繰り返し文
		for (int i : kuku) {
			for (int j : kuku) {
				// 数式の書式を指定、繰り返している数字を代入
				System.out.printf("%02d*%02d=%02d", i, j, i*j);
				// 9だった場合
				if (j == 9) {
					// 改行
					System.out.println("\r\n");
				} else {
					// 1から8の場合は二重線を書く
					System.out.print(" ||");
				}
			}
		}
	}

}
