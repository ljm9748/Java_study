package fruit;

public class FruitBuyer {
	//Ŭ������ ����� �츮�� ��ü(����)�� �޼���� �������̿�!
	
	int myMoney=5000;
	int numOfApple=0;
	
	void buyApple(FruitSeller seller, int money) {
		int num=seller.saleApple(money);
		numOfApple +=num;
		myMoney-=money;
	}
	
	void showBuyResult() { 
		System.out.println("���� ������ ����� ����: "+numOfApple);
		System.out.println("���� �ܾ�:"+ myMoney);
	}

}
