package Day13;

import java.util.Random;

public class Day13_01 {

	public static void main(String[] args) {
		
		//p.534 : Math Ŭ����(java.lang ��Ű��) import �� �ʿ� ���� [���� ���� �޼ҵ� ���� ] ��ü ���� ��� ����
		// -> Static ���� �Ǿ�����
			// 1. Math.abs(��) : �ش� ���� ���밪
		System.out.println(" ���밪 : "+ Math.abs(-5));
		System.out.println(" ���밪 : "+ Math.abs(-3.14));
			// 2. Math.ceil(��) : ����� ������ �ø�
		System.out.println(" �ø��� : "+ Math.ceil(5.3)); // �Ҽ��� ù°�ڸ����� �ø�
		System.out.println(" �ø��� : "+ Math.ceil(-5.3)); //  ����������� �ø� -6�̾ƴ� -5 ���
			// 3. Math.floor(��) : ����� ������ ����
		System.out.println(" ������ : "+ Math.floor(5.3)); // �Ҽ��� ù°�ڸ����� ����
		System.out.println(" ������ : "+ Math.floor(-5.3)); // ����� ������ ���� -5�� �ƴ� -6���
			// 4. Math.max(��1,��2) : �� �� �߿��� ū�� ���
		System.out.println(" �ִ밪 : "+ Math.max(5, 9));
		System.out.println(" �ִ밪 : "+ Math.max(5.3, 2.5));
			// 5. Math.min(��1,��2) : �� �� �߿��� ������ ���
		System.out.println(" �ּҰ� : "+ Math.min(5, 9));
		System.out.println(" �ּҰ� : "+ Math.min(5.3, 2.5));
			// 6. Math.random() : 0~1 ������ (double)�� ���� �߻�
		System.out.println(" ���� : "+ Math.random()); // 0~1 ������ ���� �߻�
		// vs
//		Random random = new Random();
		
			// 7. Math.rint(��) : ����� ������ �Ǽ������� �ݿø�
		System.out.println(" ����� ������ �Ǽ��� : "+Math.rint(5.3));// 5  �ݿø�
		System.out.println(" ����� ������ �Ǽ��� : "+Math.rint(5.4));// 5  �ݿø�
		System.out.println(" ����� ������ �Ǽ��� : "+Math.rint(5.5));// 6  �ݿø�
		System.out.println(" ����� ������ �Ǽ��� : "+Math.rint(5.7));// 6  �ݿø� - �Ǽ� Ÿ��
			// 8. Math.round(��) : ����� ������ ���������� �ݿø�		
		System.out.println(" ����� ������ ������ : "+Math.round(5.3));  // �ݿø� - ���� Ÿ��
		
		// p.536
		// �ֻ��� [1~6]
//		
		System.out.println(Math.random()*6); // 0~1(0.99999999) *6 => 0~6 ���
		System.out.println(Math.random()*6 +1); // 0~6 +1 => 1~7
		int num=(int)(Math.random()*6)+1;
			// (�⺻�ڷ���) ��/���� = ���� ����ȯ (�����ͼս�)
			// double => int ���� �� ��ȯ�� => �Ҽ��� �߸�
		System.out.println("1���� 6������ ���� : "+num);
		///////////////////////////////////////////////////////////////////
		Random random = new Random();
		System.out.println("1~6�����ǳ���(random class) :"+(random.nextInt(6)+1)); // 0~5 +1 => 1~6
		 // �� ��ȯ ��
	}
}
