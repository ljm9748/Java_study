package thread;

public class ShowThread extends Thread{
	
	String threadName;
	
	public ShowThread(String name) {
		threadName = name;
	}

	@Override
	public void run() {
		//���ο� ���� ȯ�濡�ä� ó���� �ڵ带 �ۼ�
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("�ȳ��ϼ���. "+threadName+"�Դϴ�");
			try {
				sleep(100); //�и��� ���� objectŬ������ ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(threadName+"�����尡 ����Ǿ����ϴ�");
		}
		
	}
	
	

}
