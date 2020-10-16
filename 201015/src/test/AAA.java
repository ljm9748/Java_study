package test;

public class AAA {
	
	//public(이외 영역)>protected(상송받은 클래스)>default(동일 패키지)>private(클래스 내부)
	
	//public AAA(){}가 자동으로 생성자로 들어감

	//private int num;
	int num;
	
	//setter
	public void setNum(int num) {
		this.num=num;
	}
	
	//getter
	public int getNum() {
		return num;
	}
	
}
