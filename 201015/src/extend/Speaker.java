package extend;

public class Speaker {
	
	private int volumeRate; //볼륨크기
	
	//현재 볼륨크기 출력
	void showCurrentState() {
		System.out.println("볼륨의 크기: "+ volumeRate);
		
	}
	
	public void setVolume(int vol) {
		volumeRate=vol;
	}

}
