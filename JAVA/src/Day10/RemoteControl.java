package Day10;

public interface RemoteControl { // �������̽� ����
			// ������
	// ��� ����
		// 1. ��� �ʵ� : ������ ������
		public int MAX_VOLUME = 10;  // �������� �ִ� ����
		public int MIN_VOLUME = 0;   // �������� �ּ� ����
		// 2. **�߻� �޼ҵ�** : ���� O ����X
			// abstract : �߻� [ �������̽������� ���� ���� ]
//		public abstract void turnOn();
//		public abstract void TurnOff();
//		public abstract void setVolume();
		public void turnOn();	// {} : �߰�ȣ ���� [���� X]
		public void TurnOff(); // ���� X
		public void setVolume( int volume); // ���� X
		// 3. ����Ʈ �޼ҵ� : ���� O ����O [ java 8�̻�]
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("���� ó��");
			}else {
				System.out.println("���� ����");
			}
		}
		// 4. ���� �޼ҵ� : ����O ���� O [ ��ü���� ����;static ]
		static void changeBattery() {
			System.out.println("������ ��ü �մϴ�.");
		}
}
