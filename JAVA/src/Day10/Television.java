package Day10;

public class Television implements RemoteControl, Searchable{ //class �� ���� (�������̽��� ���� X)
				// Ŭ������  implements �������̽���
						// �����ϴ� => Ŭ������ �������̽��� ������
							// �������̽��� ���������ؼ�
		// ctrl+�����̽���
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV �� �մϴ�");

		
	}
	@Override
	public void TurnOff() {
		System.out.println("TV�� ���ϴ�.");

			
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			//�������� �ִ�������� ũ�� ������ 10���� ����[����]
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			// �������� �ּҼ������� ������ ������ 0���δ���[����]
			this.volume=RemoteControl.MIN_VOLUME;			
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ���� :"+this.volume);
	}
	@Override
		public void serach(String url) {
			// TODO Auto-generated method stub
		System.out.println(url+" �� �˻��մϴ�.");	
		}
	
	@Override // ����Ʈ �޼ҵ嵵 �� ���� ����
		public void setMute(boolean mute) {
			RemoteControl.super.setMute(mute);
		}

	

}
