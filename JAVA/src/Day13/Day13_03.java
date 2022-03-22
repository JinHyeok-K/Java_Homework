package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_03 {
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도 : "); int year = scanner.nextInt();
		System.out.print("월 : "); int month = scanner.nextInt();
		
		달력(year,month);
		} catch(Exception e){
			
		}
	}
	
	
	// 1. 달력 메소드
	public static void 달력(int year,int month) {
		while(true) {
			try {
			// 1. 캘릭더 클래스 내 현재 날짜 /시간 객체 호출
			Calendar calendar = Calendar.getInstance();
			// 2. 연도, 월, 일
	//		int year = calendar.get(calendar.YEAR);
	//		int month = calendar.get(calendar.MONTH)+1;
			int day = calendar.get( Calendar.DAY_OF_MONTH );
			// * 해당 월의 1일의 요일 찾기
				// 1. 사용자 정의 캘린더 설정
				calendar.set(year, month-1,1);
				// 2. 3월 1일의 요일
				int sweek =  calendar.get(Calendar.DAY_OF_WEEK);
				// 3. 3월의 마지막일
				int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			// 3. 출력
			System.out.println(" **** "+year+"년"+ month + "월 **** ");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			// * 현재 월 1일의 위치 앞에 공백 채우기
			for(int i = 1; i<sweek ; i++) {
							// 3월 1일 = 화  =3
				System.out.print("\t"); // i =일 출력
			}
			// 1일부터 마지막 날짜 까지 출력
			for(int i = 1;i<=eday;i++) {
				
	//			//만약에 오늘 체크
	//			if(i==day) System.err.print(i+"*\t");
	//			else System.out.print(i+"\t");
	//			
				System.out.print(i+"\t");
				//  토요일 마다 줄바꿈 처리 [ 토요일 = 7 ] 요일이 7배수마다
				if(sweek %7==0) System.out.println();
					//7배수
				sweek++;
			}
			
		// 버튼 [1. 이전달  2.다음달 3 다시검색]
			System.out.println("\n\sn");
			System.out.print("\t1.◀(이전달) 2.▶(다음달) 3.▲다시검색 4.종료 : "); 
			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();
			if (select ==1 ) {
				 month=month-1;
				 if(month == 0) { year -=1; month =12;}
			}else if(select ==2 ) {
				 month=month+1;
				 if( month ==13 ) { year +=1; month=1;}
			}else if(select == 3) {
				System.out.print("연도 : ");  year=scanner.nextInt();
				System.out.print("dnjf : "); month=scanner.nextInt();
			}else if(select == 4){
				System.out.println("종료");
				break; // 메소드 종료
				
			}else {System.out.println("잘못된 입력");}
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("예외 발생");
			}
			
		
			
		}	
	}//달력 메소드 end
	
	
}
