package Day03;

import java.util.Scanner;

public class Day03_07_Ȯ�ι��� { //  c s
	
	public static void main(String[] args) { // m s 
		
		boolean run =true; // ���� ���� ���� : true = ���� | false = ����
		
		int balance =0; // ���ݾ� [����ȿ� �ִ� �ݾ�] ����
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while(run) { // while (���ǽ�) { } : ���ѷ���
			System.out.println("----------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("----------------------");
			System.out.println("����>"); int ���� = scanner.nextInt();
			if( ���� == 1 ) { // ���࿡ �Է°��� 1�̸�
				System.out.println("���ݾ� : "); int ���ݾ� = scanner.nextInt();
				// �Է� ���� ���ݾ��� ���忡 �߰�
				balance += ���ݾ� ;
			}
			else if ( ���� == 2 ) {//���࿡ �Է°��� 2�̸�
				System.out.println("��ݾ� : "); int ��ݾ� = scanner.nextInt();
				// ���࿡ ��ݾ��� ���ݾ� ���� �� ũ�� �ܾ׺���
				if (��ݾ�>balance) {
					System.out.println("�˸�) �ܾ��� �����մϴ�.");
				} // �ƴϸ� ��� ����
				else {balance -= ��ݾ� ; // �Է� ���� ���ݾ��� ���忡 ����
				}
			}
			else if ( ���� == 3 ) {//���࿡ �Է°��� 3�̸�
				System.out.println(" �ܰ� : " + balance);
			}
			else if ( ���� == 4 ) {// �� ��
				break; // while Ż�� [���� ���� ����]
			}else {System.out.println("�˸�) �� �� ���� ��ȣ �Դϴ�.");
			}
		}
		
		System.out.println("���α׷� ����");
		
		
	} // m e 

} // c e
