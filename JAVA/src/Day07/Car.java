package Day07;

public class Car {
	// Ŭ���� ����
	
	//1. �ʵ�
	int gas; // ���� ����
	//2. ������
		// ������ ������ �⺻ ������
	//3. �޼ҵ�
		// 1. gas�� �ܺηκ��� �޾Ƽ� ������ gas �� �����ϴ� �޼ҵ� ����
	void setGas(int gas) { // �μ�O ��ȯX
//  ����X �޼ҵ��(�μ�1) { ���κ��� = �ܺκ���}
		this.gas = gas;
// ���κ����� �ܺκ����� �̸��� ������ �� �����ϴ� ���
		// this.�ʵ�� :  ����(��Ŭ��������)����
	}
	
		// 2. ���� ���� gas �� ������ Ȯ��[0=�������� =false][1�̻�=�������� =true] 
	boolean isLeftGas() { // �μ� x ��ȯ O
//  �� ��ȯ  �޼ҵ��()
		if (gas ==0) {
			System.out.println("gas �� �����ϴ�.");
			return false;
		}
		else {
			System.out.println("gas �� �ֽ��ϴ�.");
			return true;
		}
		
	}
		// 3. gas 0�� �� ���� �����ϴµ� ���� �� ������ ���� 1�� ���� �޼ҵ�
		// gas 0 �̸� �Լ� ����
	void run()	{
		
		while(true) {// ���ѷ��� [���� : 1. break 2.return 3. ����ġ����]
			if (gas>0) {
				System.out.println("�޸��ϴ�. (gas �ܷ� : "+gas+")");
				gas--; // gas ���� 1�� ����
			}
			else {
				System.out.println("����ϴ�. (gas �ܷ� : "+gas+")");
//				break; // �ݺ��� Ż�� [����]
				return; // �Լ� Ż�� [����]
			}
		}
		
	}
	
	
}
