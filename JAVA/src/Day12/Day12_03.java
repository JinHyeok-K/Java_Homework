package Day12;

import java.io.IOException;

public class Day12_03 {
	
	public static void main(String[] args) throws IOException {
	
		// ���� �˻� ���α׷�
			// [����]
			// 1. �Է� �ޱ� [ System.in.read() ]
			// 2. String �迭 �� ���� ������ ����
				// String[] ������� ={
				//			"�ȴ�! ���̹� ��α�&����Ʈ "
				//			"������ ��Ʈ ���� Ȱ�� ������"
				// 			"Tucker �� Go ��� ���α׷���"
				//			"ȥ�� �����ϴ� C ��� "
				// 1. 
			// 3. �˻����, �������
				// �˻���� : Ư�� ���ڸ� �Է¹޾� ���� �� ���Ե� ���ڰ� ������ ��� ���
					// ����) ��� �˻� -> " Tucker �� Go ��� ���α׷��� " / "ȥ�� �����ϴ� C ��� "
				// ������� : ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ������ ������� ����
					// ����) '���' �� Language �Է� -> ���õ� �������� ������ ���ڿ� ���ο� ���� �Է¹޾� ->  ���� �Ϸ� 
					// ȥ�� �����ϴ� C ��� ->  ȥ�� �����ϴ� C Language 
		/*
		 *  [ ][ ][ ][ ][ ][ ]
		 *  [ ][ ][ ][ ][ ][ ]
		 *  [ ][ ][ ][ ][ ][ ]		
		 * 	[ ][ ][ ][ ][ ][ ]
		 * 	[ ][ ][ ][ ][ ][ ]
		 *  [ ][ ][ ][ ][ ][ ] 
		 * 
		 * 
		 * 
		 */
//		String[] ������� = new String[4];
//		�������[0] = "�ȴ�! ���̹� ��α�&����Ʈ ";    �������[1] = "������ ��Ʈ ���� Ȱ�� ������";
//		�������[2] = "Tucker �� Go ��� ���α׷���";	�������[3] =	"ȥ�� �����ϴ� C ��� ";
//		
		String[] ������� = {"�ȴ�! ���̹� ��α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������",
							"Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C���"};
		
		while(true) {
			System.out.println("1. �˻� 2. ����");
			byte[] bytes = new byte[100];
			int count = System.in.read(bytes); // Ű����κ��� [��Ʈ��]����Ʈ�� �о���� // �Ϲ� ���� [���� �� �ѱ��]
			// count ���� : �о�� ����Ʈ ����
			String ch = new String(bytes,0,count-2); // ����Ʈ �迭 --> ���ڿ� ��ȯ [ -2���� =\n\r ]
			
			if( ch.equals("1")) {
				System.out.println(" *** �˻� *** ");
				System.out.println(" �˻� : "); count = System.in.read(bytes);
				String search = new String(bytes,0,count-2); // ã�� ����
				
				
				System.out.println(" *** �˻� ��� *** ");
				for ( String temp : �������) { // ��� �迭 �� ���ڿ��� �ϳ��� ��������
					/*��� 1
					if(temp.indexOf(search)!= -1) { // �ش� ���ڿ� �� ã�� ������ �ε����� �����ϸ�
						// indexOf �޼ҵ� -1 ��ȯ�Ǵ� ���� ������ �ܾ ���� ��� [�˻� x]
						System.out.println(temp); //�ش� ���ڿ� �� ã�� ���ڰ� �����ϸ� ���
						
					}*/
					//��� 2
					if(temp.contains(search)) {
						// ���ڿ�.contains("ã������") : ���ڿ� �� ã�� ���ڰ� true[�ִ�] / false[����] ��ȯ
						System.out.println(temp);
					}
					
				}
				
				
				
				
				
				
				
			}else if(ch.equals("2")) {
				System.out.println(" *** ���� ***");
				System.out.println("������ ������ [�Ϻ�] : ");
				count = System.in.read(bytes); // Ű����κ��� ����Ʈ �о�ͼ� �迭�� ����
				String search = new String(bytes,0,count-2); // 0�� �ε��� ����Ʈ�κ��� -2 ������ �ε��� ����
				int i =0 ;
				for (String temp : �������) {
					
					if(temp.contains(search)) {
						// ���ڿ�.contains("ã������") : ���ڿ� �� ã�� ���ڰ� true[�ִ�] / false[����] ��ȯ
						System.out.println("������ȣ : "+i+" ����� : "+temp);
					}
					i++;
				}
				System.out.println("������ȣ ���� : ");
					count = System.in.read(bytes);
				String ch2 =new String (bytes,0,count -2);
				//ch2 ���ڿ��� �Է� ���� --> �ε��� [���� ] ��ȯ
					int index =Integer.parseInt(ch2);
				 
				//	���� ���� �Է¹ޱ�
				System.out.println("���� ���� :");
					count =System.in.read(bytes);
					String oldstr =new String(bytes,0,count-2);
				System.out.println("���ο� ����:");
					count =System.in.read(bytes);
					String newstr =new String(bytes,0,count-2);
				//����ó��
				�������[index] = �������[index].replace(oldstr, newstr);
				// �迭 �� ������ = ������ ������
				System.out.println("���� �Ǿ����ϴ�.");
				
			}
			
			
			
		}
		
		
	}
}
