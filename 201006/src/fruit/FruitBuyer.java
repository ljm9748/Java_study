package fruit;
//201008�� �����ڸ� �߰���
public class FruitBuyer {
	//Ŭ������ ����� �츮�� ��ü(����)�� �޼���� �������̿�!
	
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
		System.out.println("���� ������ ����� ����: "+numOfApple);
		System.out.println("���� �ܾ�:"+ myMoney);
	}

}
