package ver04;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager(100);


		while(true) {
			
		System.out.println("전화번호 관리 프로그램=============");
		System.out.println("메뉴를 입력하세요");
		System.out.println("1. 저장");
		System.out.println("2. 검색");
		System.out.println("3. 삭제");
		System.out.println("4. 모든 정보 출력");
		System.out.println("5. EXIT");
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
			case 1:
				manager.insertInfo();
				break;
			case 2:
				manager.searchInfo();
				break;
			case 3:
				manager.deleteMember();
				break;
			case 4:
				manager.displayAll();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
				//System.exit(0);
			default:
				break;
			}
		

		}

	}

}
