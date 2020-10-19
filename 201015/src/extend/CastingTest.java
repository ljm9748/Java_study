package extend;

public class CastingTest {
	public static void main(String[] args) {
		
		//조상 클래스 타입의 참조변수
		Car1 car =null;
		FireEngine fe= null;
		
		car = new FireEngine();
		fe = new FireEngine();
		
		//이건 불가 fe = new Car1();
		
		FireEngine fe2 = null;
		fe.water();
		
		//형번환 연산 생략가능
		//car = (Car1)fe; // Car1 = (Car1)FireEngine
		car = fe;
		
		//car.water();//타입이 Car1이라 water()못씀
		
		fe2=(FireEngine)car; // 조상타입에서 자손타입으로의 형변환은 명시적 캐
		
	}
}

class Car1{
	private String color;
	private int door;
	
	void drive() {
		System.out.println("운전한다");
		
	}
	void stop() {
		System.out.println("멈춘다");
	}
}

class FireEngine extends Car1{
	void water() {
		System.out.println("물 뿌린다");
	}
}