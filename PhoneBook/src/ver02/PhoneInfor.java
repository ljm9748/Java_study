package ver02;

public class PhoneInfor {
	String data[]=new String[3];
	
	String name;
	String phoneNumber;
	String birthday;
	

	PhoneInfor(String name,  String birthday) {
		this(name, "", birthday);
	}
	PhoneInfor(String name, String phoneNumber, String birthday) {
		data[0]=name;
		data[1]=phoneNumber;
		data[2]=birthday;
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
