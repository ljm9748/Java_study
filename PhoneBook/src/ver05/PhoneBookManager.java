package ver05;


public class PhoneBookManager {
	
	private PhoneInfor[] phoneBook;
	private int cnt;//  ����� ���� ����
	
	
	//������: �̱��� ó�� -> �ܺο��� �ν��Ͻ� ������ ����(private)
	private PhoneBookManager(int num){
		phoneBook = new PhoneInfor[num]; //�������� �Ű������� ���ڸ� ���޹޾� �迭 ����
		cnt=0;
	}
	//���ο��� �ν��Ͻ� ����
	private static PhoneBookManager manager= new PhoneBookManager(100);
	
	//�ܺο��� ���������� ���� �� �ִ� �޼���
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	
	
	
	void addInfor(PhoneInfor info) {
		phoneBook[cnt]=info;
		cnt++;
	}
	
	void insertInfo() {
		
		if(phoneBook.length==cnt) {
			System.out.println("���̻� ������ ������ �� �����ϴ�.\n �Ϻ� ������ �����ϰ� ���� ������ Ȯ���� �ּ���.");
			return;
			
		}
		
		System.out.println("���� �Է��� �����մϴ�");
		System.out.println("� ������ �Է��Ͻðڽ��ϱ�?");
		//System.out.println("1. �⺻");  //�߻�Ŭ����->�ν��Ͻ� �����Ұ�
		System.out.println(Menu.UNIV+". ����");
		System.out.println(Menu.COM+". ȸ��");
		System.out.println(Menu.CAFE+". ��ȣȸ");
		System.out.println("=====================================");
		
		int select = Util.sc.nextInt();
		Util.sc.nextLine();//���ۺ�������
		
		if(!(select>0 && select<5)) {
			System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�");
			System.out.println("�ʱ� �޴��� ���ư��ϴ�");
			return;
		}
		
		System.out.println("ģ���� ���� �Է��� �����մϴ�");
		System.out.println("�̸� >> ");
		String name=Util.sc.nextLine();
		System.out.println("��ȭ��ȣ>> ");
		String num=Util.sc.nextLine();
		System.out.println("�ּ�>> ");
		String address=Util.sc.nextLine();
		System.out.println("�̸���>> ");
		String email=Util.sc.nextLine();

		
		switch(select) {
//			case 1: 
//				addInfor(new PhoneInfor(name, num, address, email));
//
//				break;
			case Menu.UNIV:
				System.out.println("����>> ");
				String major=Util.sc.nextLine();
				System.out.println("�г�>> ");
				String year=Util.sc.nextLine();
				addInfor(new PhoneUnivInfor(name, num, address, email, major, year));
				break;
			case Menu.COM:
				System.out.println("ȸ���̸�>> ");
				String company=Util.sc.nextLine();
				addInfor(new PhoneCompanyInfor(name, num, address, email, company));
				break;
			case Menu.CAFE:
				System.out.println("��ȣȸ �̸�>> ");
				String club=Util.sc.nextLine();
				System.out.println("�г���>> ");
				String nickname=Util.sc.nextLine();
				addInfor(new PhoneCafeInfor(name, num, address, email, club, nickname));
				break;
			default:
				System.out.println("1~4 ������ ���ڸ� �Է��� �ּ���");
				break;
		}
		System.out.println("�Է��Ͻ� ������ ����Ǿ����ϴ�.");
		
	}
	private int searchIndex(String name) {
		int index = -1; //ã�����ϴ� �ε���
		
		//�˻�
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].getName().equals(name)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	void searchInfo() { // �����˻�, �˻��ϰ����ϴ� �̸� �ް� �迭��� ������ ���� �˻� �̸� ��(�����), �ش� index ã�� �˻��� index�� �������
		
		//�ƿ� ������ ���� ���
		if(cnt==0) {
			System.out.printf("������ �����ϴ�");
			return;
			}
		//�Է�
		System.out.println("���� �˻��� �����մϴ�");
		System.out.println("ã�����ϴ� �Է��� �Է��� �ּ��� : ");
		String name= Util.sc.nextLine();
		int index=searchIndex(name);
		
		
		//���
		if(index<0) {
			System.out.printf("�Է��Ͻ� �̸� %s�� ������ �����ϴ�\n", name);
			System.out.println("�޴��� ���ư��ϴ�.");
		}else {
			phoneBook[index].showInfor();
		}
		
	}
	
	void deleteMember() {
		
		//�ƿ� ������ ���� ���
		if(cnt==0) {
			System.out.println("������ �����ϴ�");
			System.out.println("�ʱ�޴��� �̵��մϴ�");
			return;
			}
		System.out.println("���������� �����մϴ�");
		System.out.println("�����ϰ���� �̸��� �Է��ϼ���: ");
		
		String name= Util.sc.nextLine();
		
		int index = searchIndex(name);
		
		//���
		if(index<0) {
			System.out.println("�����ϰ����ϴ´� �̸��� ������ �������� �ʽ��ϴ�");
			System.out.println("�ʱ�޴��� �̵��մϴ�");
		}else {
			for (int i = index; i < cnt-1; i++) {
				phoneBook[index]=phoneBook[index+1];
			}
			cnt--;
			System.out.println("�ش� ������ �����߽��ϴ�");
		}
		
	}
	
	void displayAll() {
		//�ƿ� ������ ���� ���
		if(cnt==0) {
			System.out.println("������ �����ϴ�");
			return;
			}
		System.out.println("��ü ������ ����մϴ�");
		for (int i = 0; i < cnt; i++) {
			phoneBook[i].showInfor();
			System.out.println("===================");
			
		}
	} 
	



}
