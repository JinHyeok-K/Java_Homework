package Day03;

import java.util.Scanner;

public class Day03_04_조건문4 { //cs
	
	public static void main(String[] args) { //ms
		
		Scanner scanner = new Scanner(System.in);
		
		
		// 제어문 : 1. if 문  2. switch문
			// if : 논리 검사 (true 혹은 false) / 경우의 수가 정해져 있지 않는 경우
					// >= <= > < == !=
			// switch : 데이터 검사(선택 조건)	 	/경우의 수가 정해져 있는 경우
				// 형태
					// switch (검사대상) { 
					// 		case '선택값' : 실행문;
					//		case '선택값' : 실행문;			
					//		case '선택값' : 실행문;
					//		default : 실행문;
					// }
				// break; : 가장 가까운 switch 혹은 반복문 탈출 [나가기]
		
		
				// 예1) 점수 90 A | 점수 80 B | 점수 70 C | 그 외 탈락
		
				int 점수 =80;
				if(점수==90) System.out.println("A등급");
				else if(점수==80) System.out.println("B등급");
				else if(점수==70) System.out.println("C등급");
				else System.out.println("탈락");
				
				System.out.println("======================");
				
				switch(점수) {
					case 90 : System.out.println("A등급");	break;
					case 80 : System.out.println("B등급");	break;
					case 70 : System.out.println("C등급");	break;
					default : System.out.println("탈 락");
				}
				
				// 예2) 
				int 버튼 = 3;
				switch (버튼) {
					case 1 : System.out.println("1층으로 이동");	break;
					case 2 : System.out.println("2층으로 이동");	break;
					case 3 : System.out.println("3층으로 이동");	break;
					case 4 : System.out.println("4층으로 이동");	break;
					default : System.out.println("정지");
				}
				
				// 예3)
				System.out.println();
				char 등급 = 'B';
				switch (등급 ) {
					case 'A' : 
					case 'B' : System.out.println("우수 호갱"); break;
					case 'C' :
					case 'D' : System.out.println("일반놈"); break;
				default : System.out.println("손놈");
				}
				
				// 예4)
				String 직급 = "과장";
				switch(직급) { // 선택조긴이 때문에 .equals 사용 
				case "부장" : System.out.println("700만");	 break;
				case "과장" : System.out.println("700만");	break;
				default : System.out.println("300만");
				}
				
				// 문제1 ) 국어,영어,수학 점수를 입력받아  
	 			// 	평균이 90점이상이면 A등급
	 			//  80점이상이면 B등급 나머지 탈락
				
				System.out.println(" 국어 점수 : "); int 국어= scanner.nextInt();
				System.out.println(" 영어 점수 : "); int 영어= scanner.nextInt();
				System.out.println(" 수학 점수 : "); int 수학= scanner.nextInt();
				
				int 평균 = (국어+영어+수학)/3;
				
				System.out.println("평균 : "+ 평균 + "| 나누기/10 "+평균/10);
				
				switch( 평균 /10) { // 나누기는 1의 자리 제외
					case 9 : System.out.println("A등그"); 	break;
					case 8 : System.out.println("B등급");		break;
					default : System.out.println("탈락");
					
				}
				
				
				
				
	} // me

}// ce
