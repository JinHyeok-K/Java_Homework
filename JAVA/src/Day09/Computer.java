package Day09;

public class Computer extends Calculator{
			// sub class extends super class
	//1.�ʵ�
	//2.������
	//3.�޼ҵ�
		// * �������̵�[super class �� �޼ҵ� ������(����)
		// ctrl_1
	 // ��� ���� super class�� ������ �ִ� �޼ҵ� ȣ��
	@Override
	double areaCircle(double r) {
		 System.out.println("Computer ��ü�� areaCircle() ����");
		 return Math.PI * r * r;
	 }
}
