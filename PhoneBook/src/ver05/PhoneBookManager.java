package ver05;


public class PhoneBookManager {
	
	private PhoneInfor[] phoneBook;
	private int cnt;//  저장된 정의 개수
	
	
	//생성자: 싱글톤 처리 -> 외부에서 인스턴스 생성을 금지(private)
	private PhoneBookManager(int num){
		phoneBook = new PhoneInfor[num]; //생성자의 매개변수의 인자를 전달받아 배열 생성
		cnt=0;
	}
	//내부에서 인스턴스 생성
	private static PhoneBookManager manager= new PhoneBookManager(100);
	
	//외부에서 참조변수를 받을 수 있는 메서드
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	
	
	
	void addInfor(PhoneInfor info) {
		phoneBook[cnt]=info;
		cnt++;
	}
	
	void insertInfo() {
		
		if(phoneBook.length==cnt) {
			System.out.println("더이상 정보를 저장할 수 없습니다.\n 일부 정보를 삭제하고 저장 공간을 확보해 주세요.");
			return;
			
		}
		
		System.out.println("정보 입력을 시작합니다");
		System.out.println("어떤 정보를 입력하시겠습니까?");
		//System.out.println("1. 기본");  //추상클래스->인스턴스 생성불가
		System.out.println(Menu.UNIV+". 대학");
		System.out.println(Menu.COM+". 회사");
		System.out.println(Menu.CAFE+". 동호회");
		System.out.println("=====================================");
		
		int select = Util.sc.nextInt();
		Util.sc.nextLine();//버퍼비우기위해
		
		if(!(select>0 && select<5)) {
			System.out.println("메뉴선택이 올바르지 않습니다");
			System.out.println("초기 메뉴로 돌아갑니다");
			return;
		}
		
		System.out.println("친구의 정보 입력을 시작합니다");
		System.out.println("이름 >> ");
		String name=Util.sc.nextLine();
		System.out.println("전화번호>> ");
		String num=Util.sc.nextLine();
		System.out.println("주소>> ");
		String address=Util.sc.nextLine();
		System.out.println("이메일>> ");
		String email=Util.sc.nextLine();

		
		switch(select) {
//			case 1: 
//				addInfor(new PhoneInfor(name, num, address, email));
//
//				break;
			case Menu.UNIV:
				System.out.println("전공>> ");
				String major=Util.sc.nextLine();
				System.out.println("학년>> ");
				String year=Util.sc.nextLine();
				addInfor(new PhoneUnivInfor(name, num, address, email, major, year));
				break;
			case Menu.COM:
				System.out.println("회사이름>> ");
				String company=Util.sc.nextLine();
				addInfor(new PhoneCompanyInfor(name, num, address, email, company));
				break;
			case Menu.CAFE:
				System.out.println("동호회 이름>> ");
				String club=Util.sc.nextLine();
				System.out.println("닉네임>> ");
				String nickname=Util.sc.nextLine();
				addInfor(new PhoneCafeInfor(name, num, address, email, club, nickname));
				break;
			default:
				System.out.println("1~4 사이의 숫자를 입력해 주세요");
				break;
		}
		System.out.println("입력하신 정보가 저장되었습니다.");
		
	}
	private int searchIndex(String name) {
		int index = -1; //찾고자하는 인덱스
		
		//검색
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].getName().equals(name)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	void searchInfo() { // 정보검색, 검색하고자하는 이름 받고 배열요소 변수의 값과 검색 이름 비교(동등비교), 해당 index 찾아 검색된 index로 정보출력
		
		//아예 정보가 없을 경우
		if(cnt==0) {
			System.out.printf("정보가 없습니다");
			return;
			}
		//입력
		System.out.println("정보 검색을 시작합니다");
		System.out.println("찾고자하는 입력을 입력해 주세요 : ");
		String name= Util.sc.nextLine();
		int index=searchIndex(name);
		
		
		//출력
		if(index<0) {
			System.out.printf("입력하신 이름 %s의 정보가 없습니다\n", name);
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			phoneBook[index].showInfor();
		}
		
	}
	
	void deleteMember() {
		
		//아예 정보가 없을 경우
		if(cnt==0) {
			System.out.println("정보가 없습니다");
			System.out.println("초기메뉴로 이동합니다");
			return;
			}
		System.out.println("정보삭제를 진행합니다");
		System.out.println("삭제하고싶은 이름을 입력하세요: ");
		
		String name= Util.sc.nextLine();
		
		int index = searchIndex(name);
		
		//출력
		if(index<0) {
			System.out.println("삭제하고자하는는 이름의 정보가 존재하지 않습니다");
			System.out.println("초기메뉴로 이동합니다");
		}else {
			for (int i = index; i < cnt-1; i++) {
				phoneBook[index]=phoneBook[index+1];
			}
			cnt--;
			System.out.println("해당 정보를 삭제했습니다");
		}
		
	}
	
	void displayAll() {
		//아예 정보가 없을 경우
		if(cnt==0) {
			System.out.println("정보가 없습니다");
			return;
			}
		System.out.println("전체 정보를 출력합니다");
		for (int i = 0; i < cnt; i++) {
			phoneBook[i].showInfor();
			System.out.println("===================");
			
		}
	} 
	



}
