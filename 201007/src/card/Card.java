package card;

public class Card {
	String kind; // ī������
	int number;
	
	Card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	Card(){
		this("spade",1);//�ٸ� ������ ȣ��
	}
	
	static int width=100;
	static int height=250;
	
	static void play() {
		System.out.println("ī����̸� �մϴ�");
	}
}
