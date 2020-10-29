package thread;

public class AdderThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adderthread at1= new Adderthread(1, 50);
		Adderthread at2= new Adderthread(51, 100);
		
		//thread생성
		Thread t1= new Thread(at1);
		Thread t2= new Thread(at2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();//t1 스레드가 종료 될때까지 다른 스레드는 멈춘 상태
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100 까지의 합은 : " + (at1.getNum()+at2.getNum()));

	}

}
