package Day05;

import java.util.Scanner;

/*
��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭

* ���� �뿩 console ���α׷�
1. �迭 ����
	1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
	
	2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
	
	ȸ�� [100][3] : [ID][PW][�����뿩����]
	�������[100][3] : [������][�����뿩����][�뿩��]
2. �ʱ�޴�
	1.ȸ������ 2.�α��� 
		1.ȸ�����Խ� ���̵� �ߺ�üũ 
		2.�α��� ������ �α��θ޴� , �α��� ���н� �α��ν��� ��� 
3. �α��ν� �޴� 
	1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
			1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
		2. ������Ͻ� ��� ������ ��� 
		3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
		4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
		5. �α׾ƿ� �ʱ�޴��� 

4. �α��ν� ���̵� admin �̸� �����ڸ޴� 
	1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
		1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
		2. ������Ͻ� ��� ������ ��� 
		3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
		4. �α׾ƿ��� �ʱ�޴��� 
*/


public class Day05_04_02�����뿩���α׷�_���ۼ� { // class start

	public static void main(String[] args) { //main start
		
		String[][] ȸ�� = new String[101][3]; 	// 101�� 3�� �迭 ����
												//admin ���������� 1�� �� �߰�
		String[][] ������� = new String[100][3]; 
		Scanner scanner = new Scanner(System.in);
		
//		Admin (������) ����
		ȸ��[100][0] = "admin";
		ȸ��[100][1] = "admin";
		
		while(true) { //$1 while ���� �뿩 ���α׷� ����
//		1. �迭 ����
//		1-1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ, ���� �뿩 ���� ]
//		2-1. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
		
//		2.�ʱ�޴�
//		Main menu
		System.out.println(" =================================");
		System.out.println(" ========= ���� �뿩 ���α׷� =========");
		System.out.println(" 1. ȸ �� �� ��     	2.  �� �� ��    ");
		System.out.println(" =================================");
		System.out.println(" ���� :    ");
		
//		# ���� �޴������� ���� (1. ȸ�� ���� | 2. �α���)
			int Mainmenu = scanner.nextInt();
			
			if (Mainmenu == 1) { // #1. ȸ������ ���� ��
				System.out.println("==== ȸ������ ������ ====");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				// id | password | �Է�
				
				// 1-1 ID �ߺ� üũ
				boolean idcheck = true; // idcheck switch 
				for(int i=0;i<ȸ��.length;i++){ // ȸ�� ID ���̸�ŭ �ݺ� ����
					if (ȸ��[i][0]!=null && ȸ��[i][0].equals(id)) {
						System.err.println(" �˸�)) �̹� ����ϰ� �ִ� ID �Դϴ�.");
						idcheck = false; // 100ȸ �ݺ��ϸ鼭 ID �κ��� null �� �ƴ� ���ǿ��� ȸ�� ID �� �Է��� ID �� ���� �� false;
						break; // ȸ�� ID �˻� �ݺ��� Ż��
					}// 1-1 ȸ�� ID check if �� end
				} // 1-1 ȸ�� ID check for �� end
				
				// 1-2 ID/PW/�̸� ���� �κ�
				if (idcheck==true) { // idcheck �� true �� �� ȸ������ ���� | [ID/PW/�̸� ���� �κ�] if �� start
					for (int i=0; 0<(ȸ��.length);i++) { // ȸ�� ID ���� ��ŭ �ݺ� | [ID/PW/�̸� ���� �ݺ���] start
						if (ȸ��[i][0] == null) { 	// [ID/PW/�̸� ���� if��] start
							ȸ��[i][0] = id;				// ȸ�� �迭�� i�� 1�� �� ID
							ȸ��[i][1] = password; 		// ȸ�� �迭�� i�� 2���� ��й�ȣ
														// ȸ�� i ���� 1���� null �� �ʱⰪ�� �Ǿ�������(�������),
														// ȸ��i ���� 1����  �Է��� ID��, i���� 2���� �Է��� password�� ����;
						System.err.println(" �˸�)) ȸ�������� �Ǿ����ϴ�. "); // ���� �Ϸ�
						break;// �����ϴ� �ݺ��� Ż��
						}// 1-2 [ID/PW/�̸� ���� if��] end
					}// 1-2 [ID/PW/�̸� ���� �ݺ���] end
				}// 1-2 [ID/PW/�̸� ���� �κ�] if �� end
			}//1. ȸ������ ���� �� if select end 
			
			if (Mainmenu == 2) {// #2.  �� �� ��  ���� �� if�� start
				System.out.println(" �α��� �� ID :"); 	String id= scanner.next();
				System.out.println(" ��� ��ȣ :"); 		String password= scanner.next();
														// ID & Password �Է�
				boolean logincheck = false; // �α��� üũ�� switch
				for(int i=0;i<ȸ��.length;i++){ // ȸ�� ID ���̸�ŭ �ݺ� ���� | pw check | 2 for �� start
					if( ȸ��[i][0] !=null && ȸ��[i][0].equals(id) &&	 // #null �� �ƴϴ� = ȸ���� �ִ�. 
							ȸ��[i][1].equals(password)) { // 2 if�� start
						System.err.println(" �˸�)) �α��� ����");
						logincheck = true; // �α��� ���� �� ����
					} // 2 if�� end
				}// 2 for �� end

				
				
				// 2-1 ������ ���� �α��� 
				// login �ϴ� ID �� admin �� �� �����ڿ� �޴� open
				while(logincheck) { // ������ �޴� on | 2-1 while start
					if ("admin".equals(id)) { //2-1 if start
						System.out.println(" ==================== ");
						System.out.println(" ===== ������ �޴� ===== ");
						System.out.println(" 1. ���� ��� 2. ���� ��� 3. ���� ���� 4. �α׾ƿ�  ");
						System.out.println(" ���� : "); 
					int admin_menu = scanner.nextInt();
//					    =================== ������ �޴��� 1�� ���� =================== 
						if (admin_menu==1) { // ���� ��� ���� | // 2-1-1 if start
							// ���� �ߺ� üũ start
							
//							================= �ߺ� ���� check ���� ����
//							boolean bookcheck =true; // bookcheck switch
//							for (int j=0;j<�������.length;j++) {
//								if (�������[j][0]!=null && �������[i][0].equals(bookname)) {
//									System.err.println("�̹� ��ϵ� ���� �Դϴ�.");
//									bookcheck =false;
//									break;
//								}
//							}
//							================= �ߺ� ���� check ���� ����
							
						System.out.println("����Ͻ� ������ ������ �Է��ϼ���"); int regist_book_num =scanner.nextInt();
							for(int j=0;j<regist_book_num;j++) { // ���� ��� ���� ��ŭ ��� ���� | 2-1-1 for start
								System.out.println(" ����ϴ� ���� :"); String bookname= scanner.next();
								
								
								�������[j][0]=bookname;
								�������[j][1]="�뿩����";
								�������[j][2]="�뿩����";
							} // 2-1-1 for start
						}// 2-1-1 if start
//						=================== ������ �޴��� 2�� ���� =================== 
						/*
						 	// 1-1 ���� �ߺ� üũ ������ ���� code
							boolean idcheck = true; // idcheck switch 
							for(int i=0;i<ȸ��.length;i++){ // ȸ�� ID ���̸�ŭ �ݺ� ����
								if (ȸ��[i][0]!=null && ȸ��[i][0].equals(id)) {
									System.err.println(" �˸�)) �̹� ����ϰ� �ִ� ID �Դϴ�.");
									idcheck = false; // 100ȸ �ݺ��ϸ鼭 ID �κ��� null �� �ƴ� ���ǿ��� ȸ�� ID �� �Է��� ID �� ���� �� false;
									break; // ȸ�� ID �˻� �ݺ��� Ż��
								}// 1-1 ȸ�� ID check if �� end
							} // 1-1 ȸ�� ID check for �� end
						 */
						
						
						if (admin_menu==2) { // 2-1-2 ���� ��� ��ħ if start
							int count_book=0; // count_book ����
							for (int j=0;j<�������.length;j++) { // 2-1-2-1 ���� ��� ��ħ for start
								if(�������[j][0]!=null) {  //2-1-2-1 ���� ��� ��ħ if start | �������� �� count
									count_book++; // ������ ��ϵ� �� �ϳ��� count_book 1�� ����
								} //2-1-2-1 ���� ��� ��ħ if end | �������� �� count
							}// 2-1-2-1 ���� ��� ��ħ for end
							if (count_book<=0) { // 2-1-2-2 if start (��� ���� ���� ���� �˸�) | count_book �� ���� �� = null
								System.err.println("��ϵ� ������ �����ϴ�. ���� ������ �߰��� �ּ���");
							} // 2-1-2-2 if end (��� ���� ���� ���� �˸�)
							else if(count_book>0) { // 2-1-2-3 if start (��� ���� ���� ��ħ) | count_book �� ���� �� = ���� ������
								System.out.println("���� �̸�"+"\t"+"�뿩 ���� ����"+"\t"+"�뿩��");
								for (int j=0;j<�������.length;j++) { // 2-1-2-3 for start | ������� ���
									if(�������[j][0]!=null) { // 2-1-2-3-1 if start | null �ƴ� �� Ȯ��
									System.out.println(�������[j][0]+"\t"+�������[j][1]+"\t\t"+�������[j][2]);
									}  // 2-1-2-3-1 if end | null �ƴ� �� Ȯ��
								} // 2-1-2-3 for end | ������� ���
							}// 2-1-2-3 if end (��� ���� ���� ��ħ)
						}// 2-1-2 ���� ��� ��ħ if end 
						
//						=================== ������ �޴��� 3�� ���� =================== 	
						if (admin_menu==3) { // 2-1-3 ���� ���� �޴� if ���� |
							int count_null_book = 0; // ���� ������ check ���� ����
							for(int j=0;j<�������.length;j++) { //2-1-3 ������� check for start
								if(�������[j][0]!=null) { // 2-1-3-1 ���� counting if start
									count_null_book++;
								} // 2-1-3-1  ���� counting if end
								if(count_null_book<=0) { // 2-1-3-2 null ���� check if start
									System.err.println("������ ������ �����ϴ�.");
									break;
								} // 2-1-3-2 null ���� check if end
								else if(count_null_book>0) { // 2-1-3-3 ���� ���� check if start
									System.out.println("���� �̸�"+"\t"+"�뿩 ���� ����"+"\t"+"�뿩��");
									for (int p=0;p<�������.length;p++) { // 2-1-3-3-1 ���� ���� ��� ��� for start
										if(�������[p][0]!=null) { // 2-1-3-3-1-1 ���� ���� ��� ��� if start
										System.out.println(�������[p][0]+"\t"+�������[p][1]+"\t\t"+�������[p][2]);
										}  // 2-1-3-3-1-1 ���� ���� ��� ��� if end
									}  // 2-1-3-3-1 ���� ���� ��� ��� for end
									System.out.println("�����Ͻ� ������ ��ȣ�� �Է� �� �ּ���"); int del_book=scanner.nextInt();
									�������[del_book-1][0] = null; 
									�������[del_book-1][1] = null;
									�������[del_book-1][2] = null;
									break;
									// index ��ȣ�� 0������ ����ǹǷ� 1������ 0��°�� �ϱ� ���� -1 ����
								} // 2-1-3-3 ���� ���� check if start
							}//2-1-3 ������� check for end
						}  // 2-1-3 ���� ���� �޴� if end |
						if (admin_menu==4) { // 2-1-4 if start
							break;
						} // 2-1-4 if end
//						logincheck =false;
					}//2-1 if end
//					logincheck =false;
//					"admin".equals(id)
//					else 
					// �Ϲ� ȸ�� �α��� �� �޴�â 2-1	
					if (!"admin".equals(id)) { // �Ϲ�ȸ�� menu 2-1 if start 
						// �Ϲ� ȸ�� �α��� �Ϸ� �� �޴� â =========================
						System.out.println("=========================");
						System.out.println("1.���� ��Ȳ   2.���� �޴� 3. �α׾ƿ�");
						System.out.println("=========================");
						System.out.println(" ���� :    ");
						// ==================================================
						int submenu =scanner.nextInt();
						if (submenu ==1) { // 2-1-1 �Ϲ� ȸ�� ���� ���� Ȯ�� if start
							for (int i=0;i<ȸ��.length;i++) { //2-1-1-1 ���� ��Ȳ �ľ� for �� start
								if(ȸ��[i][2]==null) { // 2-1-1-1-1 ���� ��Ȳ �ľ� if �� start
									System.err.println("���� ������ �����ϴ�.");
									break;
								}// 2-1-1-1-1 ���� ��Ȳ �ľ� if �� start
							}// 2-1-1-1 ���� ��Ȳ �ľ� for �� end
						}// 2-1-1 �Ϲ� ȸ�� ���⳻�� Ȯ�� if end
						
						if (submenu==2) { // 2-1-2 ���� �޴� ��ħ if start
							while(logincheck) {
								System.out.println(" ==================== ");
								System.out.println(" ===== ���� �޴� ===== ");
								System.out.println(" 1. ���� ��� 2. ���� ���� 3. ���� �ݳ� 4. �ڷ�  ");
								System.out.println(" ���� : "); 
							int book_menu = scanner.nextInt();
								if (book_menu == 1) {
									int book_check = 0;
									for (int j =0;j<�������.length;j++) {
										if(�������[j][0]!=null) {
											book_check++;
										}
									}
									if(book_check<=0) {
										System.err.println("���� ����� �����ϴ�.");
									}
									else if(book_check>0) {
										System.out.println("���� �̸�"+"\t"+"�뿩 ���� ����"+"\t"+"�뿩��");
										for (int p=0;p<�������.length;p++) { // 2-1-3-3-1 ���� ���� ��� ��� for start
											if(�������[p][0]!=null) { // 2-1-3-3-1-1 ���� ���� ��� ��� if start
											System.out.println(�������[p][0]+"\t"+�������[p][1]+"\t\t"+�������[p][2]);
											}  // 2-1-3-3-1-1 ���� ���� ��� ��� if end
										}
									}
									
								}
								if (book_menu == 2){
									System.out.println(" �����Ͻ� ������ ������ �ּ���");
									System.out.println(" ���� : ");
									int select_book = scanner.nextInt();
								//		ȸ��["id"][2] = �������[select_book][0];
										�������[select_book-1][1] = "������";
										�������[select_book-1][2] = id;
								}
								
								if (book_menu == 3){
									System.out.println(" ������ �ݳ��մϴ�.");
									System.out.println(" �ƹ� ���ڸ� �����ּ���");
									int select_book2 = scanner.nextInt();
										�������[select_book2-1][1] = "�뿩 ����";
										�������[select_book2-1][2] = "�뿩 ����";
								}
								
								if (book_menu == 4){
									break;
								}
						}// 2-1-2 ���� �޴� ��ħ if end
						}	
							
						if (submenu==3) {
							break;
						}
							
						
					}// �Ϲ�ȸ�� menu 2-1 if start
				} // 2-1 while end
				logincheck =false;
				
					
				
				
				
				// �Ϲ� ȸ�� �α��� �� �޴�â 2-1
				while(logincheck) { // logincheck �� true �� �� �α��� �� �޴�â open | 2-1 while start
					int submenu = scanner.nextInt();
					if (submenu ==1) {
						for (int i=0;i<ȸ��.length;i++) { // ���� ��Ȳ �ľ� for ��
							if(ȸ��[i][2]==null) {
								System.err.println("���⳻���� �����ϴ�.");
								break;
							}
						}
					}
				} // 2-1 while end
			
				
//				System.out.println(" �α��� �� ID :"); 	String 11= scanner.next(); // 2�� ���� �� �޴� ǥ��
				
			if(logincheck == false) System.err.println("�˸� )) ȸ�� ������ ���ų� �ٸ��ϴ�.");
			} // 2.  [�� �� ��  ���� ��] if �� end	
			
		} // $1 while ���� �뿩���α׷� ���ѹݺ�[while] end
	} // main end
}// class end
