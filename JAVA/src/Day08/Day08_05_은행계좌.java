package Day08;


import java.util.Scanner;

public class Day08_05_������� {

	// ����(�����) ���α׷�
		// �䱸����
		// ȸ�� �ֿ��� : 1. ȸ������ 2.�α��� 3. ���̵� ã�� 4. ��й�ȣã��(����)
		// ���� �ֿ��� : 1. ���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6. ���¸��
		// ���� : ����, �����ǰ(������), ȸ��
			// �ʵ�
			// �޼ҵ�
	/*
	 * ȸ�� �ʵ� :1. ȸ������ 2.�α��� 3. ���̵� ã�� 4. ��й�ȣã��(����)

		���� �ʵ� :1. ���� ���� 2.�Ա� 3.��� 4.��ü 5.���� 6. ���¸��
		���� ���� �ʵ� : ȸ�� �̸� / ��й�ȣ
	    ��ü �ʵ� : ������ ��� /��й�ȣ/�޴»��/�޴»������  	
		���� : ����ȸ�� / ����ݾ�
		
 
	 */
 	static Scanner scanner = new Scanner(System.in);
 	static Member[] members = new Member[100];
 	static Address[] addsess= new Address[100];
 	
 	
 	
 	public static void main(String[] args) {
		
 		Day08_05_������� application = new Day08_05_�������();
 		application.menu();
 	}	
	
 	// 1. �ʱ� �޴� �޼ҵ�
	void menu() {
		while( true) { // ���ѷ��� [ �������� ���� ]
			System.out.println("1. ȸ������ 2.�α��� 3. ���̵� ã�� 4. ��й�ȣã��(����)");
			int ch = scanner.nextInt();
			Member member = new Member(); // 1~4 {}��ȣ���� ��� ����
			if( ch == 1 ) {
				
				boolean result =  member.ȸ������();// ȸ������ �޼ҵ� ȣ�� 
				if( result ) 
					System.err.println(" �˸�]] ȸ������ ���� ");
//					System.out.println(" ������ ���¹�ȣ�� "+ me +"�Դϴ�");
				else 
					System.err.println(" �˸�]] ȸ������ ����");
				
			} 
			else if( ch ==2 ) {
				String result = member.�α���(); // �α��� �޼ҵ� ȣ�� 
				
				if( result == null ) { // �α��ν��� 
					System.out.println(" �˸�]] ������ ȸ�������� �����ϴ�.");
//				}else if( result.equals("admin")) { // ������
//					// 2. ������ �޴� �޼ҵ� ȣ�� 
//					System.out.println(" �˸�]] �ȳ��ϼ���~ "+result+"��");
//					adminmenu(); // ���� �޼ҵ� ȣ��
				}else{ // �Ϲ� 
					// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println(" �˸�]] �ȳ��ϼ���~ "+result+"��");
					membermenu( result ); // �μ�1�� [ �α��� ������ id ] 
				}
			}
//			else if( ch ==3 ) {
//				member.���̵�ã��();// ���̵� ã�� �޼ҵ� ȣ�� 
//			}
//			else if( ch ==4 ) {
//				member.��й�ȣã��(); // ��й�ȣ ã�� �޼ҵ� ���� 
//			}
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
			
		}
	} // menu end 
	
	// 2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu( String loginid ) { // �μ� �������� �޶� ������ �ڷ��� ���� 
		while(true) {
			System.out.println(" --------------- ȸ�� �޴� ------------------");
			System.out.print("1.�Ա� 2.��� 3.��ü 4.���� 5.���¸�� 6.�α׾ƿ�");
			int ch = scanner.nextInt();
				Address address = new Address(); // ������ڷ� ��ü => �޼ҵ� ȣ���
			if( ch == 1 ) 		{ address.�Ա�(loginid); }
			else if( ch ==2 ) 	{ address.���(loginid); }
			else if( ch == 3 ) 	{ address.��ü( loginid ); }
			else if( ch == 4 ) 	{ address.����( loginid ); }
//			else if( ch == 5 ) 	{ address.���¸��( loginid ); }
			else if( ch == 6 ) 	{ return; } // �Ϲ�ȸ���޴� �޼ҵ� ���� [ �α׾ƿ� ] 
//			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
		}
	} // �Ϲ�ȸ�� �޴� ���� 
	// 3. ������ �޴� �޼ҵ� 
//	void adminmenu() {
//		while(true) {
//			System.out.println(" --------------- ������ �޴� ------------------");
//			System.out.print("1.������� 2.������� 3.�������� 4.�α׾ƿ� ���� : ");
//			int ch = scanner.nextInt();
//				Book book = new Book();
//			if( ch == 1 ) 		{ book.�������(); }
//			else if( ch == 2 ) 	{ book.�������(); }
//			else if( ch == 3 ) 	{ book.��������(); }
//			else if( ch == 4 ) 	{ return; }		// �����ڸ޴� �޼ҵ� ���� 
//			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
//		}
//	}
	
 	
 	
 	
}
