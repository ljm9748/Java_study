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
				System.out.println("두개의 정수를 입력해 주세요");
				
				System.out.println("숫자 1 >> ");
				num1=sc.nextInt();
				sc.nextLine();
				System.out.println("숫자 2 >> ");
				num2=sc.nextInt();
				sc.nextLine();
					
			} catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("올바른 메뉴를 선택하지 않았습니다. 다시 선택해 주세요");
					System.out.println(e.getMessage());
					sc.nextLine();
					continue;
					
			}
			break;
		}
		
		
		
		
		try {
		
		System.out.println("나눗셈의 몫 : "+(num1/num2));
		System.out.println("나눗셈의 나머지: "+(num1%num2));
			
		} catch (ArithmeticException aex) {
			// TODO: handle exception
			System.out.println("0으로 나누기를 할 수 없습니다.");
			System.out.println(aex.getMessage());
		}
		
		
		System.out.println("프로그램을 종료합니다.");

	}

}
