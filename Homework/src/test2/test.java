package test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class test {
public static void main(String[] args) {
	LocalDate ���������� = LocalDate.now(); // ���� ��¥
	LocalTime �����ð� = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
//	System.out.println(����������);
//	System.out.println(�����ð�);
//	LocalDateTime ���������� = LocalDateTime.of
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
//	int �����ð�1 =(int) temp.get��¥().until(����������,ChronoUnit.MINUTES);
//	int �����ð�2 =(int) temp.get�����ð�().until(�����ð�, ChronoUnit.MINUTES);
	
	
}
}
