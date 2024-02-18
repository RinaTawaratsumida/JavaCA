package curriculum_B;
import java.util.Scanner;

public class Qes7 {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		// 変数をそれぞれ宣言し初期化
		int score = 0;
		int sum = 0;
		int sum1 = 0;
		double ave = 0;
		
		
		// 科目
		String [] sub = {"英語", "数学", "理科", "社会"};
		
		// 人数入力の文章を出力
		System.out.print("生徒の人数を入力してください(２以上)：");
		
		// 入力スペース
		score = scan.nextInt();
		
		// 入力したものを読み取る
		int[][] point = new int[score][4];
		
		// 人数に応じて点数入力をさせる
		for(int i = 0; i < score; i++) {
			
			// 科目の配列の項目をカウントするための変数sを宣言・初期化
			int s = 0;
			// 科目の配列が4未満なら繰り返し文適用
			while(s < 4) {
			// 点数を入力指示
			System.out.print( (i + 1) + "人目の『" + sub[s] + "』の点数を入力してください：");
			// 入力スペース
			point[i][s++] = scan.nextInt();
			}
			System.out.print("\r\n");
		}
		
		// 個人ごとの平均点を出し所定の文章で出力する繰り返し文を作成
		for(int i = 0; i < score; i++) {
			// 人数のパートを固定し科目ごとの合計を出せるよう科目側の
			for (int t = 0; t < 4 ; t++) {
				// 平均を出すために多次元配列で合計を産出
				 sum += point[i][t];
			 }
			
			// 平均点を算出、doubleで小数で出せるようにする
			ave = (double)sum / point[i].length;
			
			// 「〇人目の平均点は〇点です」と小数第二位で出力
			System.out.println( (i + 1) + "人目の平均点は" + String.format("%.2f", ave) + "点です。");
			// 初期化
			sum = 0;
		}
		System.out.print("\r\n");
		
		
		// 科目初期化
		int s = 0;
		// 小数を表示できる変数numを宣言
		double[] num = new double[4]; 
		
		// 個人ごとの平均点を出す
		while(s < 4) {
			// 科目ごとの平均点のため大きなくくりで科目の項目数を条件設定し、合計を出すため人数カウントするための変数aを初期化
			int a = 0;
			// 入力した人数になるまで変数aを回す
			while(a < score) {
				// 平均を出すために合計を算出
				sum1 += point[a++][s];
			}
			
			// 平均点を計算
			ave = (double)sum1/ point.length;
			// 全体の平均を出すのに向けて
			num[s] = ave;
			
			// 科目ごとの平均点の文章を出力
			System.out.println(sub[s++] + "の平均点は" + String.format("%.2f", ave) + "点です。");
			// 初期化
			sum1 = 0;
		}
		System.out.print("\r\n");
		
		// 科目カウント変数sを初期化
		s = 0;
		// 変数宣言
		double sum2 = 0;
		
		// 4科目の平均を足す
		while(s < 4) {
			sum2 += num[s++];
		}
		// 4科目の平均を算出
		ave = sum2/4;
		// 全体の平均点は〇点ですと文章出力
		System.out.println("全体の平均点は" + String.format("%.2f", ave) + "点です。");
		
		scan.close();
	}

}