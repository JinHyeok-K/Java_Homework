package test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class test {
public static void main(String[] args) {
	LocalDate 입차연월일 = LocalDate.now(); // 현재 날짜
	LocalTime 입차시간 = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
//	System.out.println(입차연월일);
//	System.out.println(입차시간);
//	LocalDateTime 입차연월일 = LocalDateTime.of
//	LocalTIme a = 13:42;
	LocalTime myTime1 = LocalTime.of(12, 01); //   (12,01,02,03);
	LocalTime myTime2 = LocalTime.of(12, 15);
	
	LocalDate mYtime1 = LocalDate.of(2022, 03, 22);
	LocalDate mYtime2 = LocalDate.of(2022, 12, 22);
	
	int k2 = (int) mYtime1.until(mYtime2, ChronoUnit.DAYS);
//	
//	int k =(int) myTime1.until(myTime2, ChronoUnit.MINUTES);
//	System.out.println(k);
	System.out.println(k2);
	
	
//	
//	int 주차시간1 =(int) temp.get날짜().until(출차연월일,ChronoUnit.MINUTES);
//	int 주차시간2 =(int) temp.get입차시간().until(출차시간, ChronoUnit.MINUTES);
	
	
}
}
