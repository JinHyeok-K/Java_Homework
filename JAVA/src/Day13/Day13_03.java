package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_03 {
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� : "); int year = scanner.nextInt();
		System.out.print("�� : "); int month = scanner.nextInt();
		
		�޷�(year,month);
		} catch(Exception e){
			
		}
	}
	
	
	// 1. �޷� �޼ҵ�
	public static void �޷�(int year,int month) {
		while(true) {
			try {
			// 1. Ķ���� Ŭ���� �� ���� ��¥ /�ð� ��ü ȣ��
			Calendar calendar = Calendar.getInstance();
			// 2. ����, ��, ��
	//		int year = calendar.get(calendar.YEAR);
	//		int month = calendar.get(calendar.MONTH)+1;
			int day = calendar.get( Calendar.DAY_OF_MONTH );
			// * �ش� ���� 1���� ���� ã��
				// 1. ����� ���� Ķ���� ����
				calendar.set(year, month-1,1);
				// 2. 3�� 1���� ����
				int sweek =  calendar.get(Calendar.DAY_OF_WEEK);
				// 3. 3���� ��������
				int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			// 3. ���
			System.out.println(" **** "+year+"��"+ month + "�� **** ");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			// * ���� �� 1���� ��ġ �տ� ���� ä���
			for(int i = 1; i<sweek ; i++) {
							// 3�� 1�� = ȭ  =3
				System.out.print("\t"); // i =�� ���
			}
			// 1�Ϻ��� ������ ��¥ ���� ���
			for(int i = 1;i<=eday;i++) {
				
	//			//���࿡ ���� üũ
	//			if(i==day) System.err.print(i+"*\t");
	//			else System.out.print(i+"\t");
	//			
				System.out.print(i+"\t");
				//  ����� ���� �ٹٲ� ó�� [ ����� = 7 ] ������ 7�������
				if(sweek %7==0) System.out.println();
					//7���
				sweek++;
			}
			
		// ��ư [1. ������  2.������ 3 �ٽð˻�]
			System.out.println("\n\sn");
			System.out.print("\t1.��(������) 2.��(������) 3.��ٽð˻� 4.���� : "); 
			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();
			if (select ==1 ) {
				 month=month-1;
				 if(month == 0) { year -=1; month =12;}
			}else if(select ==2 ) {
				 month=month+1;
				 if( month ==13 ) { year +=1; month=1;}
			}else if(select == 3) {
				System.out.print("���� : ");  year=scanner.nextInt();
				System.out.print("dnjf : "); month=scanner.nextInt();
			}else if(select == 4){
				System.out.println("����");
				break; // �޼ҵ� ����
				
			}else {System.out.println("�߸��� �Է�");}
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("���� �߻�");
			}
			
		
			
		}	
	}//�޷� �޼ҵ� end
	
	
}
