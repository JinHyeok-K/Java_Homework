package test1;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		�л�[] �л���� = new �л�[100];
		int[] ���� = new int[�л����.length];
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ\t\t\t");
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("-------------------------------------------------------------------------");
				for(int i=0; i<����.length;i++) {	// ���� ���� �迭 �ʱ�ȭ
					����[i]=1;
				}
				
				
				
				for(int i=0;i<�л����.length-1;i++) {
					for(int j=i+1;j<�л����.length;j++) {
						if(�л����[j]!=null&&�л����[i].get���() < �л����[j].get���()) {
							����[i]++;
						}
						else if(�л����[j]!=null&&�л����[i].get���() > �л����[j].get���()) {
							����[j]++;
						}
					}
				} 
				
				for(int i =0; i<�л����.length;i++) {
					if (�л����[i]!=null){
						System.out.printf("%d\t%3s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
								(i+1),�л����[i].get�̸�(),�л����[i].get����(),�л����[i].get����(),
								�л����[i].get����(),�л����[i].get����(),�л����[i].get���(),����[i]);
					}
					
				}
				System.out.println("1. �л����� ��� 2. �л����� ���� "); int ���� = scanner.nextInt();
				if (���� ==1 ) {
					System.out.print("�̸� :"); String �̸�=scanner.next();
					System.out.print("�������� :"); int ����=scanner.nextInt();
					System.out.print("�������� :"); int ����=scanner.nextInt();
					System.out.print("�������� :"); int ����=scanner.nextInt();
					
					
					int ���� = ����+����+���� ;
					double ��� =����/3.0;
					
					boolean check= true;
					
					if(����<=-1 || ����>=101 ||����<=-1 || ����>=101||����<=-1 || ����>=101) {
						System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
						check=false;
					}
					
					if(check==true) {
						�л� �л��� = new �л�(�̸�,����,����,����,����,���,0);
					
						int i = 0;
						for(�л� temp1:�л����) {
							if(temp1==null) {
								�л����[i] =�л���;
								break;
							}i++;
						}
					}
				}
				else if (���� ==2 ) {
					System.out.println("�л� ���� ����");
					System.out.print("������ �л��� ��ȣ�� �Է� >");
					int ����= scanner.nextInt();
					System.out.println(����+"�� �л��� ������ �����մϴ�.");
					�л����[����-1] = null;
					int i =����-1;
					for(int k=i;k<�л����.length;k++) {	// �� �ε��� ����� �ݺ���
						if(k==�л����.length-1) {
							�л����[�л����.length-1]=null;
	//						System.out.println("������ ���� ����");
							System.out.println(�л����.length);
							break;
						}
						�л����[k]=�л����[k+1];
					}
				
				}
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			}
			catch(Exception e) {
			System.out.println("�Է¿���. �ʱ� �޴��� ���ư��ϴ�.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
		
			
			
		}//while end	
	}// main end
}// class end
