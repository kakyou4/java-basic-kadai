package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// HashMapの定義
	private HashMap<String,String> dictionaryMap = new HashMap<>();
	
	// 初期化ブロック
	public Dictionary_Chapter21() {
		
		// 辞書データ
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウィ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscat","マスカット");
		dictionaryMap.put("cherry","さくらんぼ");
	}
	
	// 取得するためのメソッド
	public void getValue(String word) {

		int hit = 0; // 検索一致確認用

		// 辞書に追加された数まで繰り返し
		for(String key : dictionaryMap.keySet()) {

			// 一致確認
			if(word.equals(key)) {
				// 検索一致あれば1加算
				hit += 1;
				System.out.println(word + "の意味は" + dictionaryMap.get(word));
			}
		}
		
		// 検索一致が1件もなければ辞書にない旨出力
		if (hit == 0) {
			System.out.println(word + "は辞書に存在しません");
		}

	}
}
