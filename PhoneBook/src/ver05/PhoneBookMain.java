package ver05;

public class PhoneBookMain {

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager= PhoneBookManager.getInstance();

		while(true) {
			
		System.out.println("��ȭ��ȣ ���� ���α׷�=============");
		System.out.println("�޴��� �Է��ϼ���");
		System.out.println(Menu.INSERT+". ����");
		System.out.println(Menu.SEARCH+". �˻�");
		System.out.println(Menu.DELETE+". ����");
		System.out.println(Menu.DISPLAY_ALL+". ��� ���� ���");
		System.out.println(Menu.EXIT+". EXIT");
		System.out.println("=============================");
		
		//char insertMenu= Util.sc.nextLine().charAt(0);
		int select = Util.sc.nextInt();
		Util.sc.nextLine();
		if(!(select>0 && select<6)) {
			System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�");
			System.out.println("�ٽ� ������ �ּ���");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
				//System.exit(0);
			default:
				break;
			}
		

		}

	}

}
