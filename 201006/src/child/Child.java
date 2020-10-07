package child;

public class Child {
	int marble; //소유하고 있는 구슬의 개수 정보
	
	//구슬 주고받음 표현하는 메서드
	void winnerTake(Child withWho, int getMarble) {//누구랑 게임을 했는가, 몇개를 얻었는가
		withWho.marble -= getMarble;
		marble += getMarble;
		
	}
	
	

}
