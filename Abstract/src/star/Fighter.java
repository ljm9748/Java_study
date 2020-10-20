package star;

public class Fighter extends Unit implements Fightable{

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("이동합니다.");
		x+=NUM;
		y+=NUM;

	}

	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("공격합니다.");
		hp -= NUM;
	}
	
}
