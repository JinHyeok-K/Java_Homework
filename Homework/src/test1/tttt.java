package test1;

import java.util.Scanner;

public class tttt {
	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		
		
		Student[] student = new Student[100];
		int[] rank = new int[10];
		
		
		
		while(true) {
			try {
				
				
				
				
				
				
				
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ\t\t\t");
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("-------------------------------------------------------------------------");
				for(int i=0; i<rank.length;i++) {	// ���� ���� �迭 �ʱ�ȭ
					rank[i]=1;
//					System.out.println(rank[i]);
				}
				for(int i=0; i<student.length-1;i++) {
					for(int j=i+1;j<student.length;j++) {
						if(student[j]!=null && student[i].getAvg() < student[j].getAvg()){
							rank[i]++;
						}
						else if(student[j]!=null && student[i].getAvg() > student[j].getAvg()){
							rank[j]++;
						}
					}
				}
				
				for(int i=0;i<student.length;i++) {
					if(student[i]!=null) {
						System.out.printf("%d\t%3s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",student[i].getNum(),student[i].getName(),
							student[i].getKor(),student[i].getEng(),student[i].getMath(), student[i].getSum(), student[i].getAvg(),rank[i]);
						
					}
				}
				
				
				
				
//				int j=0;
//				for(Student tmp : student) {
//					
//					if(tmp!=null) {
//						System.out.printf("%d\t%3s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",tmp.getNum(),tmp.getName(),
//								tmp.getKor(),tmp.getEng(),tmp.getMath(), tmp.getSum(), tmp.getAvg(),rank[j]);
//					}
//					
//					j++;
//				}
				
				System.out.print("1. ���� �߰� | 2. ���� ���� \n ���� >");
				int ch = scanner.nextInt();
				if(ch==1) {
					boolean isPointIsRight=true;
					System.out.println("========== �л� ���� �߰� �Ŵ� ==========");
					System.out.print("��ȣ �Է� : ");
					int num=scanner.nextInt();
					System.out.print("�̸� �Է� : ");
					String name=scanner.next();
					System.out.print("�������� �Է� : ");
					int kor=scanner.nextInt();
					System.out.print("�������� �Է� : ");
					int eng=scanner.nextInt();
					System.out.print("�������� �Է� : ");
					int math=scanner.nextInt();
					int sum= kor+eng+math;
					double avg = (kor+eng+math)/3.0;
					if(kor<1 || kor>100 || eng<1 || eng>100 || math<1 || math>100) {
						System.out.println("������ �߸� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���.");
						isPointIsRight=false;
					}
					if(isPointIsRight == true) {
						Student newStudent = new Student(name, num, kor, eng, math, sum, avg, 0);
						int i=0;
						for(Student tmp2 : student) {
							if(tmp2==null) {
								student[i]=newStudent;
								break;
							}
							i++;
						}
					}
				}
				else if(ch==2) {
					System.out.println("========== �л� ���� ���� �Ŵ� ==========");
					System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >");
					int ch2 = scanner.nextInt();
					int i=0;	// �ε��� ī��Ʈ
					for(Student tmp : student) {
						if( tmp!=null && tmp.getNum()==ch2 ) {
							System.out.println(ch2+" �� �л��� �����մϴ�.");
							student[i]=null;
							break;
						}
						i++;
					}
					System.out.println("int i = "+i);
					for(int k=i;k<student.length;k++) {	// �� �ε��� ����� �ݺ���
						if(k==student.length-1) {
							student[student.length-1]=null;
							System.out.println("������ ���� ����");
							System.out.println(student.length);
							break;
						}
						student[k]=student[k+1];
					}
					
				}
				else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				}
				catch(Exception e) {
				System.out.println("���ܹ߻�. �ʱ� �Ŵ��� ���ư��ϴ�.");
				System.out.println(e);
				scanner = new Scanner(System.in);
				}
		}	// while END
	}	
}
