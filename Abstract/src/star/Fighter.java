package star;

public class Fighter extends Unit implements Fightable{

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("�̵��մϴ�.");
		x+=NUM;
		y+=NUM;

	}

	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�.");
		hp -= NUM;
	}
	
}
