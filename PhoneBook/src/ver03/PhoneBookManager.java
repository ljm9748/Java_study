package ver03;

import ver02.PhoneInfor;

public class PhoneBookManager {


	// 배열: 전화번호 정미\보(이름, 전화ㅁ번호, 생일을 저장하는 목적
	//기능: 저장, 검색, 삭제
	
	final PhoneInfor[] phoneBook;
	int cnt;//  저장된 정의 개수
	
	//Scanner sc= new Scanner(System.in);
	
	
	//초기화
	PhoneBookManager(){
		//phoneBook=new PhoneInfor[100];
		this(100);
	}
	PhoneBookManager(int size){
		
		//sc = new Scanner(System.in);
		//size= sc.nextInt();
		phoneBook = new PhoneInfor[size];
	}
	
	void InsertMember() {//저장기능: 사용자로부터 데이터받아 인스턴스 생성하고 배열에 생성된 인스턴스 참조값저장
		System.out.println("친구의 정보 입력을 시작합니다");
		
		System.out.println("이름을 입력해 주세요");
		String name=Util.sc.nextLine();
		System.out.println("생일을 입력해 주세요");
		String birth=Util.sc.nextLine().trim();
		System.out.println("전화번호를 입력해 주세요");
		String num=Util.sc.nextLine();
		
		
		PhoneInfor infor= null;
		
		if(birth != null && !birth.isEmpty()) {
			infor = new PhoneInfor(name, num, birth);
		}else {
			infor= new PhoneInfor(name, num);
		}
		 
		phoneBook[cnt]=infor;
		cnt++;
	}
	
	void searchMember() { // 정보검색, 검색하고자하는 이름 받고 배열요소 변수의 값과 검색 이름 비교(동등비교), 해당 index 찾아 검색된 index로 정보출력
		
		//아예 정보가 없을 경우
		if(cnt==0) {
			System.out.println("정보가 없습니다");
			return;
			}
		//입력
		System.out.println("정보 검색을 시작합니다");
		System.out.println("찾고자하는 입력을 입력해 주세요 : ");
		String name= sc.nextLine();
		
		int index = -1; //찾고자하는 인덱스
		
		//검색
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].name.equals(name)) {
				index=i;
				break;
			}
		}
		//출력
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다");
		}else {
			phoneBook[index].showInfor();
		}
		
	}
	
	void deleteMember() {
		
		//아예 정보가 없을 경우
				if(cnt==0) {
					System.out.println("정보가 없습니다");
					return;
					}
		System.out.println("정보삭제를 진행합니다");
		System.out.println("삭제하고싶은 이름을 입력하세요: ");
		
		String name= sc.nextLine();
		
		int index = -1; //찾고자하는 인덱스
		
		//검색
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].name.equals(name)) {
				index=i;
				break;
			}
		}
		//출력
		if(index<0) {
			System.out.println("삭제하고자하는는 이름의 정보가 존재하지 않습니다");
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
			
		}
	} 
	
	int searchIndex(String name) {
		int index = -1; //찾고자하는 인덱스
		
		//검색
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].name.equals(name)) {
				index=i;
				break;
			}
		}
		return index;
	}


}
