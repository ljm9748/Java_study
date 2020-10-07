package child;

import java.util.Scanner;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Child 어린이1 = new Child();
		Child 어린이2 = new Child();
		boolean firstWin=false;//어린이 1이 이겼는지 알수 있는 boolean값
		int getmarble;//이긴사람이 받은 구슬 수
		String input;
		
		어린이1.marble=15;
		어린이2.marble=9;
		
		
		for (int i = 1; i < 3; i++) {
			System.out.println("어린이 1이 이겼나요?(y/n)");
			input=sc.next();
			System.out.println("이긴 어린이가 몇개의 구슬을 얻었나요?");
			getmarble=sc.nextInt();
			
			if(input.equals("y") || input.equals("Y")) {
				어린이1.winnerTake(어린이2, getmarble);
				System.out.printf("%d차 게임에서 어린이1은 어린이2의 구슬 %d개를 획득한다\n", i, getmarble );
			}else {
				어린이2.winnerTake(어린이1, getmarble);
				System.out.printf("%d차 게임에서 어린이2는 어린이1의 구슬 %d개를 획득한다\n", i, getmarble);
			}
			
		}
	}
}
