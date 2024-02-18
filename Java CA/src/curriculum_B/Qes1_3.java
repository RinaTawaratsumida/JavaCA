package curriculum_B;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	
	public static void main (String[]args) {
		Scanner sc1 = new Scanner(System.in);
		
		// 名前を格納
		String name = "";
		
		// while文の中のif文でboolean型を使用し繰り返しを完結させる
		boolean bln = true;
		
		// ユーザー名についてルールに合うまで繰り返す
		while (bln) {
			// 名前入力
			name = sc1.nextLine();
			
			// 入力がないもしくは0文字以下の場合
			if (name == null || name.length() == 0) {
				// 「名前を入力してください」と出力
				System.out.println("名前を入力してください");
			  
			  // 11文字以上入力した場合
			} else if (name.length() >= 11) {
				// 「名前を10文字以内にしてください」と出力
				System.out.println("名前を10文字以内にしてください");
			
				// 半角英数字でない場合
			} else if (!(name.matches("^[A-Za-z0-9]+$"))){
					// 「半角英数字のみで名前を入力してください」出力
					System.out.println("半角英数字のみで名前を入力してください");
			} else {
				// 上記の条件に当てはまらなければ終わり
				bln = false;
			}
		}
		
		// 「ユーザー名～」の文章を出力
		System.out.println("ユーザー名" + name + "を登録しました");
		
		
		
		
		// 乱数を宣言
		Random rand = new Random();
		// while文の中のif文でboolean型を使用し繰り返しを完結させる
		boolean result = false;
		// 初期化
		int count = 0;
		
		// 勝つまで繰り返す
		while (!result) {
			// 自分の手を0,1,2で入力
			int myHands = sc1.nextInt();
			// 相手の手として0,1,2の数字をランダムに選択
			int yourHands = rand.nextInt(3);
			
			// 出力する文字をカタカナにする
			String[] janken = {"グー", "チョキ", "パー"};
			// ユーザー名の手について出力
			System.out.println(name +"の手は「" + janken[myHands] + "」");
			// 相手の手について出力
			System.out.println("相手の手は「" + janken[yourHands] +"」");
			
			// じゃんけんを行った回数をカウント
			count++;
			
			// 条件分岐の設定
			if (myHands == yourHands) {
				// あいこの場合「DRAW あいこ もう一回しましょう！」出力
				System.out.println("DRAW あいこ もう一回しましょう！");
				
			 } else if (myHands == 0 && yourHands == 2) {
			 	// 自分がグーで負けたら「負けは次につながるチャンスです！ネバーギブアップ！」
				System.out.println("負けは次につながるチャンスです！ネバーギブアップ！");
				
			 } else if (myHands == 1 && yourHands == 0) {
			 	// 自分がチョキで負けたら「俺の勝ち！たかがじゃんけん～」出力
			 	System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ");
			 	
			 } else if (myHands == 2 && yourHands == 1) {
			 	// 自分がパーで負けたら「俺の勝ち！なんで負けたか、明日まで考えといてください～」出力
			 	System.out.println("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです");
			 	
			 } else if ((myHands == 0 && yourHands == 1) ||
			 			(myHands == 1 && yourHands == 2) ||
			 			(myHands == 2 && yourHands == 0)) {
			 	// 自分がじゃんけんに勝ったら「次は俺にリベンジさせて」出力
			 	System.out.println("やるやん。次は俺にリベンジさせて");
			 	// 繰り返し終了
			 	result = true;
			 	// 「勝つまでにかかった合計回数～」出力
			 	System.out.println("勝つまでにかかった合計回数は" + count + "回です");
			 } 
		}
		sc1.close();
	}
}		