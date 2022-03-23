package Day05;

import java.util.Scanner;

public class Day05_02_�Խ��� { // c s
	
	// ȸ���� �湮�� ���α׷� [ 2���� �迭 ] ���� class& DB version ���
		// 1. �ʱ� �޴� [ 1. ȸ������ 2.�α���]
			// 1. ȸ������ [ ���̵�, ��й�ȣ, �̸�]
			// 2. �α��� [���̵�, ��й�ȣ �����ϸ� �α��� ó��]
		// 2. �α��� �� �޴� [ 1. �湮�� ���� 2. �α׾ƿ�]
			// 1. �湮�� ���� [ ����, ����, �ۼ���(�α��ε� ���̵�)]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	
	
	public static void main(String[] args) { // m s
		
		// �غ� [ ��ü���� ���̴� ����; ���� ����  ]
		Scanner scanner = new Scanner(System.in); // �Է� ��ü
			// ȸ�� 100��[id,pw,name] �����ϴ� �迭		
		String[][] memberlist = new String[100][3]; // 100�� 3�� =>300ĭ==> ȸ���� 1�� [1��=id][2��=pw][3��=name]
			// �湮�� 100��[title, contents, writter] �����ϴ� �迭
		String[][] boardlist = new String[100][3]; // �Խù��� 1��
		
		// �ʱ�޴�
		
		while(true) { //���� ���� [ �������� : X]
			System.out.println("------------------------");
			System.out.println("------ ȸ���� �湮�� -------");
			System.out.println("------------------------");
			System.out.printf(" 1.ȸ�� ����   2.�α��� ���� :"); int ch = scanner.nextInt();
			
			if (ch==1) { // 1. ȸ������
				System.out.println("---- ȸ������ ������ ----");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				System.out.print(" Member Name : ");		String name = scanner.next();
				// String 3�� ������ �Է� �޾� memberlist 2���� �迭�� ����
					// 1. �� ����[����=0,��ü(���ڿ�)=null] �� ã�Ƽ� ���� [ ���࿡ �� ������ ������ ȸ�� 100�� �ʰ� ]
					// 2. ���̵� �ߺ�üũ.
				
				// ���̵� �ߺ� üũ [�˻�]
					// ���� ȸ���� id�� �����ϸ� ȸ������ �Ұ�
				boolean idcheck = true;
				for(int i=0;i<memberlist.length;i++) { // id check for start
					
					if ( memberlist[i][0]!=null && memberlist[i][0].equals(id) ) {// ==null : ȸ���� ����.  !=null : ȸ���� ����.
						System.err.println(" �˸�)) �̹� ����ϰ� �ִ� ID �Դϴ�.");
						idcheck = false; // ���� X | ȸ������ �Ұ����ϰ� idcheck ������ false�� ����
						break;
					}
				} // id check for end
					
				// ���� �κ�
				if (idcheck == true) { // idcheck �� true �� ��쿡�� ȸ������ ó��
					for(int i=0;i<memberlist.length;i++) {
						if( memberlist[i][0] == null ) {	// i��° �࿡ id�� ������ = �� ����
							
							memberlist[i][0]= id; 	
							memberlist[i][1]= password;
							memberlist[i][2]= name;  // i ��° �� ���� ������ ����
							System.err.println(" �˸�)) ȸ�������� �Ǿ����ϴ�. ");
							break; // ���������� �� [1�� ����]
						} 
					} //����κ� for end
				} // ����κ� if end
			}// if end ( ch==1 )
			
			else if (ch ==2) { // 2. �α��� ����
				
				System.out.println("---- �α��� ������ ----");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				
				// �迭 �� �����Ͱ� �Է� ���� id�� password�� �����ϸ� �α��� ó��
				 // �α��� ó�� for start
				boolean logincheck = false; // �α��� ���� �⺻ ��;
				for (int i =0; i<memberlist.length;i++) {
					if( memberlist[i][0] !=null && memberlist[i][0].equals(id) &&	 // null �� �ƴϴ� = ȸ���� �ִ�. 
							memberlist[i][1].equals(password)) { 
						// i��° �࿡ id�� i��° �࿡ password�� �Է� ���� ����  equals ������
							// null �� equals �Ұ���, �� ������(==) ����
							// null �� equals �� �Ұ���
							// null �� ��ü�� �ƴϱ� ������ equals �Ұ���
						System.err.println(" �˸�)) �α��� ����");
						
						logincheck = true; // �α��� ���� �� ����
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
						while(true) { // �α��� �� �޴� ���� ���� [ ���� ���� : �α� �ƿ�]
							System.out.println("-------------------");
							System.out.println("------- �湮�� -------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
								// ��� �湮�� ���
								for(int j=0; j<boardlist.length;j++) {
									if( boardlist[j][0]!=null) { // �Խù��� ���� �ε����� ����
									System.out.printf("%d\t%s\t%s\t%s \n",
											j,
											boardlist[j][2],
											boardlist[j][0],
											boardlist[j][1]);
									}
								}
							System.out.println("1. �湮�� ����� 2. �α׾ƿ� ���� : "); int ch2 = scanner.nextInt();
							
							if (ch2==1) {
								System.out.println("---------- �� ���� ----------");
								System.out.println(" title : "); 		String title = scanner.next(); // ����
								System.out.println(" contents : "); 	String contents = scanner.next(); // ����
								// ����(����)
									for(int j = 0 ; j<boardlist.length;j++) {
										if(boardlist[j][0]==null) { // �迭 �� ���� ã�Ƽ� ���� | �迭 �� j��° �ε��� �Խù��� �����̸� ����
											boardlist[j][0] = title;
											boardlist[j][1] = contents;
											boardlist[j][2] = id; // �α��� �� ���� id�� ����
											System.err.println(" �˸�)) ������ �Ϸ� �Ǿ���!�ϴ�.");
											break;
										}
									}
							}
							else if(ch==2) {
								 System.err.println(" �˸�)) �α׾ƿ�" );
								 break;	 // ���� ����� �ݺ��� Ż��								 
							}
							else { System.err.println(" �˸�)) �˼� ���� ��ȣ �Դϴ�!"); }
						} // ȸ�� �޴� end
////////////////////////////////////////////////////////////////////////////////////////////////////////////////						
						
					} //�α��� ó�� if end
				} // for end 
				// �α��� ���� ��
				if(logincheck == false) System.err.println("�˸� )) ȸ�� ������ ���ų� �ٸ��ϴ�.");
				
			} // ch==2 if  end
			else { System.err.println(" �˸�)) �˼� ���� ��ȣ �Դϴ�!"); }
		} // while1 end	 = �ʱ� �޴� end
	} // m e
} // c e
