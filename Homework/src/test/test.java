package test;

import java.util.Scanner;

public class test {
	
//	public static void main(String[] args) {
//		
//		// 배열 
//		학생[] 학생배열 = new 학생[100];
//		Scanner scanner = new Scanner(System.in);
//		
//		while( true ) {
//			try {
//				System.out.println(" **** 학생 목록 ****");
//				// 학생들 점수 출력 [ 모든 배열 출력  ]
//				
//				System.out.print(" 1. 학생등록 2.학생삭제 : ");
//				int ch = scanner.nextInt();
//				if( ch==1 ) {   } // 학생 등록 
//				else if( ch== 2 ) {   } // 학생 삭제 
//				else {   }
//			}
//			catch( Exception e ) {     }
//		}
//	}
	
//			1. 성적표는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//			2. 메뉴에서 1번 선택시 학생점수를 추가 합니다. [ 5점 ]
//			3. 메뉴에서 2번 선택시 학생점수를 삭제 합니다. [ 5점 ]
//			4. 데이터는 키보드로 입력받아 배열에 저장합니다. [ 5점 ]
//			5. 성적 입력은 5명으로 하되, 최대 100명 이 가능하도록 작성합니다. [ 5점 ]
//			6. 번호 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다. [ 5점 ]
//			7. 평균은 소숫점 이하 2자리까지로 합니다. [ 5점 ]
//			8. 총점을 이용하여 석차를 구합니다. [ 5점 ]
//			9. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]

	
	
	
	public static void main(String[] args) {
		
		학생[] 학생명부 = new 학생[100];
		int[] 석차= new int[학생명부.length];
		while(true) {
//			Student[] student = new Student[100];
//			int[] rank = new int[100];
			
			//기본 출력
			System.out.println("---------------------------------------");
			System.out.println("\t성\t적\t표\t");
			System.out.println("---------------------------------------");
			System.out.println("번호  이름  국어  영어  수학  총점    평균    석차");
			System.out.println("---------------------------------------");
			
			Scanner scanner =new Scanner(System.in);
//			int[] 석차=new int[학생명부.length];
//			
//			for(int i=0;i<학생명부.length;i++) {
//				석차[i]=1;
//			}
			for(int i=0; i<석차.length;i++) {	// 석차 저장 배열 초기화
				석차[i]=1;
			}
			for(int i=0; i<학생명부.length-1;i++) {
				for(int j=i+1;j<학생명부.length;j++) {
					if(학생명부[j]!=null && 학생명부[i].get평균() < 학생명부[j].get평균()){
						석차[i]++;
					}
					else if(학생명부[j]!=null && 학생명부[i].get평균() > 학생명부[j].get평균()){
						석차[j]++;
					}
				}
			}
			
			
			
			int index =0;
			for(학생 temp:학생명부) {
				if (temp!=null){
					System.out.printf("1%d%5s%5d%5d%5d%5.0f%8.2f%5d\n",
							(index+1),temp.get이름(),temp.get국어(),temp.get영어(),
							temp.get수학(),temp.get총점(),temp.get평균(),석차[i]);
				}
				index++;
			}
			
			System.out.println("-------------------------------------");
			System.out.println(" 등록 메뉴");
			System.out.println("1.학생점수 등록 2. 학생점수 삭제"); 
			int 선택 = scanner.nextInt();
		
			
			if(선택 == 1) {
				System.out.print("학생 이름 : "); String 이름=scanner.next();
				System.out.print("국어 : "); int 국어=scanner.nextInt();
				System.out.print("영어 : "); int 영어=scanner.nextInt();
				System.out.print("수학 : "); int 수학=scanner.nextInt();
				double 총점 = 국어+영어+수학 ;
				double 평균 = (double)총점/3;
				
				System.out.println(총점);
				System.out.println(평균);
				
				학생 학생들 = new 학생(이름,국어,영어,수학,총점,평균);
//				
				int i = 0;
				for(학생 temp1:학생명부) {
					if(temp1==null) {
						학생명부[i] =학생들;
						break;
					}i++;
				}
//				int j = 0;
//				for(학생 temp : 학생명부) {
//					if(temp == null) {
//						학생명부[j] = 학생들;
//						int h = 0;
//						for(학생 temp2 : 학생명부) {
//							if(temp.get총점() > temp2.get총점()) 
//							{		
////									rank[] temp3 = 학생명부[j];
//									학생명부[j] = 학생명부[h];
//									학생명부[h] = temp3;
//							}	
//							h++;
//						}
//
//					}
//					j++;
//				}
			
			
				
				
			}
			else if(선택==2) {
				
			}
		
		}//while end
	}//main end
}//class end

