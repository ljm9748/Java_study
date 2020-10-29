package thread;

public class AdderThreadMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();
		
		AdderThread1 t1 = new AdderThread1(sum, 1, 50);
		AdderThread1 t2 = new AdderThread1(sum, 51, 100);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100까지의 합: "+ sum.getNum());


	}

}
