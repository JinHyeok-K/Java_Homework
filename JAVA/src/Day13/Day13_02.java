package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

public class Day13_02 {
	
	public static void main(String[] args) {
		// p539
			// Date 클래스 (java.util) : 시스템 날짜 / 시간
		Date date = new Date(); // date 객체 생성
		System.out.println("현재 날짜/시간 : "+ date);
		System.out.println("객체정보 메소드 :"+date.toString());
			// SimpleDateFormat 클래스 : 날짜 /시간 포맷 (형식 =모양) 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 날짜에 형식 적용하기 [ date 형식 => String 형 변환 ]
		System.out.println("날짜형식변경 : "+sdf.format(date));
										// 형식객체.format(날짜객체)
		// p.540
			// Calendar class : 운영체제 시간대의 날짜 / 시간에 대한 정보
		Calendar now = Calendar.getInstance(); // Calendar 클래스 내 객체 호출;
			// 이미 Calendar 클래스 내 객체 존재 !!   = 객체생성(new를 사용) 할 필요가 없다
		System.out.println(" 연도 : "+ now.get(Calendar.YEAR));// 연도
		System.out.println(" 월 : "+ now.get((Calendar.MONTH)+1));// 월 : 0~11 [0:1월]
		System.out.println(" 일 : "+ now.get(Calendar.DAY_OF_MONTH)); //일 
													// 월 기준으로 일수
		System.out.println(" 요일 : "+ now.get(Calendar.DAY_OF_WEEK));  //요일
													// 주 기준으 일수 [1일 2월 3화 4수 5목 6금 7토]
		
		// 요일[숫자] -> 한글 변환
		int week = now.get(Calendar.DAY_OF_WEEK );
		String 요일 = null;
		switch(week) {
		case 1 : 요일 = "일요일" ; break;
		case 2 : 요일 = "월요일" ; break;
		case 3 : 요일 = "화요일" ; break;
		case 4 : 요일 = "수요일" ; break;
		case 5 : 요일 = "목요일" ; break;
		case 6 : 요일 = "금요일" ; break;
		case 7 : 요일 = "토요일" ; break;
		
		}
		
		
		System.out.println("요일[한글]: "+ 요일);
		
		// 오전 /오후
		System.out.println(" 오전/오후 : "+ now.get(Calendar.AM_PM)); // 0:오전  1:오후
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = null;
		if(ampm==0) 오전오후 = "오전";
		else 오전오후 ="오후";
		System.out.println("오전/오후 : "+오전오후);
		
		System.out.println("시 : "+now.get(Calendar.HOUR));
		System.out.println("분 : "+now.get(Calendar.MINUTE));
		System.out.println("초 : "+now.get(Calendar.SECOND));
		
		// ZonedDateTime class : 세계 협정시계
		ZonedDateTime 협정시  = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("협정시 : "+협정시);
			협정시 = 협정시.now(ZoneId.of("Asia/Seoul"));
			System.out.println("서울 시 : "+협정시);
			협정시 = 협정시.now(ZoneId.of("America/New_York"));
			System.out.println("뉴욕 시 : "+협정시);
		
		
		
	}
}
