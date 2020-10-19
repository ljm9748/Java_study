package extend;

public class ExtendsMain {
	public static void main(String[] args) {
		//클래스 멤버도 상속의 대상이고 클래스 멤버는 ~ 참조변수도 상속의 대상
		//상속관계 성립이 될때 상속 관계로 새로운 클래스를 정의할수있다
		//IS-A관계: 전화기-휴대전화(상속관계)
		//HAS - A관계: 경찰-총(모두가 가진것도 아니고 늘 가진것도 아님): 클래스랑 인스턴스관계
		Child c1= new Child();
		Child2 c2=new Child2("King");
		GrandChild gc= new GrandChild("grandking");
		
		System.out.println(c1.getMoney());
		System.out.println(c2.getMoney()); 
		System.out.println(c2.name);
		System.out.println(gc.getMoney());
	}
 
}
