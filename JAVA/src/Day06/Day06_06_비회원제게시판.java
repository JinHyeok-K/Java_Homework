package Day06;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class Day06_06_��ȸ�����Խ��� { // class start
	
			// �Խ��� [Ŭ���� ����]
				// 0. �Խù� ���� => Ŭ���� ����
					// 1. �ʵ� : ����, ����, �ۼ���, ��й�ȣ
					// ������ : ��� ���� ����-> ���
				// 1. ù ȭ�� [��� �Խù� ���(��ȣ, ����, �ۼ���)]
				// 2. �޴� [ 1. �� ���� 2. �� ����]
					// 1. �� ���� [ ����, ����, �ۼ���, ��й�ȣ�� �Է¹޾� ��ü ����] => 4�� ���� ��üȭ
					// 2. �� ���� [ �ش� �� ��ȣ�� �Է¹޾� �ش� �� ��������(��ȣ, �ۼ���, ����, ���� ��� ���) ]
						// �� ��ȣ�� �迭�� ����Ǵ� ���� [�ε���]
						// �� ���� �޴�
				// 3. �� ���� �޴� [1. �ڷΰ��� (��Ϻ���) 2.���� 3. ����]
					// 1. ���� �� : ��й�ȣ �Է¹޾� �����ϸ� ����
					// 2. ���� �� : ��й�ȭ �Է¹޾� �����ϸ� ����� ���븸 ����
	
	
	public static void main(String[] args) { // main start
		
		// �غ� [ ��� { } �ȿ��� ���Ǵ� ���� ����]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
			// * Board ��ü�� 100���� ������ �� �ִ� 1���� �迭 ����
		
		// ���α׷� ����
		while(true) { //���α׷� ���� ���ѷ��� [�������� : x ]
			
			System.out.println(" --------- Ŀ�´�Ƽ ------------");
			//  ====== ====== ====== ====== ====== ��� �Խù� ��ȸ start ====== ====== ============ ====== ====== ====== ======
			System.out.println("��ȣ\t�ۼ���\t����");
				// �迭 �� ��� ��ü(�Խù�) ��� �ݺ���
				int index = 0; // �ε��� ���� [ �迭 �� ��ü �� üũ ]
				for (Board board : boardlist) {
					
					if(board!=null) { // ���࿡ �ش� board ��ü�� ���� ���� ������ ���
					System.out.printf("%d\t%s\t%s \n", 
							index,board.writter,board.title);
					} // ���Ĺ��� : %s ���� %d ����
							// %����s: ���ڸ�ŭ �ڸ� ���� [���࿡ �ش� ������ ��ŭ ������ ����]
					index++; //�ε��� ����
				}
			//  ====== ====== ====== ====== ====== ��� �Խù� ��ȸ end ====== ====== ====== ============ ====== ====== ======
			
			//  ====== ====== ====== ====== ====== �� ���� Code start ====== ====== ============ ====== ====== ======
			System.out.println("1. �� ���� 2. �� ����");
			int ch = scanner.nextInt();
			if( ch==1) { // 1. �� ����
				// 1. 4�� ������ �Է� �޴´�.
				System.out.println(" ------------------ �� ���� ������ ---------------------- ");
				System.out.println(" title : "); 			String  title =scanner.next();
				System.out.println(" contents : ");			String  contents = scanner.next();
				System.out.println(" writter : ");			String	writter = scanner.next();
				System.out.println(" password : ");			String	password = scanner.next();
				// 2. 4�� ������ ��üȭ [ ��ü�� ���� 4�� ������ ��ü �� �ʵ忡 ���� ]
				Board board = new Board(title,contents,writter,password);
							// 4�� �ʵ带 ���� ������ ���
				// 3. �迭 �� �� ������ ã�Ƽ� �� ������ ��ü ����
				int i =0;
				for(Board temp : boardlist) {// �� ���� ã������
					if(temp==null) {
						boardlist[i]=board; // �ش� �ε����� ���ο� ��ü ����
						break;
					}
					i++;
				}
				//  ====== ====== ====== ====== ====== �� ���� Code end ====== ====== ====== ============ ====== ====== ======
			}
			else if(ch==2){	// 2. �� ����
				System.out.println(" �Խù� ��ȣ(�ε���) ���� : "); int bno=scanner.nextInt();
				System.out.println(" ------------ �Խù� �� ������ --------------");
				// �ݺ��� ��� ���� X => ����� ��ġ[�ε���] �Է� �޾ұ� ������(int bno=index ��ȣ)
				System.out.printf("�ۼ��� : %s ���� : %s \n", 
						boardlist[bno].writter,boardlist[bno].title);
				
				System.out.printf("����: %s \n",boardlist[bno].contents);
				System.out.println("-------------------------------");
				System.out.println("1. ��Ϻ���(�ڷΰ���) 2. �ۻ��� 3. �ۼ���");
				int ch2 = scanner.nextInt();
				if (ch2==1)	{
					
				}
			//  ====== ====== ====== ====== ====== �� ���� Code start ====== ====== ====== ============ ====== ====== ======
				else if( ch2==2) { // 2. �ۻ��� 
					// ��� ��ȣ �Է� �޾� �Խñ� ��й�ȣ ���� �� ����
					System.err.println("���� �Ϸ��� ��й�ȣ�� �ʿ�");
					System.out.println(" ��й�ȣ : "); String pwcheck=scanner.next();
					
					if (boardlist[bno].password.equals(pwcheck)) {
						boardlist[bno] = null;
						
						for(int i = bno;i<boardlist.length;i++) {
										// �迭 ���� = 100 �ε��� : 0~99
							// * �˻��� �Խù��� �ε��� ���� ������ �ε��� ���� 1�� ����
							if( i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							// i�� �������ε��� �� ������ �������ε������� null ����
							else boardlist[i]=boardlist[i+1]; // ������ �Խù� ���� �Խù�
							//������ �ε����� �ƴϸ� �ε��� ����
							/*
							  // ���࿡ 2�� �ε��� ������
							   * 2�ε��� = 3�ε���
							   * 3�ε��� = 4�ε���
							   * .
							   * .
							   * .
							   * 98�ε��� = 99�ε��� [0��~99�� -> 100�� �ε���]
							   * 99�ε��� = null [99�� �ε��� : ������ �ε���
							
							
							
							*/
							if(i==boardlist.length-1) 
								boardlist[boardlist.length-1]=null;;	
								// i�� ������ �ε����� ������ ������ �ε������� null ����
								
						}
					}
					else {
						System.err.println(" �˸�)) ��й�ȣ�� �ٸ��ϴ� [����  ���� ]");
					}
					// ���� �Ŀ� ������ �ε��� �ڷ� �ѱ� �� ������ �̵�
						// why? ���࿡ ���ϸ� �ش� �ڵ尡 ���� ��� �迭 �� ���� �߻� 
							// ex ) 0 , 1, 2 �� ���� 1�� �ϸ� 0, 2 ���� '1'�� ����
					
				}
//				====== ====== ====== ======  �� ���� Code end ====== ====== ====== ============ ====== ====== ======

//				====== ====== ====== ======  �� ���� Code start ====== ====== ====== ============ ====== ====== ======
				else if (ch2==3) {
					// 1. ��й�ȣ �Է� �ޱ�
					System.err.println("���� �Ϸ��� ��й�ȣ�� �ʿ�");
					System.err.println(" ��й�ȣ : "); String pwcheck=scanner.next();
					// 2. bno: ���Խù�(�����ִ� �Խù�) �� �ε��� ��ü �� ��� ��ȣ�� ���� ���� Ȯ��
					if (boardlist[bno].password.equals(pwcheck)) {
						// �ش� �Խù��� ����� ������ ���� �Է¹޾� �� �Խù� ��ü�� ����� ���뿡 ����.
						System.out.println(" title ���� : "); 	boardlist[bno].title = scanner.next();
						System.out.println(" ���� ���� : "); 		boardlist[bno].contents = scanner.next();
					}
					else System.out.println("�˸�) �н����尡 �ٸ��ϴ� [���� ����]");
				}
//				====== ====== ====== ======  �� ���� Code end ====== ====== ====== ============ ====== ====== ======
				else {System.err.println("�˸�) �˼� ���� �Է��Դϴ�.");}
			}
			else {
				System.err.println("�˸�) �˼� ���� �Է��Դϴ�.");
			}
			
			
			
		} // ���α׷� while end
	} // main end
} // class end
