package part2_06_09_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ����������α׷�1 {
	// ����������α׷� [ ��� ] 
			// ����[super]
			// ��������[sub] , ��������[sub] , �ϳ�����[sub]
			// �� ��� : 1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.���� 
		
	// ** main �ۿ��� �����ϴ� ���� 
		//* ��� Ŭ�������� ����ϱ� ���� static �迭�� ����
		// static������ ���α׷� ���۽� �޸��Ҵ� -> ���α׷� ����� �޸��ʱ�ȭ
	
	public static ArrayList<�ѱ�����1> ���¸���Ʈ = new ArrayList<>();
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			������Ʈ�ѷ�1 ������Ʈ�ѷ� = new ������Ʈ�ѷ�1();
			System.out.println("========== ���� �޴� ===========");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.����"); int ch = scanner.nextInt();
			
			if(ch==1) {
				
				System.out.println("����"); String name = scanner.next();
				System.out.println("��й�ȣ"); String password = scanner.next();
				System.out.println("��� ����?");
				System.out.println("1. �������� 2. �׽�����"); int chbank= scanner.nextInt();
				
				
				������Ʈ�ѷ�.���»���(name, password, chbank);
				
				
				
				
				
				
				
				
			}
				
			
			
			
			
			
			
		
			
			
		}
	}
}
