package thread;

public class Calculator {
	int opCnt=0;
	public int add(int n1, int n2) {
		synchronized (obj) {
			opCnt++;
		}
		
		return n1+n2;
	}

	public int minus(int n1, int n2) {
		synchronized (obj) {
			opCnt++;
		}
		return n1-n2;
	}
	
	//�طο� ����ȭ Ű
	Object obj = new Object();
}
