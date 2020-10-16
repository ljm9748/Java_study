package singleton;
//싱글톤은 private로 놓고 static선언해서 하나만 쓸수있게 하기
public class Singleton {
	//외부 인스턴스에서 인스턴스를 생성하지 못하도록 제어
	private Singleton() {}
	//사용할 인스턴스르 ㄹ클래스 내부에서 생성
	private static Singleton s= new Singleton();
	//외부에서 만들어진 참조값을 사용할 수 있도록 참조값 설정
	public static Singleton getInstance() {
		if (s==null) {
			s= new Singleton();
		}
		return s;
	}

}
