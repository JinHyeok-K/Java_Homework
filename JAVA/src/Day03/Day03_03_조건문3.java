package Day03;

import java.util.Scanner;

public class Day03_03_���ǹ�3 { // cs
	
	public static void main(String[] args) { // ms
		
		Scanner scanner = new Scanner(System.in);
		//����6
		// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ��� 
//		
//			// ���� �Է�
//		System.out.println("����6) ���� �Է� : "); int ����6 = scanner.nextInt();
//		
//			// ���� 90 ��
//		if (����6>=90) { System.out.println("�հ�");}
//		else {System.out.println("���հ�");}
//		
//		
//		
//		
//		//����7
//		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
//		//				������ 80�� �̻��̸� B���
//		//				������ 70�� �̻��̸� C���
//		//				�׿� �����
//			// ���� �Է�
//		System.out.println("����7) ���� �Է� : "); int ����7 = scanner.nextInt();
//			// ���� ��
//		if (����7 >= 90) {System.out.println(" A ���");}
//		else if (����7>=80) {System.out.println(" B ���");}
//		else if (����7>=70) {System.out.println(" C ���");}
//		else System.out.println("�� ����");
//		
//		
//		//����8 �α���������
//		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
//		// [ ���� ] : ȸ�����̵� admin �̰� 
//		//           ��й�ȣ�� 1234 �� ��쿡�� 
//		//          �α��� ���� �ƴϸ� �α��� ���� ���
//		/*
//		 * System.out.println("����8) ID : "); String id = scanner.next();
//		 * System.out.println("id:"+id); System.out.println("����8) pw : "); int pw =
//		 * scanner.nextInt(); System.out.println("pw:"+pw);
//		 * 
//		 * int basepw=1234; if ( id=="admin"&&pw==basepw)
//		 * {System.out.println("�α��� ����");} else System.out.println("�α��� ����");
//		 * 
//		 */
//		System.out.println("====== �α��� ������ ======");
//		System.out.println("����8) ID : "); String id = scanner.next();
//			// char �ڷ��� [ ���� 1�� ����]
//			// �ڷ������� ���ڿ��� ������ �� ����.
//				// 1. String class ����ϸ� ���ڿ� ���� ����
//				// 2. char �迭/����Ʈ ����ϸ� ����
//		System.out.println("����8) pw : "); int pw = scanner.nextInt(); 
//			// ��ü�� ���� �Ұ�
//				// '�ڹ� '  >=  >=   ==    >   <  !  [�Ұ���]
//				// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
//					// ���ڿ� �񱳽�  .equals
//					// ���ڿ�1.equals(���ڿ�2)
//		boolean �α��μ��� = false;
//			// boolean : 1��Ʈ true Ȥ�� false ����
//		if (id.equals("admin") ) { // id�� Ŭ���� ��ü�̱� ������ ==�Ұ��� // ��ü �񱳽ÿ��� .equals()
//			// �Է��� id �� admin �̸�
//			if (pw==1234) { // pw �� �ڷ��� �����̱� ������ == ����
//				System.out.println(" �˸�) �α��� ���� ");
//				�α��μ��� = true; // id, pw �� ��� �����ϸ� ������ ����
//			}
//			else { // �Է��� pw 1234�� �ƴϸ�
//				System.out.println(" �˸�)��й�ȣ Ʋ�Ƚ��ϴ�.");
//			}
//		}else { // �Է��� id �� admin �� �ƴϸ�
//			System.out.println(" �˸�) ���̵� Ʋ�Ƚ��ϴ�.");
//		}
//		if(�α��μ��� == false) System.out.println(" �˸�) �α��� ����");
//			// �α��� ���� ������ false �̸� ���
//		
		/* ����9
		[ �Է� ] : ����,����,���� �Է¹ޱ�
		[ ���� ]
			����� 90�� �̻��̸鼭 
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '������' ���
				�������� 100�� �̸� '���п��' ���
			����� 80�� �̻��̸鼭 
				�������� 90���̻� �̸� '�������' ���
				�������� 90���̻� �̸� '��������' ���
				�������� 90���̻� �̸� '�������' ���
			�׿� ����� 
	 */
		
		System.out.println("�������� : "); int ���� = scanner.nextInt();
		System.out.println("�������� : "); int ���� = scanner.nextInt();
		System.out.println("�������� : "); int ���� = scanner.nextInt();
		
		int ��� = (����+����+����)/3;
		
		if (���>=90) { // ��� 90�� �̻��̸�
			// if ��ø 
			if (����==100) {System.out.println("������");	}
			if (����==100) {System.out.println("������");	}
			if (����==100) {System.out.println("���п��");	}
		} // if e	
		else if (���>=80) { // ��� 80�� �̻��̸�
			// if ��ø
			if( ����>=90) System.out.println("�������");
			if( ����>=90) System.out.println("�������");
			if( ����>=90) System.out.println("�������");
			// else if e
		}else { System.out.println(" ����� "); }
		
		
		
	} // me

} // c e
