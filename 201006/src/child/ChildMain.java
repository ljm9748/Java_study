package child;

import java.util.Scanner;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Child ���1 = new Child();
		Child ���2 = new Child();
		boolean firstWin=false;//��� 1�� �̰���� �˼� �ִ� boolean��
		int getmarble;//�̱����� ���� ���� ��
		String input;
		
		���1.marble=15;
		���2.marble=9;
		
		
		for (int i = 1; i < 3; i++) {
			System.out.println("��� 1�� �̰峪��?(y/n)");
			input=sc.next();
			System.out.println("�̱� ��̰� ��� ������ �������?");
			getmarble=sc.nextInt();
			
			if(input.equals("y") || input.equals("Y")) {
				���1.winnerTake(���2, getmarble);
				System.out.printf("%d�� ���ӿ��� ���1�� ���2�� ���� %d���� ȹ���Ѵ�\n", i, getmarble );
			}else {
				���2.winnerTake(���1, getmarble);
				System.out.printf("%d�� ���ӿ��� ���2�� ���1�� ���� %d���� ȹ���Ѵ�\n", i, getmarble);
			}
			
		}
	}
}
