package thread;

public class ShowThread extends Thread{
	
	String threadName;
	
	public ShowThread(String name) {
		threadName = name;
	}

	@Override
	public void run() {
		//새로운 실행 환경에ㅓㅅ 처리할 코드를 작성
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("안녕하세요. "+threadName+"입니다");
			try {
				sleep(100); //밀리초 단위 object클래스에 있음
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(threadName+"스레드가 종료되었습니다");
		}
		
	}
	
	

}
