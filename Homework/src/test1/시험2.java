package test1;

import java.util.Scanner;

public class ����2 {
	public static void main(String[] args) {
//		1. ����ǥ�� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//		2. �޴����� 1�� ���ý� �л������� �߰� �մϴ�. [ 5�� ]
//		3. �޴����� 2�� ���ý� �л������� ���� �մϴ�. [ 5�� ]
//		4. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ�. [ 5�� ]
//		5. ���� �Է��� 5������ �ϵ�, �ִ� 100�� �� �����ϵ��� �ۼ��մϴ�. [ 5�� ]
//		6. ��ȣ �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�. [ 5�� ]
//		7. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�. [ 5�� ]
//		8. ������ �̿��Ͽ� ������ ���մϴ�. [ 5�� ]
//		9. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]

		Scanner scanner= new Scanner(System.in);
		�л�[] �л����= new �л�[100];
		int[] ���� = new int[�л����.length];
		//�迭 ���� ����
		while(true) {
			try {
				//�⺻ ��ħ ���
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ\t\t\t");
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("-------------------------------------------------------------------------");

				for(int i =0 ;i<�л����.length;i++) {
					����[i]=1; // 1�� ������ �ʱ�ȭ
				}
				
				//���� ����
				for(int i = 0 ; i<�л����.length-1;i++) {
					for(int j=i+1;j<�л����.length;j++) {
						if(�л����[j]!=null&& �л����[i].get���() < �л����[j].get���()) {
							����[i]++;
						}
						else if(�л����[j]!=null&& �л����[i].get���() < �л����[j].get���()) {
							����[j]++;
						}
					}
				}
				for (int i=0;i<�л����.length;i++) {
					if(�л����[i]!=null) {
//									 
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
							(i+1),�л����[i].get�̸�(),�л����[i].get����(),�л����[i].get����(),
							�л����[i].get����(),�л����[i].get����(),�л����[i].get���(),����[i]);
					}
					
				}
				System.out.println("1.�л� ���� �Է� 2. �л� ����"); int ���� = scanner.nextInt();
				if(����==1) {
				
					System.out.print("�̸� :"); String �̸�= scanner.next();
					System.out.print("���� :"); int ����= scanner.nextInt();
					System.out.print("���� :"); int ����= scanner.nextInt();
					System.out.print("���� :"); int ����= scanner.nextInt();
					
					int ���� = ����+����+����;
					double ��� = ����/3.0;
					boolean check =true;
					if ( ����<=-1 || ���� >=101 ||����<=-1 ||����>=101||����<=-1 || ���� >=101) {
						System.out.println("�Էµ� ������ �߸��Ǿ����ϴ�.");
						check=false;
					}
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
				else if(����==2) {
					System.out.println(" �Էµ� �л��� ������ �����մϴ�");
					System.out.print("������ �л��� ��ȣ�� �Է� �� �ּ���"); int ����=scanner.nextInt();
					System.out.println(" ������ ������ �����մϴ�");
					
					�л����[����-1]= null;									
					int i =����-1;
					for(int j=i;j<�л����.length;j++) {
						if(j==�л����.length-1) {
							�л����[�л����.length-1]=null;
							
							break;
						}
						�л����[j] = �л����[j+1];
					}
					
				}
				else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			catch(Exception e) {
			System.out.println("���� �߻� ó������ ���ư��ϴ�.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
			
			
			
			
			
			
			
		}//
//			catch(Exception e) {
//				System.out.println("�Է¿���. �ʱ� �޴��� ���ư��ϴ�.");
//				System.out.println(e);
//				scanner = new Scanner(System.in);
//		}
		
		
		
	}//���� end
}//class end
