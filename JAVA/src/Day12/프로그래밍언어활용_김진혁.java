package Day12;

import java.util.Scanner;

public class ���α׷��־��Ȱ��_������ { // class start
	
	public static void main(String[] args) { //main start
		// ���� �迭 ����
		�л�[] �л���� = new �л�[100];
		int[] ���� = new int[�л����.length];
		//�Է°�ü start
		Scanner scanner = new Scanner(System.in);
		
		 
		
		while(true) {
			try {
				System.out.println("------------------------------------------------------------------");
				System.out.println("\t\t\t ����ǥ \t\t\t");
				System.out.println("------------------------------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("------------------------------------------------------------------");
				//���� �ʱ�ȭ
				for (int i = 0 ; i<�л����.length;i++) {
					����[i] = 1; // 1�� �ʱ�ȭ
				}
				
				for(int i = 0 ; i<�л����.length-1;i++) {
					for(int j =i+1;j<�л����.length;j++) {

						if(�л����[j]!=null&& �л����[i].get���() < �л����[j].get���()) {
							����[i]++;
						}
						else if(�л����[j]!=null&& �л����[i].get���() > �л����[j].get���()) {
							����[j]++;
						}
					}
				}
				
				// �ԷµȰ� ��� ��ħ 
				for (int i=0;i<�л����.length;i++) {
					if(�л����[i]!=null) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							(i+1),�л����[i].get�̸�(),�л����[i].get����(),�л����[i].get����(),
							�л����[i].get����(),�л����[i].get����(),�л����[i].get���(),����[i]);
					}
					
				}
				// �ʱ� ���ø޴� ����
				System.out.println("------------------------------------------------------------------");
				System.out.println("�޴� : 1. �л����� ��� 2. �л����� ����"); 
				System.out.println("���� : >");
				int ���� = scanner.nextInt();
				
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
					int ���� = ����+����+����;
					double ��� = ����/3.0;
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
				}else if(���� == 2) {
					System.out.println("---------------------------------");
					System.out.println(" ���� �޴�");
					System.out.println("���� �� �л��� ��ȣ�� �Է��� �ּ���"); int ���� =scanner.nextInt();
					�л����[����-1] = null; //�Է¹��� ���� index null ó��
					int i =����-1; // �ε��� �����
					for(int j=i;j<�л����.length;j++) {
						if(j==�л����.length-1) {
							�л����[�л����.length-1]=null;
							break;
						}
						�л����[j] = �л����[j+1];
					}
				}else {
					System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
				} //else end
			}catch(Exception e) {  // try~ catch
			System.out.println("���� �߻� ó������ ���ư��ϴ�.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}// try ~ catch end
		}// while end
	}//main end
}// class end