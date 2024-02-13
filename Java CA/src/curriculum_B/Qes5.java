package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		for(int j = 1; j < 10; j ++) {
			for(int i = 1; i < 21; i ++) {
				System.out.printf("%03d*%03d=%03d", i, j, i*j);
				// 20だった場合
				if (i == 20) {
					// 改行
					System.out.println("\r\n");
				} else {
					// 1から19の場合は二重線を書く
					System.out.print(" || ");
				}
			}
		}
	}
}