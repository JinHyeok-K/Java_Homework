package test1;

import java.util.Scanner;

public class 시험2 {
	public static void main(String[] args) {
//		1. 성적표는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//		2. 메뉴에서 1번 선택시 학생점수를 추가 합니다. [ 5점 ]
//		3. 메뉴에서 2번 선택시 학생점수를 삭제 합니다. [ 5점 ]
//		4. 데이터는 키보드로 입력받아 배열에 저장합니다. [ 5점 ]
//		5. 성적 입력은 5명으로 하되, 최대 100명 이 가능하도록 작성합니다. [ 5점 ]
//		6. 번호 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다. [ 5점 ]
//		7. 평균은 소숫점 이하 2자리까지로 합니다. [ 5점 ]
//		8. 총점을 이용하여 석차를 구합니다. [ 5점 ]
//		9. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]

		Scanner scanner= new Scanner(System.in);
		학생[] 학생명부= new 학생[100];
		int[] 석차 = new int[학생명부.length];
		//배열 변수 설정
		while(true) {
			try {
				//기본 펼침 목록
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표\t\t\t");
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("-------------------------------------------------------------------------");

				for(int i =0 ;i<학생명부.length;i++) {
					석차[i]=1; // 1로 모조리 초기화
				}
				
				//석차 설정
				for(int i = 0 ; i<학생명부.length-1;i++) {
					for(int j=i+1;j<학생명부.length;j++) {
						if(학생명부[j]!=null&& 학생명부[i].get평균() < 학생명부[j].get평균()) {
							석차[i]++;
						}
						else if(학생명부[j]!=null&& 학생명부[i].get평균() < 학생명부[j].get평균()) {
							석차[j]++;
						}
					}
				}
				for (int i=0;i<학생명부.length;i++) {
					if(학생명부[i]!=null) {
//									 
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
							(i+1),학생명부[i].get이름(),학생명부[i].get국어(),학생명부[i].get영어(),
							학생명부[i].get수학(),학생명부[i].get총점(),학생명부[i].get평균(),석차[i]);
					}
					
				}
				System.out.println("1.학생 정보 입력 2. 학생 삭제"); int 선택 = scanner.nextInt();
				if(선택==1) {
				
					System.out.print("이름 :"); String 이름= scanner.next();
					System.out.print("국어 :"); int 국어= scanner.nextInt();
					System.out.print("영어 :"); int 영어= scanner.nextInt();
					System.out.print("수학 :"); int 수학= scanner.nextInt();
					
					int 총점 = 국어+영어+수학;
					double 평균 = 총점/3.0;
					boolean check =true;
					if ( 국어<=-1 || 국어 >=101 ||영어<=-1 ||영어>=101||수학<=-1 || 수학 >=101) {
						System.out.println("입력된 점수가 잘못되었습니다.");
						check=false;
					}
					if(check==true) {
						학생 학생들= new 학생(이름,국어,영어,수학,총점,평균,0);
						int i =0;
						for (학생 temp:학생명부) {
							if(temp==null) {
								학생명부[i] = 학생들;	
								break;
							}
							i++;
				     	}
					}
				}
				else if(선택==2) {
					System.out.println(" 입력된 학생의 정보를 삭제합니다");
					System.out.print("삭제할 학생의 번호를 입력 해 주세요"); int 삭제=scanner.nextInt();
					System.out.println(" 선택한 정보를 삭제합니다");
					
					학생명부[삭제-1]= null;									
					int i =삭제-1;
					for(int j=i;j<학생명부.length;j++) {
						if(j==학생명부.length-1) {
							학생명부[학생명부.length-1]=null;
							
							break;
						}
						학생명부[j] = 학생명부[j+1];
					}
					
				}
				else {
					System.out.println("잘못된 입력입니다.");
				}
			}
			catch(Exception e) {
			System.out.println("오류 발생 처음으로 돌아갑니다.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
			
			
			
			
			
			
			
		}//
//			catch(Exception e) {
//				System.out.println("입력오류. 초기 메뉴로 돌아갑니다.");
//				System.out.println(e);
//				scanner = new Scanner(System.in);
//		}
		
		
		
	}//메인 end
}//class end
