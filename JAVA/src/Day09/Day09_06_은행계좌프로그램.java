package Day09;
/* 
 * 	�ٸ� Ŭ���� �� ��� ȣ���ϴ� ���
 * 		1. ��ü ����[new] �ؼ� �޼ҵ� ȣ��
 * 		2. static �޼ҵ�
 */
import java.util.Scanner;

//����������α׷�(V) < - > ������Ʈ�ѷ�(C) < - > ����(M) 
public class Day09_06_����������α׷� { // ��,���
	// ����������α׷� [���]
		// ����[super]
		// ��������[sub], ��������[sub], �ϳ�����[sub]
		// �� ��� : 1. ���»��� 2. �Ա� 3. ��� 4.��ü 5.�����¸�� 6.����
	//& ** Main �ۿ��� �����ϴ� ����
		// * ��� Ŭ���� ���� ����ϱ� ���� static �迭�� ��ȯ
		// static ������ ���α׷� ���� �� �޸� �Ҵ� -> ���α׷� ����� �޸� 

	public static ����[] ���¸���Ʈ = new ����[100];
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { // ���α׷� ���ѷ��� [�������� X]
			
			System.out.println("-------- ���� �ý��� ---------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���¸�� 6.���� | ���� >: ");
			int ���� = scanner.nextInt();

			������Ʈ�ѷ� ��Ʈ�� = new ������Ʈ�ѷ�(); 	// ��Ʈ�ѷ� �޼ҵ� ȣ��� ��ü
			if (����==1) {
				System.out.println("+++ ���µ�� ������ +++");
				System.out.println("��й�ȣ : "); 	String ��й�ȣ = scanner.next();
				System.out.println("������ : ");		String ������ = scanner.next();
				System.out.println("���༱�� : 1.���� 2.���� 3.�ϳ� | ���� >: ");
					int �����ȣ = scanner.nextInt();
					//��Ʈ�ѷ� ����
					
				String ���¹�ȣ = ��Ʈ��.���»���(��й�ȣ, ������, �����ȣ); // �޼ҵ� ȣ��[�μ�3��]
				// �޼ҵ� ��ȯ ���� = ���¹�ȣ or null ��ȯ
				// �޼ҵ� ���� �� �޽��� ���
				if(���¹�ȣ!=null) { // result �� true�̸�
					System.out.println("*** ���� ����***");
					System.out.println("������ ���¹�ȣ�� : "+���¹�ȣ);
				}else { //result�� false�̸� 
					System.err.println("�˸�) ���µ�� ���� (�����ڿ��� ����)");
				}
				//	
			}
			else if (����==2) {
				System.out.println("+++ �Ա� ������ +++");
				System.out.println(" ���¹�ȣ : " ); String ���¹�ȣ =scanner.next();
				System.out.println(" �Աݾ� : " ); int �Աݾ� =scanner.nextInt();
				boolean result = ��Ʈ��.�Ա�(���¹�ȣ,�Աݾ�);
				if (result == true) {
					System.out.println(" �˸�)) �Ա� ����");
				}else {
					System.err.println(" �˸�)) �Ա� ���� (������ ���°� �����ϴ�)");
				}
			}
			else if (����==3) {
				System.out.println("+++ ��� ������ +++");
				System.out.println(" ���¹�ȣ : "); String ���¹�ȣ =scanner.next();
				System.out.println(" ��й�ȣ : "); String ��й�ȣ =scanner.next();
				System.out.println(" ��ݾ� : ");   int ��ݾ� = scanner.nextInt();
				
				int result = ��Ʈ��.���(���¹�ȣ,��й�ȣ,��ݾ�);
				
				if(result ==1 ) {
					System.out.println("** �ܾ� ���� **");
				}else if(result ==2) {
					System.out.println("** ��� ���� **");					
				}else if(result ==3) {
					System.out.println("** �ùٸ� ������ �ƴմϴ�. **");
				}
				
				
			}
			else if (����==4) {
				System.out.println("+++ ��ü ������ +++");
				
				System.out.println("������ �� ���� : "); 	String ���¹�ȣ =scanner.next();
				System.out.println("��� ��ȣ "); 			String ��й�ȣ =scanner.next();
				System.out.println("��ü�Ͻ� �ݾ� : ");	 int ��ü�ݾ� =scanner.nextInt();
				System.out.println("�����ô� �� ���� : "); String �޴°��� =scanner.next();
				
				int result =��Ʈ��.��ü(���¹�ȣ, ��й�ȣ, ��ü�ݾ�,  �޴°���);
				if(result ==1) {
					System.out.println("�ܾ� ����");
				}else if(result ==2) {
					System.out.println("��ü ����");
				}else if(result ==3) {
					System.out.println("�޴� ���� ������ �����ϴ�.");
				}else if(result ==4) {
					System.out.println("������ ���� ������ �����ϴ�.");
				}
				
			}
			else if (����==5) {
				System.out.println("+++ ���¸�� ������ +++");
				System.out.println(" ������ : "); String ������ = scanner.next();
				����[] �����¸�� =��Ʈ��.���¸��(������);
				
				System.out.println(" *** �˻��� ������ ���� ���� ���");
				int i = 1;
				for(���� temp:�����¸��) {
					if(temp!=null)
					System.out.println(i+"��| ���¹�ȣ : "+temp.get���¹�ȣ() );
					i++;
				}
				
			}
			else if (����==6) {
				System.out.println("+++ ���� ������ +++");
			}
			else {
				System.err.println("�˼����� �Է��Դϴ�.");
			}
			
			
			
		}// while ���α׷� end
	
		
	} // main end
}//class end
