package thread;

public class Sum {
	
	int num;
	Sum(){
		num=0;
	}

	//synchronized: 동시접근 막는거 그 안에 넣어 블럭을 이용한 세밀한 처리도 가능하다 synchronized(this)에서 this는 동기화의
	//대상을 알리는 용도
	synchronized void addNum(int n) {
		num += n;
	}
	
	int getNum() {
		return num;
	}
}
