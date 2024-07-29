package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		// インスタンス
		Car_Chapter15 car = new Car_Chapter15( 1, 10);
		
		// ギアを3に変更
		car.gearChange(3);
		car.run();
	}
}
