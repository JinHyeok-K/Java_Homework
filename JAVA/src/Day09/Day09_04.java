package Day09;

public class Day09_04 {
	public static void main(String[] args) {
		// p.296~297
			// @override : �� ����
			// ������ �μ��� �޼ҵ�� �Ұ��� 
			// ���� : ������ �޼ҵ带 �� ����[����]
		int r = 10;
		// 1. super class �� ��ü ����
		Calculator  calculator = new Calculator();
		// 2. super class �� ���� ��ü�� �޼ҵ� ȣ��
		System.out.println("�� ���� : "+calculator.areaCircle(r));
		System.out.println();
		
		//1. sub class �� ��ü ����
		Computer computer = new Computer();
		// 2. sub class �� ���� ��ü�� �޼ҵ� ȣ��
		System.out.println("�� ����: "+computer.areaCircle(r));
		// * super class ��  sub class �� �޼ҵ�� �ٸ���.
		
	}
}
