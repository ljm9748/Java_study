package extend;

public class Speaker {
	
	private int volumeRate; //����ũ��
	
	//���� ����ũ�� ���
	void showCurrentState() {
		System.out.println("������ ũ��: "+ volumeRate);
		
	}
	
	public void setVolume(int vol) {
		volumeRate=vol;
	}

}
