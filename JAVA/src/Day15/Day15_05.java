package Day15;

public class Day15_05 {
	// p.591 ����ȭ
				// ��Ƽ������ ��� �� ����ȭ ����[ ���� ������ ���� �ʿ�x ]
				// *�������� �����尡 ������ �޼ҵ� ȣ��
				// ���ôٹ������� �ϳ��� �޼ҵ� ȣ��
			// ��1) ����ȭ ���� �޼ҵ� ��� ��
				// 2���� �����尡 ������ �޼ҵ� ȣ��
		public static void main(String[] args) {
			// 1.   ���� ��ü ����
			Calculator ���� = new Calculator();
			
			//2. User 1  ��ü ����
			User1 user1 = new User1();
			// * ���� ��ü��    user1 ����[����]
			user1.setCalculator( ���� );
			user1.start();
			//3.User 2  ��ü ����
			User2 user2 = new User2();
			// * ���� ��ü��    user2 ����[����]
			user2.setCalculator( ���� );
			user2.start();
			
		}
}
