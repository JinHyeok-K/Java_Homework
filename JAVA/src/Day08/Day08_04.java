package Day08;

public class Day08_04 {
	// p.267~268 : Setter , Getter �޼ҵ�
		// �ʵ���� private ���Ǵ� ��찡 ����.��
		// �ܺο��� �ʵ忡 ������ �� ����.
		// ���� : �ܺο��� �ʵ忡 ���� ���� �����ϰ� �޼ҵ带 ���� �ʵ� ����
		// Setter �޼ҵ� : �ʵ� ������ ����
		// Getter �޼ҵ� : �ʵ� ������ ȣ��
	
	public static void main(String[] args) {
		// 1.��ü ����
		Car myCar = new Car();
		// 2. ��ü �� �޼ҵ� ȣ�� [setter �޼ҵ�]
		myCar.setspeed(-50);
		// 3. ��ü �� �޼ҵ� ȣ�� [getter �޼ҵ�]
		System.out.println(" ���� �ӵ�:"+ myCar.getSpeed());
		//4
		myCar.setspeed(60);
		System.out.println("���� �ӵ�: " +myCar.getSpeed());
		//5
		if(!myCar.isStop()) { // ���� ���°� �ƴϸ�
			// ! : ���� ������ [ true -> false / false => true]
			myCar.setStop(true); // ������ ����
		}
		System.out.println("���� �ӵ�: " +myCar.getSpeed());
	}
	
	
}
