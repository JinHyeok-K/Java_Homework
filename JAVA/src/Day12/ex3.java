package Day12;

import java.util.Scanner;



public class ex3 {
	
	public static void main(String[] args) {
		// ���� �迭 ����
		�л�[] �л���� = new �л�[100];
		int[] ���� = new int[�л����.length];
		//�Է°�ü start
		Scanner scanner = new Scanner(System.in);
		
		 
		
		while(true) {
			try {
				System.out.println("---------------------------------");
				System.out.println("\t\t\t ����ǥ \t\t\t");
				System.out.println("---------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("---------------------------------\n");
				//���� �ʱ�ȭ
				for (int i = 0 ; i<�л����.length;i++) {
					����[i] = 1; // 1�� �ʱ�ȭ
				}
				
				for(int i = 0 ; i<�л����.length-1;i++) {
					for(int j =i+1;i<�л����.length;i++) {
						if(�л����[j]!=null&& �л����[i].get���() < �л����[j].get���()) {
							����[i]++;
						}else if(�л����[j]!=null&& �л����[i].get���() > �л����[j].get���()) {
							����[j]++;
						}
					}
				}
				
				// �ԷµȰ� ��� ��ħ 
				for (int i=0;i<�л����.length;i++) {
					if(�л����[i]!=null) {
//									 
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
							(i+1),�л����[i].get�̸�(),�л����[i].get����(),�л����[i].get����(),
							�л����[i].get����(),�л����[i].get����(),�л����[i].get���(),����[i]);
					}
					
				}
				// �ʱ� ���ø޴� ����
				
				System.out.print("�޴�: 1. �л����� ��� 2. �л����� ����"); int ���� = scanner.nextInt();
				
				// if ����
				
				if(���� == 1) {
					System.out.println(" �л� ���� ��� ����  ");
					System.out.print(" �̸� : "); String �̸�=scanner.next();
					System.out.print(" ���� : "); int ����=scanner.nextInt();
					System.out.print(" ���� : "); int ����=scanner.nextInt();
					System.out.print(" ���� : "); int ����=scanner.nextInt();
					
					boolean check = true;
					if( ����<=-1 || ���� >=101 ||����<=-1 || ���� >=101 ||����<=-1 || ���� >=101 ) {
						System.out.println("�߸��� ������ �Է��Ͽ����ϴ�.");
						check=false;
					}
						if(check==true) {
						int ���� = ����+����+����;
						double ��� = ����/3.0;
						
						// �л� class ����
						
						if(check==true) {
							�л� �л���= new �л�(�̸�,����,����,����,����,���,0);
							int i =0;
							for (�л� temp:�л����) {
								if(temp==null) {
									�л����[i] = �л���;	
									break;
								}
								i++;
					     	}
						}
				
					
					}
				}//else if(���� == 2) {
					
				//}
						
				
		
		
			}catch(Exception e) {
			System.out.println("���� �߻� ó������ ���ư��ϴ�.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
		}
	}
}
