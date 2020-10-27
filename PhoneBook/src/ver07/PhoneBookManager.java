package ver07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class PhoneBookManager implements Util{
	
	//private PhoneInfor[] phoneBook;
	//private int cnt;//  저장된 정의 개수
	
	List<PhoneInfor> phoneBook;
	
	//생성자: 싱글톤 처리 -> 외부에서 인스턴스 생성을 금지(private)
	private PhoneBookManager(int num){
		//phoneBook = new PhoneInfor[num]; //생성자의 매개변수의 인자를 전달받아 배열 생성
		//cnt=0;
		
		//List<PhoneInfor> 초기화
		phoneBook = new ArrayList<PhoneInfor>();
		//파일에서 인스턴스들을 로드
		load();
		
	}
	//내부에서 인스턴스 생성
	private static PhoneBookManager manager= new PhoneBookManager(100);
	
	//외부에서 참조변수를 받을 수 있는 메서드
	public static PhoneBookManager getInstance() {
		return manager;
	}

	void addInfor(PhoneInfor info) {
		//List에 정보 저장
		phoneBook.add(info);
	}
	
	void insertInfo() {
		
		/*
		if(phoneBook.length==cnt) {
			System.out.println("더이상 정보를 저장할 수 없습니다.\n 일부 정보를 삭제하고 저장 공간을 확보해 주세요.");
			return;
			
		}
		List는 저장공간이 부족하면 저장공간을 확장
		*/ 
		int select=0;
		while(true) {
			System.out.println("정보 입력을 시작합니다");
			System.out.println("어떤 정보를 입력하시겠습니까?");
			//System.out.println("1. 기본");  //추상클래스->인스턴스 생성불가
			System.out.println(Menu.UNIV+". 대학");
			System.out.println(Menu.COM+". 회사");
			System.out.println(Menu.CAFE+". 동호회");
			System.out.println("=====================================");
			
			try {
				select = SC.nextInt();
				SC.nextLine();//버퍼비우기위해	
				if(!(select>0 && select<5)) {

					BadInputException e= new BadInputException(String.valueOf(select));
					throw e;
				}
					
			} catch(InputMismatchException | BadInputException e) {
				System.out.println("잘못된 메뉴입력입니다 다시 선택해주세요");
				SC.nextLine();
				continue;
			
			
			}
			break;
		}
		System.out.println("친구의 정보 입력을 시작합니다");
		System.out.println("이름 >> ");
		String name=SC.nextLine();
		System.out.println("전화번호>> ");
		String num=SC.nextLine();
		System.out.println("주소>> ");
		String address=SC.nextLine();
		System.out.println("이메일>> ");
		String email=SC.nextLine();

		//select = SC.nextInt();
		
		switch(select) {
//			case 1: 
//				addInfor(new PhoneInfor(name, num, address, email));
//
//				break;
			case Menu.UNIV:
				System.out.println("전공>> ");
				String major=SC.nextLine();
				System.out.println("학년>> ");
				String year=SC.nextLine();
				addInfor(new PhoneUnivInfor(name, num, address, email, major, year));
				break;
			case Menu.COM:
				System.out.println("회사이름>> ");
				String company=SC.nextLine();
				addInfor(new PhoneCompanyInfor(name, num, address, email, company));
				break;
			case Menu.CAFE:
				System.out.println("동호회 이름>> ");
				String club=SC.nextLine();
				System.out.println("닉네임>> ");
				String nickname=SC.nextLine();
				addInfor(new PhoneCafeInfor(name, num, address, email, club, nickname));
				break;
			default:
				System.out.println("1~4 사이의 숫자를 입력해 주세요");
				break;
		}
		System.out.println("입력하신 정보가 저장되었습니다.");
		
	}
	
	//List의 index찾기
	private int searchIndex(String name) {
		int index = -1; //찾고자하는 인덱스
		
		//검색
		for (int i = 0; i <phoneBook.size(); i++) {
			if(phoneBook.get(i).getName().equals(name)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	void searchInfo() { // 정보검색, 검색하고자하는 이름 받고 배열요소 변수의 값과 검색 이름 비교(동등비교), 해당 index 찾아 검색된 index로 정보출력
		
		//아예 정보가 없을 경우
		if(phoneBook.size()==0) {
			System.out.printf("정보가 없습니다");
			return;
			}
		//입력
		System.out.println("정보 검색을 시작합니다");
		System.out.println("찾고자하는 입력을 입력해 주세요 : ");
		String name= SC.nextLine();
		int index=searchIndex(name);
		
		
		//출력
		if(index<0) {
			System.out.printf("입력하신 이름 %s의 정보가 없습니다\n", name);
			System.out.println("메뉴로 돌아갑니다.");
		}else {
			phoneBook.get(index).showInfor();
		}
		
	}
	
	void deleteMember() {
		
		//아예 정보가 없을 경우
		if(phoneBook.size()==0) {
			System.out.println("정보가 없습니다");
			System.out.println("초기메뉴로 이동합니다");
			return;
			}
		System.out.println("정보삭제를 진행합니다");
		System.out.println("삭제하고싶은 이름을 입력하세요: ");
		
		String name= SC.nextLine();
		
		int index = searchIndex(name);
		
		//출력
		if(index<0) {
			System.out.println("삭제하고자하는는 이름의 정보가 존재하지 않습니다");
			System.out.println("초기메뉴로 이동합니다");
		}else {
			phoneBook.remove(index);
			System.out.println("해당 정보를 삭제했습니다");
		}
		
	}
	
	void displayAll() {
		//아예 정보가 없을 경우
		if(phoneBook.size()==0) {
			System.out.println("정보가 없습니다");
			return;
			}
		System.out.println("전체 정보를 출력합니다");
		for (int i = 0; i < phoneBook.size(); i++) {
			phoneBook.get(i).showInfor();
			System.out.println("===================");
			
		}
		
		
	} 
	

	public void save() {
		if(phoneBook.size()==0) {
			System.out.println("저장된 데이터가 없어 파일의 저장이 되지 않습니다");
			return;
			}
		
		//인스턴스를 저장할 수 있는 출력 스트림 생성
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("phonebook.ser"));
//			for (PhoneInfor pi :phoneBook) {
//				out.writeObject(pi);
//			}
			out.writeObject(phoneBook);
			out.close();
			System.out.println("저장되었습니다");
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("저장하는 과정에 오류가 발생했습니다. \n다시 시도해 주세요"+ e.getMessage());
		}
		
	}
	
	//프로그램으로 파일의 저장 데이터를 로드
	void load() {
		//파일 존재여부 확인
		File file = new File("phonebook.ser");
		if(!file.exists()) {
			System.out.println("저장된 파일이 존재하지 않습니다. 파일 저장후 로드가 됩니다.");
			return;
		}
		//파일에 있는 데이터르 ㄹ메모리에 저장: phoneBook에 저장
		//파일의 데이터를 읽을 수 있는 스트림 생성
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("phonebook.ser"));
			/*
			while(true) {
				Object obj = in.readObject();
				
				if(obj==null) break;
				phoneBook.add((PhoneInfor) obj);
			}
			*/
			phoneBook = (List<PhoneInfor>) in.readObject();
			System.out.println("데이터 로드 완료");
		}catch(IOException e) {
			//System.out.println("데이터를 로드하는 과정에 오류가 발생했습니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터를 로드하는 과정에 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}


}
