package Day09;

public class Day09_02 {

		public static void main(String[] args) {
			
			/* ���
			 * 
			 * 	// �θ𿡰� ���� �޴°�
			 * 	// ���� : �θ� --> �ڽ�  | ���α׷��� : �ڽ� --> �θ� ����
			 *  extends : �����ϴ� [ ����ϴ� ]
			 *  ���� : ���� ���� [ ������ �ִ� Ŭ����(standard��)�� �����ؼ� ���ο� Ŭ���� ���� ]
			 *  Super class��(�θ�Ŭ����) 1���� ����(extends�� �ϳ��� ����)
			 *  
			 */
			
			// p.290~292 ����
			// 1. ���� Ŭ������ ��ü ����
			DMBCellPhone dmbCellPhone = new DMBCellPhone("�ڹ���","����",10);
			
			// 2. ���� Ŭ������ ������� ��ü�� ����Ŭ���� �� ��� ����
			System.out.println("��: "+dmbCellPhone.model);
			System.out.println("����: "+dmbCellPhone.color);
			
			// 3. ����Ŭ������ ������� ��ü�� ���� �������
			System.out.println("ä�� : "+dmbCellPhone.channel);
			
			// 4. ���� Ŭ������ ������� ��ü�� ���� Ŭ���� �� ���[�޼ҵ�]����
			dmbCellPhone.powerOn();
			dmbCellPhone.bell();
			dmbCellPhone.sendVoice("��������");
			dmbCellPhone.receiveVoice("�ȳ��ϼ��� ������");
			dmbCellPhone.sendVoice("�ƿ��ƿ�");
			dmbCellPhone.hangUp();
			// 5. ����Ŭ�����θ������ ��ü�� ���� �������
			dmbCellPhone.turnOnDmb();
			dmbCellPhone.changeChannelDmb(12);
			dmbCellPhone.turnOffDmb();
			
		}
}
