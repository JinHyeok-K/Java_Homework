package Day01;

import java.util.Random;
import java.util.Scanner;

public class Day01_elevator { // class start

	public static void main(String[] args) { // main start
		
		/* 엘리베이터
		 * 
		 * 5층 건물
		 * 엘리베이터는 1F~5F 까지
		 * 	난수 발생 =>실행 시 현재 엘리베이터 위치(floor)
		 * 현재 위치 엘리베이터 표시 
		 * 유저 => 상층 or 하층 가는 버튼 클릭
		 * 유저가 누르는 곳 위치 (입력1: 현재층) -> 엘리베이터 도착 (엘리베이터 이동상황 표시) -> 입력2:목표층 -> 엘리베이터 이동상황 표시
		 * 								-> 도착 (도착 표시)
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scanner = new Scanner(System.in); //입력 객체 선언
		Random random= new Random();  // 랜덤 객체 생성
		
		
		int 엘리베이터층 = random.nextInt(5)+1; // 2 난수를 int 형으로 가져오기
		int 내위치 = random.nextInt(5)+1; // 2 난수를 int 형으로 가져오기
				// random.nextInt() : +- 20억 사이중 난수 발생
				// random.nextInt(수) : 0~수 전까지 사이중 난수 발생
				// random.nextInt(수)+시작번호 : 시작번호 ~ 수 사이의 난수 발생
	
//		
		int 엘리베이터층 =5; // test 용 층수
		int 내위치=5;// test 용 층수
		System.out.println("=========================================");
		System.out.println(" 현재 엘리베이터는 "+ 엘리베이터층+"F 이 있습니다." );
		System.out.println(" 현재 내 위치 "+ 내위치+"F 입니다." );
		System.out.println("=========================================\n\n");
		
		
		System.out.println("=========================================");
		System.out.println("엘리베이터를 가동하시겠습니까? ");
		System.out.println("1. 예  2. 아니오");
		System.out.println("선택 : "); int start = scanner.nextInt();
		
		if (start == 1) {
			System.out.println(" 엘리베이터를 가동합니다." );
			
			if  (엘리베이터층>내위치) {
					System.out.println("==========================");
					for(int i=엘리베이터층;i>=내위치;i--) {
						
						System.out.println("현재 "+ i+"F 입니다.");
						
					}
				System.out.println(" 엘리베이터가 도착하였습니다.");
				System.out.println("==========================\n\n");
				
				System.out.println("==========================");
				System.out.println(" 몇 층으로 가시겠습니까?");
				System.out.println("선택 : "); int floar = scanner.nextInt();
					if (내위치<floar) {
						System.out.println(" 올라 갑니다.");
						for (int i=내위치;i<=floar;i++) {
							System.out.println("현재 "+ i+" F 입니다.");
						}
						System.out.println(" "+floar+"F 입니다.");
					}
					else if (내위치>floar) {
						System.out.println(" 내려 갑니다.");
						for (int i=내위치;i>=floar;i--) {
							System.out.println("현재"+ i+"F입니다.");
						}
						System.out.println(" "+floar+"F 입니다.");
					}
			}
				else if(엘리베이터층<내위치){
					System.out.println("==========================");
					for (int i=엘리베이터층;i<=내위치;i++) {
						
						System.out.println( "현재 "+ i +"F 입니다");
						
					}
					System.out.println(" 엘리베이터가 도착하였습니다");
					System.out.println("==========================");
				}
				else if(엘리베이터층==내위치) { 
					 System.out.println("=========================="); 
					 System.out.println(" 엘리베이터가 현재 층에 있습니다.");
					 System.out.println(" 몇 층으로 가시겠습니까?");
					 System.out.println("==========================");
					 System.out.println("선택 : "); int floar = scanner.nextInt();
					 if (내위치<floar) {
							System.out.println(" 올라 갑니다.");
							for (int i=내위치;i<=floar;i++) {
								System.out.println("현재 "+ i+" F 입니다.");
							}
							System.out.println(" "+floar+"F 입니다.");
						}
						else if (내위치>floar) {
							System.out.println(" 내려 갑니다.");
							for (int i=내위치;i>=floar;i--) {
								System.out.println("현재"+ i+"F입니다.");
							}
							System.out.println(" "+floar+"F 입니다.");
						}
				}
		}
		else {System.out.println("\n\n====================================");}	
		
		//난수 설정 (현재 엘리베이터 위치)
		
		
	} // main end
	
} // class end
