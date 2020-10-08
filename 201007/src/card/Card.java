package card;

public class Card {
	String kind; // 카드종류
	int number;
	
	Card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	Card(){
		this("spade",1);//다른 생성자 호출
	}
	
	static int width=100;
	static int height=250;
	
	static void play() {
		System.out.println("카드놀이를 합니다");
	}
}
