package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// インスタンスを作成
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		// 調べる英単語を配列にセットする
		String[] lists = {"apple","banana","grape","orange"};
		
		// 辞書を調べるメソッドを引数指定で呼び出す
		for (String fruit : lists) {
			dic.getValue(fruit);
		}

	}

}
