package Day09;

public class KumhoTire extends Tire{
	//        ����Ŭ����  extends ����Ŭ����
	// 1. �ʵ�
	// 2. ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// ���� Ŭ���� �� ������ [ �ڵ� ���̱� ]
		
		
	}
	// 3. �޼ҵ�
	@Override
	public boolean roll() {
		accumulatedRotation++; // ���� ȸ������ 1 ���� // Ÿ�̾� ȸ��
		if (accumulatedRotation<maxRotation) {
			// ���࿡ ���� ȸ������ �ִ� ȸ������ ������ [ ���� ����]
			System.out.println(location+"��ȣŸ�̾� ���� : "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else { // �ƴϸ� [���� ����]
			System.out.println("***"+location+" ��ȣŸ�̾� ��ũ ***");
			return false;
		}
	}
}
