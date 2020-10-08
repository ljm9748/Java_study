package fruit;
//201008에 생성자를 추가함
public class FruitBuyer {
	//클래스를 만들고 우리는 객체(상인)의 메서드와 변수를이용!
	
	int myMoney;
	int numOfApple;
	
	FruitBuyer(){
		this(1000,0);
	}
	FruitBuyer(int money, int num){
		myMoney=money;
		numOfApple=num;
	}
	
	void buyApple(FruitSeller seller, int money) {
		int num=seller.saleApple(money);
		seller.numOfApple -= num;
		numOfApple +=num;
		myMoney-=money;
	}
	
	void showBuyResult() { 
		System.out.println("현재 보유한 사과의 개수: "+numOfApple);
		System.out.println("현재 잔액:"+ myMoney);
	}

}
