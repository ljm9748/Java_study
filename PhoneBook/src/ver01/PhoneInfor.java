package ver01;

public class PhoneInfor {
	
	String name;
	String phoneNumber;
	String birthday;
	

	PhoneInfor(String name,  String birthday) {
		this(name, "", birthday);
	}
	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthday=birthday;
	}
	
	void showInfor() {
		System.out.println("�̸�: " +name);
		System.out.println("��ȭ��ȣ: " +phoneNumber);
		System.out.println("����: " +birthday);
	}
}
