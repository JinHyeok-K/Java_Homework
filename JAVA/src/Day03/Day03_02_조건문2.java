package Day03;

import java.util.Scanner;

public class Day03_02_���ǹ�2 { // c s 
	
	public static void main(String[] args) { //m s
		
		// �Է� ��ü = {  } �� 1�� ���� 
		Scanner scanner = new Scanner(System.in);
		// : ���� main {} ������ 1�� ���� ��
		
		// ���� 1 : 2���� ������ �Է� �޾Ƽ� �� ū ���
		System.out.println(" ����1 �Է� : ");
		int ����1 = scanner.nextInt();
				// int �� ���� ����(����1)�ϰ� �Է� ���� ��(������)�� ������ �����ͼ� ����
		System.out.println(" ����2 �Է� : ");
		int ����2 = scanner.nextInt();
				// int �� ���� ����(����1)�ϰ� �Է� ���� ��(������)�� ������ �����ͼ� ����
		  	// ����
		if ( ����1 > ����2 )	System.out.println("�� ū�� : " + ����1);
				// ���࿡ �Է� ���� ����1 ������ ����2 �������� �� ũ�� ���� �ƴϸ� ���� ����
		else if (����1<����2)	System.out.println("�� ū�� : " + ����2);
				// [���� ���� ]���࿡ �Է� ���� ����1 ������ ����2 �������� �� ������ ���� �ƴϸ� �׿�
		else 				System.out.println(" ���� ");
				// ������[�׿�] ����
		
		// ���� 2 : 3���� ������ �Է� �޾Ƽ� ���� ū �� ���
			
		System.out.println(" ����2) ����21 �Է� : "); 	int ����21 = scanner.nextInt(); // ������ �ߺ� X
		System.out.println(" ����2) ����22 �Է� : "); 	int ����22 = scanner.nextInt();
		System.out.println(" ����2) ����23 �Է� : ");	int ����23 = scanner.nextInt();
		
		  // Swap
		int max = ����21; // ���� ū ���� �����ϴ� �ӽ� ����
			// max�� ù��° �� �־�α�
		if ( max < ����22) {
			// ���࿡ max ���� ����22�� �� ũ�� ��ü
//			int temp = ����22; // �ӽ� ���� [���ҿ�]
//			����22 = max;
//			max = temp;
			max = ����22;}
		if ( max < ����23) { max = ����23;}
		System.out.println(" ���� ū �� : "+ max);
		
		// ���� 3 : 4���� ������ �Է� �޾Ƽ� ���� ū �� ���
		
		System.out.println(" ����3) ����31 �Է� : "); 	int ����31 = scanner.nextInt();
		System.out.println(" ����3) ����32 �Է� : ");	int ����32 = scanner.nextInt();
		System.out.println(" ����3) ����33 �Է� : ");	int ����33 = scanner.nextInt();
		System.out.println(" ����3) ����34 �Է� : ");	int ����34 = scanner.nextInt();
		
		int max2 = ����31; 
		if ( max2 < ����32) { max2 = ����32;}
		if ( max2 < ����33) { max2 = ����33;}
		if ( max2 < ����34) { max2 = ����34;}
		System.out.println(" ���� ū �� : "+ max2);
	
		// ���� 4 : 3���� ������ �Է� �޾Ƽ� ���� ū �� ���  : ���� ����
		
		System.out.println(" ����4) ����41 �Է� : "); 	int ����41 = scanner.nextInt();
		System.out.println(" ����4) ����42 �Է� : ");	int ����42 = scanner.nextInt();
		System.out.println(" ����4) ����43 �Է� : ");	int ����43 = scanner.nextInt();
		
		if (����41> ����42)	{	//    > : ���� ����  < : ���� ����
			// ��ü [ ���� = �� �� ������ ������ ��ȯ ��� ]
			int temp = ����41;	// �ӽ� ���� = ����1 ;
			����41=����42;			// ���� 1 = ����2 ;
			����42=temp;			//	����2 = �ӽ� ����2;
		}
		
		if (����41>����43)		{ int temp = ����41; ����41=����43; ����43 =temp;}
		if (����42>����43)		{ int temp = ����41; ����41=����43; ����43 =temp;}
		System.out.printf(" �Է��� �� ���� ���� : %d %d %d\n" , ����41,����42,����43);
		System.out.println("�Է��� �� ���� ���� : "+����41+" "+����42+" "+����43);
			
		// ���� 5 : 4���� ������ �Է� �޾Ƽ� ���� ū �� ���  : ���� ����


		System.out.println(" ����5) ����51 �Է� : "); 	int ����51 = scanner.nextInt();
		System.out.println(" ����5) ����52 �Է� : ");	int ����52 = scanner.nextInt();
		System.out.println(" ����5) ����53 �Է� : ");	int ����53 = scanner.nextInt();
		System.out.println(" ����5) ����54 �Է� : ");	int ����54 = scanner.nextInt();
		
		/* me
		 * if (����51> ����52) { int temp = ����51; ����51=����52; ����52=����53; ����54=temp;} if
		 * (����51> ����53) { int temp = ����51; ����51=����52; ����52=����53; ����54=temp;} if (����51>
		 * ����54) { int temp = ����51; ����51=����53; ����52=����53; ����54=temp;}
		 */	
		
		// ù��° �� �������� ��
		if (����51> ����52)	{ int temp = ����51;	����51=����52;	����52=temp;}
		if (����51> ����53)	{ int temp = ����51;	����51=����53;	����53=temp;}
		if (����51> ����54)	{ int temp = ����51;	����51=����54;	����54=temp;}
		
		// �ι�° �� �������� ��
		if (����52> ����53)	{ int temp = ����52;	����52=����53;	����53=temp;}
		if (����52> ����54)	{ int temp = ����52;	����52=����54;	����54=temp;}
		
		if (����53> ����54)	{ int temp = ����53;	����53=����54;	����54=temp;}

		System.out.printf(" �Է��� �� ���� ���� : %d %d %d %d\n" , ����51,����52,����53,����54);
		System.out.println("�Է��� �� ���� ���� : "+����51+" "+����52+" "+����53+" "+����54);
	
		
		
		
		
		
	} // m e

} // c e
