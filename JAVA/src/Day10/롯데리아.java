package Day10;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class �Ե����� extends ����{
	// 1. �ʵ�
	private String ����;
	private ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
	// 2. ������
	public �Ե�����() {
//		��ǰ ��ǰ = new ��ǰ("�������", 10,1000);
//		��ǰ ��ǰ2 = new ��ǰ("�Ұ�����", 10,2000);
//		��ǰ����Ʈ.add(��ǰ); ��ǰ����Ʈ.add(��ǰ2);
	}
	
	
	public �Ե�����(String ����, ArrayList<��ǰ> ��ǰ����Ʈ) {
		super();
		this.���� = ����;
		this.��ǰ����Ʈ = ��ǰ����Ʈ;
	}


	// 3. �޼ҵ�
	@Override
	public void ��ǰ���() {
		System.out.println(" *** �Ե����� ��ǰ ��� *** ");
		int i =1;
		for ( ��ǰ temp:��ǰ����Ʈ) {
			System.out.print(i+"."+temp.get��ǰ��()+"("+temp.get����()+")  ");
			i++;
		}
		System.out.println();
	}
	@Override
	public void ��ǰ�߰�() {
		// 1. �Է�
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** �Ե����� ��ǰ �߰� ***");
		System.out.print(" ��ǰ�� : "); String ��ǰ�� = scanner.next();
		System.out.print(" ��� : "); int ��� = scanner.nextInt();
		System.out.print(" ���� : "); int ���� = scanner.nextInt();
		//2 ��ü [ ���� ���� -> �ϳ� ��ü]
		��ǰ ��ǰ = new ��ǰ(��ǰ��, ���, ����);
		//3. ����Ʈ�� ����
		��ǰ����Ʈ.add(��ǰ);
		//4. ����ó��
		try { // ����[����]�� �߻��Ұ� ���� �ڵ� ����				// ���ϰ�� , �̾��=true[�ɼ�] 
			FileOutputStream outputStream = new FileOutputStream("D:/JAVA/�Ե��������.txt",true);
			
			String �������� = ��ǰ��+","+���+","+����+"\n"; // , : �ʵ� ���п� \n : ��ǰ ���п�
			outputStream.write(��������.getBytes()); // ���ڿ� -> ����Ʈ��
		}catch(Exception e ) { //����[����] ó��[���] : Exception Ŭ���� = ���� Ŭ����
			
		}
		System.out.println("�˸�)) ��ǰ���� �Ϸ�");
		
		
		
		
	}
}
