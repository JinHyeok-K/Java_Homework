package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_07_Ű����ũ {
	// ��� : ���� Super class
	// Ŭ���� : �Ե����� ,����ŷ
	// �������̽� : �������̽�(Ű����ũ)
	// ����ó�� : ��ǰ ��� ����
	public static void main(String[] args) {
		
		
		
		Scanner scanner =new Scanner(System.in); // �Է°�ü
		ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
		// * ���� �Է�
		// 1. ���� �Է� ��ü
		try {// try {} �ȿ� ����[����] �߻��Ұ� ���� �ڵ� �ֱ� (����)
			FileInputStream inputStream = new FileInputStream("D:/JAVA/�Ե��������.txt");
		// 2. ���� �о���� [ ���� ==> ��Ʈ��(����Ʈ��) ==> �ڹ�]
			// 1. ����Ʈ�迭 ����
			byte[] bytes = new byte[1024]; // bit -> byte -> kb->mb->gb
			// 2. �о�ͼ� �迭�� ���� 
			inputStream.read(bytes);
			// 3. �о�� �迭 ����(�й�) [ , : �ʵ屸�� \n : ��ü(��ǰ) ���� ]
			String ���ϳ��� = new String (bytes); // ����Ʈ�� = > ���ڿ�
				// String ���� �޼ҵ�  split("����") ;
			String[] ��ǰ��� = ���ϳ���.split("\n");
			
			
			for(String temp : ��ǰ���) {
				String[] �ʵ��� = temp.split(",");
				��ǰ ��ǰ = new ��ǰ(�ʵ���[0],
						Integer.parseInt(�ʵ���[1]),
						Integer.parseInt(�ʵ���[2]));
						// ������ --> ������ ��ȯ [ Integer.parseInt("���ڿ�)] // ����&���� ������
				��ǰ����Ʈ.add(��ǰ);
			}
				
		}catch(Exception e) { // catch : ���� ��� -> Exception class�� ��ü�� ����
			
		}
		Ű����ũ �Ե����� = new �Ե�����("���", ��ǰ����Ʈ); // �Ե����� Ű����ũ ����
		while(true) {
			
			�Ե�����.��ǰ���();
			int ch = scanner.nextInt();
			if (ch ==-1 ) {
				�Ե�����.��ǰ�߰�();
			}else  {
				�Ե�����.��ٱ���();
			}
			
			
			
			
			
		}
	}
}
