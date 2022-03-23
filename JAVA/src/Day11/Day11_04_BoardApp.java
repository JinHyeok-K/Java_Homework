package Day11;

import java.util.Scanner;

public class Day11_04_BoardApp {
	//�Խ��� => Base
	/* CRUD [ Creat[����] / Read[�б�] / update[����] / delete[����] ]
	 * �Խ��� + ���+(ȸ��)
	 * ��ȸ���� �Խ��� / ��� ���α׷� [ ����ó��, ����ó��, ����Ʈ ]
	 * 		// [Model]�Խù� Ŭ����
	 * 				// �ʵ�
	 * 					// ����, ����, ,��й�ȣ,�ۼ���, �ۼ���, ��ȸ�� , ��۸���Ʈ 					
	 * 		// [Model]��� Ŭ����
	 * 				// ����, �ۼ���, �ۼ��� 					
	 * 		// [Controller]��Ʈ�ѷ� Ŭ����
	 * 				// 1.��� 2.���� 3.���� 4.���� 5���� 6.��۾���
	 * 				// 7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ����� 
	 * 		// [View] Day11_04_BoardApp Ŭ����
	 * 				// �����[�Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����]
	 */
	public static void main(String[] args) {//main start
		Scanner scanner =new Scanner(System.in); //1.�Է°�ü
		Controller.load()	;
//		System.out.println("Ȯ��"+Controller.boardlist);
		
		while(true) {
			try { // ���� �߻� : ������ �����Է� �� ���� �߻� => catch�� �̵�
				//��� �Խù� ���
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				int i =0; // ����Ʈ �� �ε���
				for(Board board :Controller.boardlist) {
					System.out.printf("%s\t%s\t%s\t%s\t%s\t \n",i+1,board.getTitle(),board.getWritter(),
							board.getDate(),board.getViewcount());
					i++;
				}
//				Controller.boardlist(); // ��ü �޼ҵ� ȣ�� �Ǵ� ���� : static �޼ҵ�� ����
				System.out.println("1.���� 2.���� ���� : "); 
				int ch = scanner.nextInt();
				if (ch==1) {
					System.out.println("*** �Խù� ��� ***");
					//nextLine() : �������� �Է°��� [����! : nextLine �տ�  next �ϳ��� ��� ]
					// �ذ��� : �߰��� �Ϲ� next �� nextLine ���̿� nextLine() �ϳ� �߰�
					scanner.nextLine();//line 28+line 33 ����
					System.out.print(" ���� : "); String ���� = scanner.nextLine();
					System.out.print(" ���� : "); String ���� = scanner.nextLine();
					System.out.print(" �ۼ��� : "); String �ۼ��� = scanner.next();
					System.out.print(" ��й�ȣ[����/������] : "); String ��й�ȣ = scanner.next();
					Controller.write(����,����,�ۼ���,��й�ȣ); // �μ�����
				}
				else if (ch==2) {
					// 
					// �ش� �Խù� ��ȣ[�ε��� ] �� �Է¹޾� �Խù� ���� ��� ���
					System.out.println("�Խù� ���� ");
					System.out.print( "���� :> "); int select = scanner.nextInt();
					int index = select-1;
					Board temp = Controller.boardlist.get(index); //�ش� �ε����� ��ü�� �ӽ� ��ü [ �ڵ� ���̱� ]
					System.out.println(" *** �Խù� ���� *** ");
					System.out.println(" ���� : "+temp.getTitle());
					System.out.println(" �ۼ��� : "+temp.getWritter()+" �ۼ���  :"+temp.getDate()+" ��ȸ�� : "+temp.getViewcount());
					System.out.println(" ���� :"+temp.getContents());
					// ��� ��� [����]
					// �޴�
					System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾��� | ����: "); int ch2 = scanner.nextInt();
					if(ch2 ==1) { }
					else if(ch2 ==2) {
						System.out.print("�� �Խù� ��� ��ȣ :"); String password = scanner.next();
						scanner.nextLine();
						System.out.print("������ ���� : "); String title = scanner.nextLine();
						System.out.print("������ ���� : "); String contents = scanner.nextLine();
						Controller.update(index,password,title,contents); //������ �ε��� ��ȣ,�н�����,  ������ ����, ������ ���� => �μ�
						boolean result =Controller.update(index, password, title, contents);
						if(result) System.err.print("�˸�) ��������");
						else System.err.println("�˸�)���� ����");
					}
					else if(ch2 ==3) {
						
						System.out.print("�� �Խù� ��� ��ȣ :  "); String password=scanner.next();
						
						Controller.delete(index, password); //������ �ε��� ��ȣ,�н����� => �μ�
						boolean result = Controller.delete(index, password);
						if(result ==true ) {System.out.println("���� ����");}
						else { System.out.println(" ���� ����) �н����尡 �ٸ��ϴ�.");
						}
					}
						
					else if(ch2 ==4) {
						Controller.replywrite(); // �ε��� ��ȣ, ��۳���, ����н�����, ��� �ۼ��� => ����
					}
					else {}
				}
				else {}
				
			}catch(Exception e) {
			System.err.println(" �˸�) ��ȣ�� �Է��� �ּ���");
			scanner = new Scanner(System.in); // �ٽ� �޸� �Ҵ� [ ���� ���빰 ���� ]
			//�ٽ� �޸� �Ҵ� ���� while �ȿ� �־� ���
		}
			
		
		}// while end
		
	}//main end
}// class end
