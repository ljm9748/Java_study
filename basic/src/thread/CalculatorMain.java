package thread;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try {
			at.join();
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("������ Ƚ��: "+ cal.opCnt);

	}

}

class AddThread extends Thread{
	Calculator cal;
	
	AddThread(Calculator c){
		cal = c;
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("1+2="+cal.add(1,2));
			System.out.println("2+4="+cal.add(2,4));
		}
		
	}
	
}

class MinThread extends Thread{
	Calculator cal;
	
	public MinThread(Calculator c) {
		cal = c;
	}
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("2-1="+cal.minus(2,1));
			System.out.println("4-2="+cal.minus(4,2));
		}
		
	}
	
	
}