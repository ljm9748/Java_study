package first;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요:");
		int score=sc.nextInt();
		if (score<100) System.out.println("100미만입니다");
		else if (score<200) System.out.println("100이상 200미만입니다");
		else if (score<300) System.out.println("200이상 300미만입니다");
		else if (score<400) System.out.println("300이상 400미만입니다");
		else System.out.println("400이상입니다");
	}

}
