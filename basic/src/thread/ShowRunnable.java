package thread;

//������ Ŭ������ ������ �� ����� �ʿ��� ��� runnable�� �̿��� ����� �� �ִ�
public class ShowRunnable implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("�ȳ��ϼ��� runnable �Դϴ�.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("runnable�� ����Ǿ����ϴ�.");

		
	}

}
