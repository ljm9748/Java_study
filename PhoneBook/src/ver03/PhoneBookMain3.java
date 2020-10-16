package ver03;

public class PhoneBookMain3 {

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		System.out.println("현재 저장된 정보의 개수: "+ manager.cnt);
		System.out.println("저장 가능한 정보의 총 개수: "+ manager.phoneBook.length);
		
		//Scanner sc= new Scanner(System.in);
		
		while(true) {
			
		System.out.println("전화번호 관리 프로그램=============");
		System.out.println("메뉴를 입력하세요");
		System.out.println("1. 정보저장");
		System.out.println("2. 정보 검색");
		System.out.println("3. 정보삭제");
		System.out.println("4. 전체 정보보기");
		System.out.println("5. 프로그램 종료");
		System.out.println("=============================");
		
		char insertMenu= Util.sc.nextLine().charAt(0);
		
		switch(insertMenu) {
		case '1':
			manager.InsertMember();
			break;
		case '2':
			manager.searchMember();
			break;
		case '3':
			break;
		case '4':
			manager.displayAll();
			break;
		case '5':
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			break;
		}
		
		
		
		
		
		//System.out.println("현재 저장된 정보의 개수: "+ manager.cnt);
		//manager.phoneBook[manager.cnt-1].showInfor();
		
		
		//manager.searchMember();
		}

	}

}
