package Day05;

import java.util.Random;
import java.util.Scanner;

// 
//	1. ��,��� 
//  2. ����/�ڷ���/����
//  3. ����/�ݺ�
//	4. ����/�ݺ�
//	5. �迭


/*
���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ID(�ߺ�X), PW ]
		2. ���� [ ������(�ߺ�X), �����뿩����(�뿩 ���� OR �뿩��), �뿩��(�α��� �� ���̵�)]
	2. �ʱ�޴�
		1. ȸ������ 2.�α���
			1. ȸ������ �� ���̵� �ߺ�üũ
			2. �α��� ���� �� �α��� �޴�, �α��� ���н� �α��� ���� ���
	3. �α��� �� �޴�
		1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5. �α׾ƿ�
			1.���� �˻� �� �������� ��ġ�ϸ� ������� ���� �뿩���� ���
			2.���� ��� �� ��� ������ ���
			3.���� �뿩�� ���� �뿩���ΰ� ������ �� ���� �뿩 ó��
			4.���� �ݳ� ��  ������ �뿩�� ������ �ݳ� ó��
			5.�α׾ƿ�
			
	4. �α��� �� ���̵� admin �̸� ������ �޴�
		1. ���� ��� 2. ���� ��� 3. ���� ���� 4. �α׾ƿ� 
			1. ���� ��� �� �������� �Է� �޾� ���� ���ó��
			2. ���� ��� �� ��� ������ ���
			3. ���� ���� �� ���� �� �������� �Է¹޾� ������ ������ ���� [null]
			4. �α׾ƿ� �� �ʱ�޴���
			====================================================================
	/*
	��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭

	* ���� �뿩 console ���α׷�
	1. �迭 ����
		1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
		2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
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
		
			
			
			
			

public class Day05_04_�����뿩���α׷� { // c.s
	
	public static void main(String[] args) { // m s
	// 1. �迭 ����	
		// �Է� ��ü start
		Scanner scanner = new Scanner(System.in);
		String[][] ȸ�� = new String[101][3]; 	// ȸ�� �迭 ���� : total 100��
			// ID /PW / �뿩�� ����
		String[][] ������� = new String[100][3]; 		// ���� �迭 ���� : total 100�� �弭
			// ������ /������ or ���Ⱑ�� / �뿩��(id)
		Random random = new Random();
		int admin_address = random.nextInt(ȸ��.length);
		String admin_ID ="admin";
		String admin_PW ="admin";
		ȸ��[admin_address][0] = admin_ID; ȸ��[admin_address][1] = admin_PW;
		// admin ��� Ȯ��
		System.out.println(admin_address);
		System.out.println(ȸ��[admin_address][0]);
		System.out.println(ȸ��[admin_address][1]); 
		
	// 2. �ʱ�޴�
//		1. ȸ������ 2.�α���
//		1. ȸ������ �� ���̵� �ߺ�üũ
//		2. �α��� ���� �� �α��� �޴�, �α��� ���н� �α��� ���� ���
		
		while(true) {
		
		System.out.println(" ======================= ");
		System.out.println(" ======= ���� �뿩  ���α׷� ======= ");
		System.out.println(" ======================= ");
		System.out.println(" 1. ȸ�� ���� 2. �α��� ");
		System.out.println(" ���� : "); 
		//* admin ���� ���
		
//		ȸ��[100][0] = "admin";
//		ȸ��[100][1] = "admin";
//		
		
		int realcount = 0;
		int nullcount = 0;
//		System.out.println(ȸ��[100][0]);
//		System.out.println(ȸ��[100][1]);
		// 1. ȸ������
			// 1. ID | PW |
		
//================================================================================================
		int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.println("==== ȸ������ ������ ====");
				System.out.print(" Member ID: "); 			String id = scanner.next();
				System.out.print(" Member Password : "); 	String password = scanner.next();
				System.out.print(" Member Name : ");		String name = scanner.next();
				
				// 2. ID �ߺ� üũ
				
				boolean idcheck = true;
				for(int i=0;i<ȸ��.length;i++){ // ȸ�� ID ���̸�ŭ �ݺ� ����
					
					if (ȸ��[i][0]!=null && ȸ��[i][0].equals(id)) {
						System.err.println(" �˸�)) �̹� ����ϰ� �ִ� ID �Դϴ�.");
						idcheck = false;
						break;
					}// ȸ�� ID check if �� end
				}// �ߺ� üũ for �� end
				// select 1 ==> ���� �κ�
				if (idcheck == true) { // idcheck �� true �� ��쿡�� ȸ������ ó��
					for(int i=0;i<ȸ��.length;i++) {
						if( ȸ��[i][0] == null ) {	
							
							ȸ��[i][0]= id; 	
							ȸ��[i][1]= password;
							ȸ��[i][2]= name;  // i ��° �� ���� ������ ����
							System.err.println(" �˸�)) ȸ�������� �Ǿ����ϴ�. ");
							break; 
						} // ȸ�� �� ���� (100) ��ŭ �ݺ� ���� 'for �� end' ==> ����
					} // ȸ�� ���� ���� 'for �� end'
				} // idcheck �� ȸ�� ���Գ��� ���� 'if �� end'
			}// select ==1 �϶�  'if �� end
//    �޴� 1 ================================================================================================ 
			
		// 2. �α���
			
			 if(selectNo==2) { // �α��� ����
				System.out.println(" �α��� �� ID :"); 	String id= scanner.next();
				System.out.println(" ��� ��ȣ :"); 		String password= scanner.next();
				
				
				boolean logincheck = false;
				for(int i=0;i<ȸ��.length;i++){ // ȸ�� ID ���̸�ŭ �ݺ� ���� | pw check
					
					if( ȸ��[i][0] !=null && ȸ��[i][0].equals(id) &&	 // null �� �ƴϴ� = ȸ���� �ִ�. 
							ȸ��[i][1].equals(password)) {
						System.err.println(" �˸�)) �α��� ����");
						logincheck = true; // �α��� ���� �� ����
					
				//==========================
				
					if(logincheck == false) System.err.println("�˸� )) ȸ�� ������ ���ų� �ٸ��ϴ�.");
			
				
			 if ("admin".equals(id)) {
						System.out.println(" ==================== ");
						System.out.println(" ===== ������ �޴� ===== ");
						System.out.println(" 1. ���� ��� 2. ���� ��� 3. ���� ���� 4. �α׾ƿ�  ");
						System.out.println(" ���� : "); 
						int selectadmin =scanner.nextInt();
						if(selectadmin == 1) { // ���� ���
							System.out.println(" ����� ���� �� :"); int booknum= scanner.nextInt();
								for (int q=0;q<booknum;q++) {
									System.out.println(" ����ϴ� ���� :"); String book= scanner.next();
										�������[q][0]= book;
								}
						}
						else if (selectadmin ==2 ) {
								System.out.println("���� ��" +"\t"+"���⿩��"+"\t"+"������");
								for (int q =0;q<�������.length;q++) {
//							
									if (�������[q][0]!=null) {
//										System.out.println(�������[q][0]);
//										System.out.println("���� ��" +"\t"+"���⿩��"+"\t"+"������");
										System.out.println(�������[q][0]+"\t"+�������[q][1]+"\t"+�������[q][2]);
									}
								}
								 								
//								}
								
						}
							
							else if (selectadmin == 3) {
								System.out.println(" ==================== ");
								System.out.println(" ������ ������ �����ϼ��� : ");	 int del_book= scanner.nextInt();
								for (int q=0;q<�������.length;q++) {
									�������[q][del_book-1] = null;
								}
							}
							
							else if (selectadmin == 4) {
									System.out.println(" �������� ���ư��ϴ�. ");
									break;
							}
							     
							
								
								
					}
						
					
					else if(logincheck =true) {
						System.out.println(" ================= ");
						System.out.println(" 1.���� ��Ȳ 2. ���� �޴�  ");
						System.out.println(" ���� : "); 
						int selectNo2 = scanner.nextInt();
				
				// ȸ�� ����(�뿩������ �ƴ���) 
		
					if (selectNo2==1) { // ���� ���� Ȯ��
						for (int j=0;j<ȸ��.length;j++) {
							if (ȸ��[j][2] == null) {
								nullcount++;
								
							}
						}	
						if (nullcount>ȸ��.length) {
							System.err.println(" �˸�)) ���� ���� ������ �����ϴ�.");
						}
						System.err.println(ȸ��[i][2]);
						System.out.println(nullcount);
							
							
						
					} //System.out.println(ȸ��[i][2]);
				
		
					if (selectNo2==2) { // ���� �޴� 
						System.out.println(" ================= ");
						System.out.println(" 1.���� ��� 2. ���� ���� 3. ���� �ݳ� 4. �ڷ�  ");
						System.out.println(" ���� : "); 
						int selectNo3 = scanner.nextInt();
							if(selectNo3==1) {
								System.out.println("���� ��" +"\t"+"���⿩��"+"\t"+"������");
								for (int q =0;q<�������.length;q++) {
										if (�������[q][0]!=null) {
											
											System.out.println(�������[q][0]+"\t"+�������[q][1]+"\t"+�������[q][2]);
											}
										}
							}
							if(selectNo3==2) {
								System.out.println(" ================= ");
								System.out.println(" ====== ������ ������ �����ϼ��� ====== ");
								System.out.println("���� ��" +"\t"+"���⿩��"+"\t"+"������");
								for (int q =0;q<�������.length;q++) {
									if (�������[q][0]!=null) {
										
										System.out.println(�������[q][0]+"\t"+�������[q][1]+"\t"+�������[q][2]);
										}
									}
								System.out.println(" ================= ");
								System.out.println(" ���� : ");
								int sel = scanner.nextInt();
//								for (int q=0; q<�������.length;q++) {
//								ȸ��[i][sel-1] = �������[q][sel-1];
//								}
								ȸ��[i][2]= �������[sel-1][0];
//								
								
							}System.out.println(ȸ��[i][2]);
					}
					
					
				}
			}
			
				
		
				}// ȸ�� pw check if �� end
				if(logincheck == false) System.err.println("�˸� )) ȸ�� ������ ���ų� �ٸ��ϴ�.");
			}// �ߺ� üũ for �� end
			
			
//			} // �α��� �� �ʱ�ȭ ���� while �� end
			
		} // ���� ���α׷� while end
	}//main end
}// class end
