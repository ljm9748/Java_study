package thread;

import javax.swing.JOptionPane;

public class ThreadTestMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String age =JOptionPane.showInputDialog("���̸� �Է��� �ּ���");

		int ageNumber= Integer.parseInt(age);
		
		System.out.println("���ǳ��̴� "+age+"���Դϴ�");
		
		for (int i = 10; i >0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
