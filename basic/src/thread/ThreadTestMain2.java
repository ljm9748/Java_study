package thread;

import javax.swing.JOptionPane;

public class ThreadTestMain2 {
	
	//�ٸ� �����忡�� ������ ������ Ŭ���� ����
	public static boolean check = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputAgeThread iat = new InputAgeThread();
		CountDownThread cdt = new CountDownThread();
		iat.start();
		cdt.start();
		
//		String age =JOptionPane.showInputDialog("���̸� �Է��� �ּ���");
//
//		int ageNumber= Integer.parseInt(age);
//		
//		System.out.println("���ǳ��̴� "+age+"���Դϴ�");
		
//		for (int i = 10; i >0 ; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

}


class InputAgeThread extends Thread{

	@Override
	public void run() {
		System.out.println("10�ʾȿ� �Է����ּ���");
		String age =JOptionPane.showInputDialog("���̸� �Է��� �ּ���");

		
		System.out.println("���ǳ��̴� "+age+"���Դϴ�");
		ThreadTestMain2.check=true;
	}


}

class CountDownThread extends Thread{

	@Override
	public void run() {
		for (int i = 10; i >0 ; i--) {
			if(ThreadTestMain2.check) break;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.exit(0);
	}
	
	
}
