package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String arg[]) {
		// キーボードからの入力を受け取るスキャナ
		Scanner scanner = new Scanner(System.in);
		// 入力された文字を受け取り
		String name = scanner.next();
		
		// 架電の台数を乱数で宣言
		Random rand = new Random();
		
		// 変数num初期化
		int num = 0;
		// 変数num1は0から11までの数字をランダムで出力
		int num1 = rand.nextInt(12);
		
		// 読点で区切る
		String[] names = name.split("、");
		
		// 1つ1つの家電を変数machineと宣言
		for(String machine : names) {
			// 変数numは0から11までの乱数として出力
			num = rand.nextInt(12);
			
			switch(machine) {
			// テレビ、ディスプレイと入力した場合
			case "テレビ", "ディスプレイ":
				// 台数について、テレビなら乱数、ディスプレイなら11からテレビの台数を引いた数
				num = machine.equals("テレビ") ? num1 : (11 - num1);
				// (家電名)の残り台数は〇台ですと出力
				System.out.println( machine + "の残り台数は" + num + "台です");
				break;
			
			// 冷蔵庫、扇風機、洗濯機、加湿器、パソコンと入力した場合
			case "冷蔵庫", "扇風機", "洗濯機", "加湿器", "パソコン":
				// (家電名)の残り台数は〇台ですと出力
				System.out.println(machine + "の残り台数は" + num + "台です");
				break;
			
			// caseの条件に当てはまらなかった場合
			default:
				// 『(入力名)』は指定商品ではありませんと出力
				System.out.println("『 " + machine + " 』は指定の商品ではありません");
				break;
			}			

		}
		scanner.close();
	}

}
