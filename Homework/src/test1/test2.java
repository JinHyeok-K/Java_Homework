package test1;

import java.util.Scanner;

public class test2 {
	
//		1. ����ǥ�� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//		2. �޴����� 1�� ���ý� �л������� �߰� �մϴ�. [ 5�� ]
//		3. �޴����� 2�� ���ý� �л������� ���� �մϴ�. [ 5�� ]
//		4. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ�. [ 5�� ]
//		5. ���� �Է��� 5������ �ϵ�, �ִ� 100�� �� �����ϵ��� �ۼ��մϴ�. [ 5�� ]
//		6. ��ȣ �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�. [ 5�� ]
//		7. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�. [ 5�� ]
//		8. ������ �̿��Ͽ� ������ ���մϴ�. [ 5�� ]
//		9. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]

	public static void main(String[] args)	{
		
	
		Scanner scanner =new Scanner(System.in);
		//�⺻ ���
		System.out.println("-------------------------------------");
		System.out.println("\t��\t��\tǥ\t");
		System.out.println("-------------------------------------");
		System.out.println("��ȣ  �̸�  ����  ����  ����  ����  ���  ����");
		System.out.println("-------------------------------------");
//		System.out.println("-------------------------------------");
//		System.out.println(" ��� �޴�");
//		System.out.println("1.�л����� ��� 2. �л����� ����"); 
		int ch = scanner.nextInt();
//		int ���� = scanner.nextInt();
			
//			int ch = scanner.nextInt();
			if(ch == 1) { // if 1 s
				System.out.println("�л� �̸��� �Է��ϼ���"); String name = scanner.next();
				System.out.println("���� ������ �Է��ϼ���"); int kor = scanner.nextInt();
				System.out.println("���� ������ �Է��ϼ���"); int math = scanner.nextInt();
				System.out.println("���� ������ �Է��ϼ���"); int eng = scanner.nextInt();
			}
			if(ch == 2) { // if 1 s
				System.out.println("�л� �̸��� �Է��ϼ���"); String name = scanner.next();
				System.out.println("���� ������ �Է��ϼ���"); int kor = scanner.nextInt();
				System.out.println("���� ������ �Է��ϼ���"); int math = scanner.nextInt();
				System.out.println("���� ������ �Է��ϼ���"); int eng = scanner.nextInt();
			}	
				
	} // me
} // ce