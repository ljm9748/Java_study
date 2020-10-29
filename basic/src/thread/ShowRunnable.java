package thread;

//스레드 클래스를 정의할 때 상속이 필요한 경우 runnable을 이용해 상속할 수 있다
public class ShowRunnable implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("안녕하세요 runnable 입니다.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("runnable이 종료되었습니다.");

		
	}

}
