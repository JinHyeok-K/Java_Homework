package Day10;

public class Day10_02 {
	
	public static void main(String[] args) {
		
		// �������̽� [ �߻� �޼ҵ� ]
			// ���� : ������ �����Ͽ� ������ ����� ����
				// ���� �ٸ� Ŭ�������� ��ü���� ������ �������� ����
			// �߻� : ����[O] ����[X]->���� X
				// �������̽����� �����ϰ� �� Ŭ�������� �����Ѵ� . [ ������ ]
			// ��) �������̽� : ����Ű , A��ư, B��ư
			// 		ö�ǰ��� Ŭ����
					// A��ư : ����
					// B��ư : ���
			//		�౸���� Ŭ����
					// A��ư : ��
					// B��ư : ���
		
		// 1. �������̽� ��ü ����
		RemoteControl rc;
		// �������̽���  ��ü��
		
		// 2. �������̽��� �ڷ�����Ŭ���� �޸� �Ҵ� (implements �Ѱ͵鸸 ����)
		rc = new Television();
		
		// 3. �������̽� ����
		rc.turnOn(); // tv ���� �޼ҵ�
		rc.TurnOff(); // tv ���� �޼ҵ�
		rc.setVolume(-1);
		
		System.out.println("������ ���� : TV -> Audio ��ü");
		
		//4. �������̽� �� �����Ŭ���� �޸� �Ҵ�[��ü]
		rc = new Audio();
		// 5. �������̽� ����
		rc.turnOn();
		rc.TurnOff();
		rc.setVolume(5);
		
		// ** �͸�����ü : Ŭ���� ���� �߻�޼ҵ� ���� ****
		// ������ Ŭ���� 'impelents' �������̽� �������� ����
		//
		RemoteControl rc2 = new RemoteControl() {
		// �������̸�   ��ü��  = new  �������̽�
			
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("���� ���� : 	"+volume);
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void TurnOff() {
				System.out.println("������ �մϴ�");
				// TODO Auto-generated method stub
				
			}
		};
		rc2.turnOn();
		rc2.TurnOff();
		rc2.setVolume(0);
		
		// ����Ʈ �޼ҵ� ȣ��
		rc2.setMute(true);
		
		// �����޼ҵ� ȣ��
		RemoteControl.changeBattery();

		// �޸� �Ҵ� �޴� ���
			//�޸� �Ҵ� �ؾߵǴ� ����
				//�ܺ� Ŭ���� / �������̽��� �ʵ�)(������),�޼ҵ�(������),����
			// 1. new ������
			// 2. static ������
		
		
	}
}
