package first;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���:");
		int score=sc.nextInt();
		if (score<100) System.out.println("100�̸��Դϴ�");
		else if (score<200) System.out.println("100�̻� 200�̸��Դϴ�");
		else if (score<300) System.out.println("200�̻� 300�̸��Դϴ�");
		else if (score<400) System.out.println("300�̻� 400�̸��Դϴ�");
		else System.out.println("400�̻��Դϴ�");
	}

}
