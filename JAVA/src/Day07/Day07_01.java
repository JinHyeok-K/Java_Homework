package Day07;

public class Day07_01 {  //cs

	public static void main(String[] args) {
		
		//�޼ҵ� ȣ��(�ҷ�����) ���
			//1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			//2. ��ü��.�޼ҵ��()
				// . : ���ٿ����� ( �ʵ峪 �޼ҵ� ȣ�� ��)
				// scnanner.nextInt();
		// 1. ��ü ����
		Calculator myCalc     = new Calculator() ; 
		//Ŭ������    ��ü��[�̸�]  = �޸��Ҵ� ������()

		// 2. �޼ҵ� ȣ�� [�μ��� ����]
		myCalc.powerOn();		
		
		// 3. �޼ҵ� ȣ�� [ �μ� 2��]
		int result1 = myCalc.plus(5, 6);
			// * �޼ҵ忡 5�� 6 �����Ŀ�
			// * 11 �̶�� ����� �޾Ƽ� ������ ����
		System.out.println(" reult1 : "+ result1);
		
		// 4. �޼ҵ� ȣ�� [ �μ� 2��]
		byte x = 10;
		byte y =4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		// 5. �޼ҵ� ȣ�� [�μ�X]
		myCalc.powerOff();
				
	}
	
} //ce
