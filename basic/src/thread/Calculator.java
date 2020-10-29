package thread;

public class Calculator {
	int opCnt=0;
	public int add(int n1, int n2) {
		synchronized (this) {
			opCnt++;
		}
		
		return n1+n2;
	}

	public int minus(int n1, int n2) {
		synchronized (this) {
			opCnt++;
		}
		return n1-n2;
	}
}
