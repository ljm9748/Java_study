package ver05;

public abstract class PhoneInfor implements Infor { //extends object
	//캡슐화: 정보은닉(변수 직접접근 제한-변수보호)
	private String name;		//친구의 이름
	private String phoneNumber; //친구의 전화번호
	private String address;		//친구의 주소
	private String email;		//친구의 이메일
	
	
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
		System.out.println("이름: " +name);
		System.out.println("전화먼호: " +phoneNumber);
		System.out.println("주소: " +address);
		System.out.println("이메일: "+ email);
	}



	
}
