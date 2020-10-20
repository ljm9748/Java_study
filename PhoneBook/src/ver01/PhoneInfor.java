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
		System.out.println("이름: " +name);
		System.out.println("전화먼호: " +phoneNumber);
		System.out.println("생일: " +birthday);
	}
}
