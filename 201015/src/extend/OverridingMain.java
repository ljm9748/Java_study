package extend;

public class OverridingMain {
	public static void main(String[] args) {
		//BaseEnSpeaker bs = new BaseEnSpeaker();
		//bs.showCurrentState();
		
		
		//다형성
		//조상 클래스 타입의 참조변수에 자손 클래스 타입의 인스턴스를 참조할 수 있은것
		//찬조변수는 해당 타입 멤버만 사용하겠다라고 선언
		
		Speaker s = new BaseEnSpeaker();
		//참조변수 s는 volumeRate 변수와 showCurrentState(), setVolume()
		
		//Speaker 클래스ㅏㄱ 가지는 멤버
		s.setVolume(10);
		
		//baseEnSpeaker 가 가지는 멤버
		//s.setBaseRate(20);
		
		//baseEnSpeaker 오버라이딩한 메서드가 호출된다
		s.showCurrentState();
	}

}
