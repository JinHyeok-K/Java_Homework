package test;

import java.util.Scanner;

public class 시험 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		학생[] 학생명부 = new 학생[100];
		int[] 석차 = new int[학생명부.length];
		
		while(true) {
			try {
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표\t\t\t");
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("-------------------------------------------------------------------------");
				for(int i=0; i<석차.length;i++) {	// 석차 저장 배열 초기화
					석차[i]=1;
				}
				
				
				
				for(int i=0;i<학생명부.length-1;i++) {
					for(int j=i+1;j<학생명부.length;j++) {
						if(학생명부[j]!=null&&학생명부[i].get평균() < 학생명부[j].get평균()) {
							석차[i]++;
						}
						else if(학생명부[j]!=null&&학생명부[i].get평균() > 학생명부[j].get평균()) {
							석차[j]++;
						}
					}
				} 
				
				for(int i =0; i<학생명부.length;i++) {
					if (학생명부[i]!=null){
						System.out.printf("%d\t%3s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
								(i+1),학생명부[i].get이름(),학생명부[i].get국어(),학생명부[i].get영어(),
								학생명부[i].get수학(),학생명부[i].get총점(),학생명부[i].get평균(),석차[i]);
					}
					
				}
				System.out.println("1. 학생점수 등록 2. 학생점수 삭제 "); int 선택 = scanner.nextInt();
				if (선택 ==1 ) {
					System.out.print("이름 :"); String 이름=scanner.next();
					System.out.print("국어점수 :"); int 국어=scanner.nextInt();
					System.out.print("영어점수 :"); int 영어=scanner.nextInt();
					System.out.print("수학점수 :"); int 수학=scanner.nextInt();
					
					
					int 총점 = 국어+영어+수학 ;
					double 평균 =총점/3.0;
					
					boolean check= true;
					
					if(국어<=-1 || 국어>=101 ||영어<=-1 || 영어>=101||수학<=-1 || 수학>=101) {
						System.out.println("점수 입력이 잘못되었습니다.");
						check=false;
					}
					
					if(check==true) {
						학생 학생들 = new 학생(이름,국어,영어,수학,총점,평균,0);
					
						int i = 0;
						for(학생 temp1:학생명부) {
							if(temp1==null) {
								학생명부[i] =학생들;
								break;
							}i++;
						}
					}
				}
				else if (선택 ==2 ) {
					System.out.println("학생 점수 삭제");
					System.out.print("삭제할 학생의 번호를 입력 >");
					int 삭제= scanner.nextInt();
					System.out.println(삭제+"번 학생의 정보를 삭제합니다.");
					학생명부[삭제-1] = null;
					int i =삭제-1;
					for(int k=i;k<학생명부.length;k++) {	// 빈 인덱스 땡기는 반복문
						if(k==학생명부.length-1) {
							학생명부[학생명부.length-1]=null;
	//						System.out.println("마지막 복사 실행");
							System.out.println(학생명부.length);
							break;
						}
						학생명부[k]=학생명부[k+1];
					}
				
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			catch(Exception e) {
			System.out.println("입력오류. 초기 메뉴로 돌아갑니다.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
		
			
			
		}//while end	
	}// main end
}// class end
