package Day08;

public class Day08_01 { // class start
	
	public static void main(String[] args) { // main start
		
		//p. 238 : static 
			// ��������
			// �������� 
		
		// * Ŭ���� �� �ʵ�, �޼ҵ�(���) ���� ���
			// (static ����� �ƴ� ��) 1. ��ü ���� -> ��ü.���
				// ��ü�� ������ �� new �����ڷ� ��ü(�� ��� ����) �޸� �Ҵ�
//		Calculator calculator = new Calculator();
//		System.out.println("��ü�� �̿��� ��� ���� : "+calculator.pi);
			// (static ��� �� ��) 1. Ŭ���� ��.���
				// Ŭ������ �ε� �ǰ� �޼ҵ念���� static ������ �ٷ� ����
		System.out.println("��ü ���� ��� ���� : " + Calculator.pi);
		
		double result = 10 * 10 * Calculator.pi;
								// Ŭ������.����������
		int result2 = Calculator.plus(10, 5);
//		Calculator calculator = new Calculator();
		int reuslt3 = Calculator.minus(10, 5);
		int result4 = Calculator.plus(1, 1);
		int reuslt5 = Calculator.minus(5, 2);
		
		
		System.out.println("result1 : "+result);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+reuslt3);
		
		
		
	}// main end
}// class  end
