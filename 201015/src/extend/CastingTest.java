package extend;

public class CastingTest {
	public static void main(String[] args) {
		
		//���� Ŭ���� Ÿ���� ��������
		Car1 car =null;
		FireEngine fe= null;
		
		car = new FireEngine();
		fe = new FireEngine();
		
		//�̰� �Ұ� fe = new Car1();
		
		FireEngine fe2 = null;
		fe.water();
		
		//����ȯ ���� ��������
		//car = (Car1)fe; // Car1 = (Car1)FireEngine
		car = fe;
		
		//car.water();//Ÿ���� Car1�̶� water()����
		
		fe2=(FireEngine)car; // ����Ÿ�Կ��� �ڼ�Ÿ�������� ����ȯ�� ����� ĳ
		
	}
}

class Car1{
	private String color;
	private int door;
	
	void drive() {
		System.out.println("�����Ѵ�");
		
	}
	void stop() {
		System.out.println("�����");
	}
}

class FireEngine extends Car1{
	void water() {
		System.out.println("�� �Ѹ���");
	}
}