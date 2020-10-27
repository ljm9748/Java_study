package ver06;

import java.util.InputMismatchException;

public class PhoneBookMain implements Util{

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager= PhoneBookManager.getInstance();

		int select=0;
		while(true) {
			
		System.out.println("전화번호 관리 프로그램=============");
		System.out.println("메뉴를 입력하세요");
		System.out.println(Menu.INSERT+". 저장");
		System.out.println(Menu.SEARCH+". 검색");
		System.out.println(Menu.DELETE+". 삭제");
		System.out.println(Menu.DISPLAY_ALL+". 모든 정보 출력");
		System.out.println(Menu.EXIT+". EXIT");
		System.out.println("=============================");
		
		//char insertMenu= Util.sc.nextLine().charAt(0);
		
		try {
		 select= SC.nextInt();
		
		if(!(select>0 && select<6)) {
			System.out.println("메뉴선택이 올바르지 않습니다");
			System.out.println("다시 선택해 주세요");
			BadInputException e= new BadInputException(String.valueOf(select));
			throw e;
			
		}
		}catch(InputMismatchException | BadInputException e) {
			System.out.println("메뉴의 선택이 잘못되었습니다");
			SC.nextLine();
			continue;
		}catch(Exception e1) {
			
			e1.printStackTrace();
			System.out.println("메뉴의 선택이 잘못되었습니다");
			SC.nextLine();
			continue;
		}
		SC.nextLine();
			switch(select) {
			case Menu.INSERT:
				manager.insertInfo();
				break;
			case Menu.SEARCH:
				manager.searchInfo();
				break;
			case Menu.DELETE:
				manager.deleteMember();
				break;
			case Menu.DISPLAY_ALL:
				manager.displayAll();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
				//System.exit(0);
			default:
				break;
			}
		

		}

	}

}
