package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_06 {//cs
	//�ֱ����ġ : �޸�(RAM) - ���α׷� ����ÿ��� ���� �޸�
	// ���������ġ : HDD,USB,CD : (���α׷�)���� [��������]
	// ����ó�� [  �ڹ� �� �޸𸮸� --> ���������ġ]
	// DB ó��[ �ڹ� �� �޸� => DB ����[PC]	]
		// ��Ʈ��(Stream) : ���α׷��� �ܺ�[Ű����,����,��Ʈ��ũ ��] ���
			// ��� ���� : byte ����
		//  FileOutputStream : ���� ��� Ŭ����
			// ��ü��.write( ����Ʈ�� );
		// FileInputStream :���� �Է� Ŭ����
			// ��ü��.read( ����Ʈ�迭) ;
		// String Ŭ����
			// ���ڿ�.equals() : ���ڿ� �� �޼ҵ�
			// ���ڿ�.getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
			// new String( ����Ʈ�迭 ) : ����Ʈ�迭 -> ���ڿ� ��ȯ
	public static void main(String[] args) throws IOException {//ms
		


//		1.���� ��� [���� -> �ڹ�]
		FileOutputStream ������� = new FileOutputStream("D:/JAVA/java1.txt");
//		FileOutputStream : ���� ��� Ŭ����
//		FileOutputStream(���ϰ��/���ϸ�.Ȯ����);//txt : �޸���
		String ���� = "�ڹٿ��� �Էµ� ������";
		�������.write(����.getBytes()); // ����[����] :
		
		// 2. ���� �Է� [�ڹ� -> ����]
		FileInputStream �����Է� = new FileInputStream("D:/JAVA/java1.txt");
		byte[] bytes = new byte[101];
		�����Է�.read(bytes);
		System.out.println("���ϳ��� : " +new String(bytes));
	}//me
}//ce
