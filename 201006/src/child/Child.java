package child;

public class Child {
	int marble; //�����ϰ� �ִ� ������ ���� ����
	
	//���� �ְ���� ǥ���ϴ� �޼���
	void winnerTake(Child withWho, int getMarble) {//������ ������ �ߴ°�, ��� ����°�
		withWho.marble -= getMarble;
		marble += getMarble;
		
	}
	
	

}
