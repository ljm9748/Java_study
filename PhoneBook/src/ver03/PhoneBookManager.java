package ver03;

import ver02.PhoneInfor;

public class PhoneBookManager {


	// �迭: ��ȭ��ȣ ����\��(�̸�, ��ȭ����ȣ, ������ �����ϴ� ����
	//���: ����, �˻�, ����
	
	final PhoneInfor[] phoneBook;
	int cnt;//  ����� ���� ����
	
	//Scanner sc= new Scanner(System.in);
	
	
	//�ʱ�ȭ
	PhoneBookManager(){
		//phoneBook=new PhoneInfor[100];
		this(100);
	}
	PhoneBookManager(int size){
		
		//sc = new Scanner(System.in);
		//size= sc.nextInt();
		phoneBook = new PhoneInfor[size];
	}
	
	void InsertMember() {//������: ����ڷκ��� �����͹޾� �ν��Ͻ� �����ϰ� �迭�� ������ �ν��Ͻ� ����������
		System.out.println("ģ���� ���� �Է��� �����մϴ�");
		
		System.out.println("�̸��� �Է��� �ּ���");
		String name=Util.sc.nextLine();
		System.out.println("������ �Է��� �ּ���");
		String birth=Util.sc.nextLine().trim();
		System.out.println("��ȭ��ȣ�� �Է��� �ּ���");
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
	
	void searchMember() { // �����˻�, �˻��ϰ����ϴ� �̸� �ް� �迭��� ������ ���� �˻� �̸� ��(�����), �ش� index ã�� �˻��� index�� �������
		
		//�ƿ� ������ ���� ���
		if(cnt==0) {
			System.out.println("������ �����ϴ�");
			return;
			}
		//�Է�
		System.out.println("���� �˻��� �����մϴ�");
		System.out.println("ã�����ϴ� �Է��� �Է��� �ּ��� : ");
		String name= sc.nextLine();
		
		int index = -1; //ã�����ϴ� �ε���
		
		//�˻�
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].name.equals(name)) {
				index=i;
				break;
			}
		}
		//���
		if(index<0) {
			System.out.println("ã���ô� �̸��� ������ �������� �ʽ��ϴ�");
		}else {
			phoneBook[index].showInfor();
		}
		
	}
	
	void deleteMember() {
		
		//�ƿ� ������ ���� ���
				if(cnt==0) {
					System.out.println("������ �����ϴ�");
					return;
					}
		System.out.println("���������� �����մϴ�");
		System.out.println("�����ϰ���� �̸��� �Է��ϼ���: ");
		
		String name= sc.nextLine();
		
		int index = -1; //ã�����ϴ� �ε���
		
		//�˻�
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].name.equals(name)) {
				index=i;
				break;
			}
		}
		//���
		if(index<0) {
			System.out.println("�����ϰ����ϴ´� �̸��� ������ �������� �ʽ��ϴ�");
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
			
		}
	} 
	
	int searchIndex(String name) {
		int index = -1; //ã�����ϴ� �ε���
		
		//�˻�
		for (int i = 0; i <cnt; i++) {
			if(phoneBook[i].name.equals(name)) {
				index=i;
				break;
			}
		}
		return index;
	}


}
