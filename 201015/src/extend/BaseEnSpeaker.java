package extend;

public class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void setBaseRate(int base) {
		baseRate= base;
	}
	//오버라이딩: 상속관계에서 상속받은 메서들을 선언부는 동일하게 하고 처리부를 재 구성 하는것
	//오버로딩: 기존에 없는 새로운 메서드 정의하는 것, 이름은 같은데 매개변수의 개수나 타입이 다른 메서드 
	//상위클래스의 참조 변수로 하위 클래스의 인스턴스 참조 가능 (상위가 123있고 하위가 123456있으면 하위의 123만 이용하는것. )
	@Override
	void showCurrentState() {
		System.out.println("메서드 처리부분을 변경하였습니다");
		super.showCurrentState();
		System.out.println("베이스크기: "+ baseRate);
	}
}
