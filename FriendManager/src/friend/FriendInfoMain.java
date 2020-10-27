package friend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("*** 메뉴 선택  ***");
			System.out.println(Menu.INSERT_HIGH+". 고교 친구 정보 저장");//이 형식도 가능
			System.out.println("2. 대학 친구 정보 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. EXIT");
			System.out.println("선택하세요>> ");
			
			int choice;
			try {
				choice = sc.nextInt();
				if(!(choice>Menu.INSERT_HIGH &&choice<Menu.EXIT)) {
					BadMenuExceptipn e= new BadMenuExceptipn("잘못된 메뉴 입력");
					throw e;
				}
			} catch (Exception e) {
				System.out.println("잘못된 메뉴 입력입니다\n 다시 선택해주세요");
				sc.nextLine();
				continue;
			}

			
			
			switch(choice) {
			case Menu.INSERT_HIGH: case Menu.INSERT_UNIV:
				handler.addFriends(choice);
				break;
			case Menu.SHOW_ALL:
				handler.showAllData();
				break;
			case Menu.SHOW_BASEIC:
				handler.showAllSimpleData();
				break;
			case Menu.EXIT:
				break;
			default:
				System.out.println("1~5중에 선택해 주세요");
				break;
			}
			
		}

	}

}
