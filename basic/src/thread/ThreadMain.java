package thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowThread st1= new ShowThread("1��");
		ShowThread st2= new ShowThread("2��");
		
		//runnable �������̽� �̿��� thread
		Runnable target = new ShowRunnable();
		Thread st3= new Thread(target);
		
		//�켱���� ���� 1~10 : �⺻ 5
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		st1.setPriority(Thread.MAX_PRIORITY);
		
		
		st1.start();
		st2.start();
		st3.start();
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println("�ȳ��ϼ��� ���ν����� �Դϴ�.");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		
//		System.out.println("���� �����尡 ����Ǿ����ϴ�.");

	}

}
