package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		// 車クラスのインスタンスを生成する
		Car_Chapter15 redCar = new Car_Chapter15(1,10);
		
		// 車クラスのgearChangeメソッドを実行する
		redCar.gearChange(3);
		
		// 車クラスのrunメソッドを実行する
		redCar.run();
	}
}
