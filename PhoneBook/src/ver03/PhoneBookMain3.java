package ver03;

public class PhoneBookMain3 {

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		System.out.println("���� ����� ������ ����: "+ manager.cnt);
		System.out.println("���� ������ ������ �� ����: "+ manager.phoneBook.length);
		
		//Scanner sc= new Scanner(System.in);
		
		while(true) {
			
		System.out.println("��ȭ��ȣ ���� ���α׷�=============");
		System.out.println("�޴��� �Է��ϼ���");
		System.out.println("1. ��������");
		System.out.println("2. ���� �˻�");
		System.out.println("3. ��������");
		System.out.println("4. ��ü ��������");
		System.out.println("5. ���α׷� ����");
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
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			break;
		}
		
		
		
		
		
		//System.out.println("���� ����� ������ ����: "+ manager.cnt);
		//manager.phoneBook[manager.cnt-1].showInfor();
		
		
		//manager.searchMember();
		}

	}

}
