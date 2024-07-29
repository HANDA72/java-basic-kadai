package kadai_015;

// 車クラス
public class Car_Chapter15 {
	// フィールド
	private int gear  = 1;  // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	// コンストラクタ
	public Car_Chapter15( int gear, int speed ) {
		this.gear  = gear;
		this.speed = speed;
	}
        
	// 【メソッド】ギアの値により速度を変える
	public void gearChange( int afterGear ) {
		this.gear = afterGear;
		
		// ギアに応じた速度を取得
		speed = switch(afterGear) {
		case 1   -> 10;
		case 2   -> 20;
        　　　　　　　　　　　　　　　　case 3   -> 30;
        　　　　　　　　　　　　　　　　case 4   -> 40;
        　　　　　　　　　　　　　　　　case 5   -> 50;
        　　　　　　　　　　　　　　　　default  -> 10;
		};
	}
	
	// 【メソッド】ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println( "ギア1から" + this.gear +"に切り替えました" );
		System.out.println( "速度は時速" + this.speed + "kmです" );
	}
}
