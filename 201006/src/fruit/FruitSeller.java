package fruit;

public class FruitSeller {


		// 클래스에는 변수+매서드 정의
		//성격이 비스한 변수 메서드 정의
		
		//변수: 인스턴스 변수, 멤버변수
		final int APPLE_PRICE;//사과의 가격-변경 불가한 상수로 지정
		int numOfApple;// 사과의 개수
		int myMoney; //수익금액
		
		//기능: 판매, 정산출력
		//판매 메서드: 돈받고 반환하는 사과의 개수, 수입금 증과 보유한 사과의 개수가 감소->사과의 개수 연동
		
		//생성자 추가
		FruitSeller(){
			this(0,20,1000);
		}
		FruitSeller(int money, int num, int price){
			APPLE_PRICE=price;
			numOfApple=num;
			myMoney=money;
		}
		FruitSeller(FruitSeller seller){
			//APPLE_PRICE=seller.APPLE_PRICE;
			//numOfApple=seller.numOfApple;
			//myMoney=seller.myMoney;
			this(seller.myMoney,seller.numOfApple,seller.APPLE_PRICE);
		}
		
	int saleApple(int money){
		int num=0; // 반환할 사과의 개수
		
		//반환할 사과의 개수를 구함
		myMoney+=money;
		numOfApple -=num;
		return num;
	}

	//정산출력: 보유한 사과의 개수 출력, 보유한 금액 출력
	void showSaleResult() {
		System.out.println("현재 보유한 사과의 개수: "+numOfApple);
		System.out.println("판매 수입 금액:"+ myMoney);
	}
	
}
