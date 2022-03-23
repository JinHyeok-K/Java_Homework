package Day07;

import java.util.Scanner;

public class Day07_05_BookApplication { //class end
	
	// BookApplicatio\n Ŭ����: ��&��� ���� �ڵ�
	// Book Ŭ����: ���� ���� �ڵ�
	// Member Ŭ����: ȸ�� ���� �ڵ�
	
	// * ���� �뿩 console ���α׷�[ Ŭ�������� ]
	// 1. Ŭ���� ���� 
		// 1. book
			// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ��
			// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.��������
		// 2. member
			// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
			// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	// 2. ȭ�� ���� 
		// 1. �ʱ� �޴� [ 1.ȸ������ , 2.�α��� , 3.���̵�ã�� , 4.��й�ȣã��  ]
		// 2. �Ϲ�ȸ���޴� [ 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ]
		// 3. �����ڸ޴�  [ 1.������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�
	
	
	// * main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ���ؼ�
		// �������� : { ���� ���� } ��ȣ ������ ����� ������ { } ���� �� ����
			// ���� �ٸ� �߰�ȣ{ } ���� ���� -> ��������
		// static : ���α׷� ���� �� �޸� �Ҵ� | ���α׷� ���� �� �޸� �ʱ�ȭ
			// ���α׷� ���������� ��� ���� ��� �Ǵ� �޸�[����]
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100]; // ��� Ŭ�������� ����ϴ� ȸ����� �迭
	static Book[] books = new Book[1000];
	
	// 0. �ڵ带 �о��ִ� ���� �޼ҵ� [ ������ ]
	public static void main(String[] args) { //main start
		
		// �޼ҵ� ȣ��
			// 1. ���� ȣ��
//		menu(); // ���� ȣ�� �Ұ���  
				// static : �޸� �켱 �Ҵ��̱� ������ static �� �޼ҵ�, �ʵ� �� ����
				// main �޼ҵ� static �޼ҵ� �̱� ������ static �޼ҵ常 ���� ȣ�� ����
			// 2. �ܺ� ȣ��
				// 1. ��ü ����(�޸� �Ҵ�) -> �޼ҵ� ȣ��
		Day07_05_BookApplication application = new Day07_05_BookApplication();
		application.menu();
	}//main end
	
	// 1. �ʱ� �޴� �޼ҵ�
	void menu(){
		while(true) { // ���ѷ��� [ �������� ����]
			
			System.out.println("=========== ���� �뿩 ���α׷� ========");
			System.out.println("1.ȸ������ , 2.�α��� , 3.���̵�ã�� , 4.��й�ȣã��");
			int ch= scanner.nextInt();
			Member member = new Member(); // 1~4 {} ���� ����Ϸ���
			if(ch==1) {
				// ȸ������ �޼ҵ� ȣ��
				boolean result = member.ȸ������(); // ȸ������ �޼ҵ� ȣ��
				if(result) System.err.println("�˸�) ȸ������ ����");
				else System.err.println("�˸�)) ȸ������ ����");
				
			}
			else if(ch==2) {
				String result = member.�α���(); //
				
				if(result ==null) {
					System.err.println("�˸�) ������ ȸ�� ������ �����ϴ�.");
				}
				else if(result.equals("admin")) {
					// 2. ������ �޴� �޼ҵ� ȣ��
					System.out.println("\n �ȳ��ϼ��� �����ڴ�");
					adminmenu();
				}
				else {
					// 1. �Ϲ� �޴� �޼ҵ� ȣ��
					System.out.println("\n �ȳ��ϼ���"+result+"��");
					membermenu( result);
				}
//				member.�α���();
				//�α��� �޼ҵ� ȣ��
					//1. �Ϲ� ȸ�� �޴� �޼ҵ� ȣ��
					//2. ������ �޴� �޼ҵ� ȣ��
			}
			else if(ch==3) {
				member.���̵�ã��();
				//���̵�ã�� �޼ҵ� ȣ��
			}
			else if(ch==4) {
				member.��й�ȣã��();
				//��й�ȣã�� �޼ҵ� ȣ��
			}
			else {}
		}
		
	}
	
	// 2. �Ϲ� ȸ�� �޴� �޼ҵ�
		void membermenu(String loginid) { // �μ��� �������� �޶� ������ �ڷ��� ����
			while(true) {
			System.out.println("------ ȸ�� �޴� ------");
			System.out.print("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�  ����: ");
			int ch = scanner.nextInt();
				Book book = new Book(); // �� �����ڷ� ��ü => �޼ҵ� ȣ���
			if (ch==1) {book.�����˻�();}
			else if (ch==2) {book.�������();}
			else if (ch==3) {book.��������(loginid);}
			else if (ch==4) {book.�����ݳ�();}
			else if (ch==5) {return;}
			else {System.out.println(" �˼����� �Է� �Դϴ�.");}
			}
		}
	// 3. ������ �޴� �޼ҵ�
		void adminmenu() {
			while(true) {
				System.out.println("------ ������ �޴� ------");
				
				System.out.print("1.������� 2.������� 3.�������� 5.�α׾ƿ�  ���� :");
				int ch = scanner.nextInt();
					Book book = new Book();
				if (ch==1) {book.�������();}
				else if (ch==2) {book.�������();}
				else if (ch==3) {book.��������();}
				else if (ch==4) {return;}
				else {System.out.println(" �˼����� �Է� �Դϴ�.");}
			}
		}
	}//class end
