package Day10;

public class Audio implements RemoteControl{
	//�ʵ�
	private int volume;
	
	
	
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void TurnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	//turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}
	//
	
	//SetVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume= RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� Audio ����: "+this.volume);
	}
}
