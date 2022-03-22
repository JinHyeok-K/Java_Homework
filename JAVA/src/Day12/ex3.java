package Day12;

import java.util.Scanner;



public class ex3 {
	
	public static void main(String[] args) {
		// 변수 배열 시작
		학생[] 학생명부 = new 학생[100];
		int[] 석차 = new int[학생명부.length];
		//입력객체 start
		Scanner scanner = new Scanner(System.in);
		
		 
		
		while(true) {
			try {
				System.out.println("---------------------------------");
				System.out.println("\t\t\t 성적표 \t\t\t");
				System.out.println("---------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("---------------------------------\n");
				//석차 초기화
				for (int i = 0 ; i<학생명부.length;i++) {
					석차[i] = 1; // 1로 초기화
				}
				
				for(int i = 0 ; i<학생명부.length-1;i++) {
					for(int j =i+1;i<학생명부.length;i++) {
						if(학생명부[j]!=null&& 학생명부[i].get평균() < 학생명부[j].get평균()) {
							석차[i]++;
						}else if(학생명부[j]!=null&& 학생명부[i].get평균() > 학생명부[j].get평균()) {
							석차[j]++;
						}
					}
				}
				
				// 입력된값 상시 펼침 
				for (int i=0;i<학생명부.length;i++) {
					if(학생명부[i]!=null) {
//									 
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
							(i+1),학생명부[i].get이름(),학생명부[i].get국어(),학생명부[i].get영어(),
							학생명부[i].get수학(),학생명부[i].get총점(),학생명부[i].get평균(),석차[i]);
					}
					
				}
				// 초기 선택메뉴 시작
				
				System.out.print("메뉴: 1. 학생점수 등록 2. 학생점수 삭제"); int 선택 = scanner.nextInt();
				
				// if 시작
				
				if(선택 == 1) {
					System.out.println(" 학생 점수 등록 시작  ");
					System.out.print(" 이름 : "); String 이름=scanner.next();
					System.out.print(" 국어 : "); int 국어=scanner.nextInt();
					System.out.print(" 영어 : "); int 영어=scanner.nextInt();
					System.out.print(" 수학 : "); int 수학=scanner.nextInt();
					
					boolean check = true;
					if( 국어<=-1 || 국어 >=101 ||영어<=-1 || 영어 >=101 ||수학<=-1 || 수학 >=101 ) {
						System.out.println("잘못된 점수를 입력하였습니다.");
						check=false;
					}
						if(check==true) {
						int 총점 = 국어+영어+수학;
						double 평균 = 총점/3.0;
						
						// 학생 class 선언
						
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
				}//else if(선택 == 2) {
					
				//}
						
				
		
		
			}catch(Exception e) {
			System.out.println("오류 발생 처음으로 돌아갑니다.");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
		}
	}
}
