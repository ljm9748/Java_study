package extend;

public class GrandChild extends Child2 {

	GrandChild(String name) {
		//상위클래스에 생성자가 있다면 조상클래스이 생성자를 호출해 주어야함
		super(name);
	}

}
