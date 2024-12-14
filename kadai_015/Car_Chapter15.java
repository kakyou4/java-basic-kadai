package kadai_015;

public class Car_Chapter15 {
	
	// フィールドの設定
	private int  gear = 1; // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	// インスタンス生成メソッド
	public Car_Chapter15( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// ギアの値により速度を変えるメソッド
	public void gearChange (int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear +"に切り替えました");
		this.gear = afterGear;
	}
	
	// ギアチェンジ後の速度を表示するメソッド
	public void run() {
		switch(gear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		default -> speed = 10;
		}
		System.out.println("速度は時速" + speed + "です");
	}

}
