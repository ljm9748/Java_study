package ver05;

public abstract class PhoneInfor implements Infor { //extends object
	//ĸ��ȭ: ��������(���� �������� ����-������ȣ)
	private String name;		//ģ���� �̸�
	private String phoneNumber; //ģ���� ��ȭ��ȣ
	private String address;		//ģ���� �ּ�
	private String email;		//ģ���� �̸���
	
	
	public abstract void showBasicInfor();

	
	public PhoneInfor(String name, String phoneNumber, String address, String email) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.email= email;
	}
	


	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}



	public void showInfor() {
		System.out.println("�̸�: " +name);
		System.out.println("��ȭ��ȣ: " +phoneNumber);
		System.out.println("�ּ�: " +address);
		System.out.println("�̸���: "+ email);
	}



	
}
