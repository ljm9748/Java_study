package ver05;

public class PhoneBookMain {

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager= PhoneBookManager.getInstance();

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
		int select = Util.sc.nextInt();
		Util.sc.nextLine();
		if(!(select>0 && select<6)) {
			System.out.println("메뉴선택이 올바르지 않습니다");
			System.out.println("다시 선택해 주세요");
			continue;
		}
		
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
