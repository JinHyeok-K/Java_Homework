package Day01;

import java.util.Scanner; // import : ��������  library ����

public class Day01_04 { //c.s
	
	public static void main(String[] args) { //m.s
		
		// ����1 : �Ѹ���  �̸�, 1����, 2���� , 3���� �⼮ ���θ� �Է� �޾� ���
			// �Է� -> ���� -> ���
		
		// 1. �Է� ��ü ����
		Scanner �Է°�ü = new Scanner(System.in);
		
		// 2. �Է� ���� ������ �ȳ�
		System.out.print(" �̸� : ");
		// 3. �Է� ���� �����͸� �������� -> �ٸ���(String:���ڿ�) �� ����
		String �̸� = �Է°�ü.next();
			 //  =  : ���� (������ ���� ���� ���� [����])
		
		//   �ȳ� ���      // �Է� �޾� �ٸ� ��ü�� ���� 
		System.out.print("1���� : ");		String ����1 = �Է°�ü.next();
		System.out.print("2���� : ");		String ����2 = �Է°�ü.next();
		System.out.print("3���� : ");		String ����3 = �Է°�ü.next();
		
		// 4-1. ��� A
		
		System.out.println("\t\t\t[[�⼮��]]");
		System.out.println("-------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����");
		System.out.println(�̸�+"\t"+����1+"\t"+����2+"\t"+����3); // ������ ����� �̸��� ���� ó�� X ;
     						//  ����[��ü]+" ���ڿ� "
		
		/*4-2. ��� B
		System.out.printf("%s\t%s\t%s\t%s\n",  �̸�, ����1, ����2, ����3,"");
		System.out.println("-------------------------------");
		*/
		
		�Է°�ü.close();
	}//m.e
	
} //c.e
