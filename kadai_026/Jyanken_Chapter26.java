package kadai_026;

import java.util.Scanner;
import java.util.HashMap;

public class Jyanken_Chapter26 {
	
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		
		// ルール提示
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		// Scannerクラスのオブジェクト生成
		Scanner scanner = new Scanner(System.in);
		
		// 入力した内容を取得する
		String myChoice = scanner.next();
		
		// 入力チェック
		while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p")) {
			System.out.println("入力が不適切でした");
			System.out.println("じゃんけんの手を入力しましょう");
			System.out.println("グー：r　チョキ：s　パー：p");
			myChoice = scanner.next();
		}

		// クローズ
		scanner.close();
		
		// 手を返す
		return myChoice;
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		// 配列にじゃんけんの手をセットする
		String [] otherChoice = {"r","s","p"};
		
		// 乱数で対戦相手のじゃんけんの手を選ぶ
		int random = (int)Math.floor(Math.random() * 3);
		
		// 手を返す
		return otherChoice[random];
	}
	
	// じゃんけんを行う
	public void playGame(String myChoice, String otherChoice) {
		
		// HashMap作成
		HashMap<String, String> jankenMap = new HashMap<String, String>();
		
		jankenMap.put("r", "グー");
		jankenMap.put("s", "チョキ");
		jankenMap.put("p", "パー");
		
		// じゃんけんの手を出力
		System.out.println("自分の手は" + jankenMap.get(myChoice) + "、対戦相手の手は" + jankenMap.get(otherChoice));;
		
		// じゃんけんの手を比較
		if (myChoice.equals("r")) {
			switch (otherChoice) {
			case "r" -> System.out.println("あいこです");
			case "s" -> System.out.println("自分の勝ちです");
			case "p" -> System.out.println("自分の負けです");
			default -> System.out.println("エラー");
			}
		} else if (myChoice.equals("s")) {
			switch (otherChoice) {
			case "r" -> System.out.println("自分の負けです");
			case "s" -> System.out.println("あいこです");
			case "p" -> System.out.println("自分の勝ちです");
			default -> System.out.println("エラー");
			}
		} else if (myChoice.equals("p")) {
			switch (otherChoice) {
			case "r" -> System.out.println("自分の勝ちです");
			case "s" -> System.out.println("自分の負けです");
			case "p" -> System.out.println("あいこです");
			default -> System.out.println("エラー");
			}
			
		}
		
	}

}
