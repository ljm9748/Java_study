package first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		int num1=0, num2=0;
		while(true) {
			
			try {
				System.out.println("�ΰ��� ������ �Է��� �ּ���");
				
				System.out.println("���� 1 >> ");
				num1=sc.nextInt();
				sc.nextLine();
				System.out.println("���� 2 >> ");
				num2=sc.nextInt();
				sc.nextLine();
					
			} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("�ùٸ� �޴��� �������� �ʾҽ��ϴ�. �ٽ� ������ �ּ���");
					System.out.println(e.getMessage());
					sc.nextLine();
					continue;
					
			}
			break;
		}
		
		
		
		
		try {
		
		System.out.println("�������� �� : "+(num1/num2));
		System.out.println("�������� ������: "+(num1%num2));
			
		} catch (ArithmeticException aex) {
			// TODO: handle exception
			System.out.println("0���� �����⸦ �� �� �����ϴ�.");
			System.out.println(aex.getMessage());
		}
		
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
