package extend;

public class OverridingMain {
	public static void main(String[] args) {
		//BaseEnSpeaker bs = new BaseEnSpeaker();
		//bs.showCurrentState();
		
		
		//������
		//���� Ŭ���� Ÿ���� ���������� �ڼ� Ŭ���� Ÿ���� �ν��Ͻ��� ������ �� ������
		//���������� �ش� Ÿ�� ����� ����ϰڴٶ�� ����
		
		Speaker s = new BaseEnSpeaker();
		//�������� s�� volumeRate ������ showCurrentState(), setVolume()
		
		//Speaker Ŭ�������� ������ ���
		s.setVolume(10);
		
		//baseEnSpeaker �� ������ ���
		//s.setBaseRate(20);
		
		//baseEnSpeaker �������̵��� �޼��尡 ȣ��ȴ�
		s.showCurrentState();
	}

}
