package Day07.seat_study;

import java.util.Scanner;

public class BookApp { // class start | ȭ�� ���� Class



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
	// =====================================================================
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Book[] books = new Book[100];
	
	public static void main(String[] args) { // main start
		
		BookApp app = new BookApp();
		app.menu();
		
	}// main end
	
	// 1. �ʱ� �޴� �޼ҵ�
	void menu() {
		while(true) {
			System.out.println(" ----- Book App -----");
			System.out.print("1.ȸ������ 2.�α��� 3.IDã�� 4.PWã��");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2){
				
			}
			else if(ch==3){
				
			}
			else if(ch==4){
				
			}
			else System.out.println("�߸��� �Է�");
		}
	}
	// 2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu() {
		while(true) {
			System.out.println(" ----- ȸ�� �޴� -----");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2){
				
			}
			else if(ch==3){
				
			}
			else if(ch==4){
				
			}
			else System.out.println("�߸��� �Է�");
		}
	}
	
		
	// 3. ������ �޴� �޼ҵ�
	void adminmenu() {
		while(true) {
			System.out.println(" ----- ������ �޴� -----");
			System.out.println("1.������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�");
			
			int ch = scanner.nextInt();
			if(ch==1) {
				
			}
			else if(ch==2){
				
			}
			else if(ch==3){
				
			}
			else if(ch==4){
				
			}
			else System.out.println("�߸��� �Է�");
		}
	}
} // class end


