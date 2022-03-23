package test2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;



public class Controller {
	
//	// 1. 배열
//	public static Car[] carList = new Car[100];
//	// 2. 리스트
	public static ArrayList<Car> carlist = new ArrayList<>(); 
	static Scanner scanner = new Scanner(System.in);
	
	static LocalDate 입차연월일 = LocalDate.now(); // 현재 날짜
	static LocalTime 입차시간 = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
	
	
	//입차 메소드
	//(public static int(){}
	public static boolean 입차() {
		//입차 코드 작성
		
		//1. 입력받을 차량번호(인수) 가져온다. //* 차량번호 중복체크()
		System.out.println("차량 번호");
		String 차량번호 = scanner.next();// 차량 번호 입력
		
		
		for(Car temp:Controller.carlist)	{
			if(temp!=null && temp.get차량번호().equals(차량번호)) {
				System.out.println(" 이미 등록된 주차 번호 임미다.");
			}
		}
		
		//2. 입차날짜(현재날짜) 을 구한다 ( ??) 
		//3. 입차시간(현재시간) 을 구한다
		
		//4. 차량번호,입차날짜,입차시간 -> 3개변수 ->1객체화
		Car car = new Car(입차연월일, 차량번호, 입차시간, null, 0);
		
		Controller.carlist.add(car);
		System.out.println("주차 완료");
		return true;
		//5. 차량객체 배열이나 리스트에 저장
		
				
			
		
		   //* 출차시간, 금액은 출차 시 
			//6. 파일처리 or DB처리 -> 내일은 안해도 됨
		
		
	}
	
	
	//출차 메소드
	public static boolean 출차() {
		//출차 코드 작성
			// 1.입력받은 차량번호(인수) 가져온다.
		System.out.println("차량 번호"); 
		String 차량번호 = scanner.next();
		
		
		// 2. 배열 or 리스트 내 동일한 차량번호를 찾아서
		for(Car temp : Controller.carlist) {
			if(temp!=null && temp.get차량번호().equals(차량번호)) {
				LocalDate 출차연월일 = LocalDate.now(); // 현재 날짜
				LocalTime 출차시간 = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
//				입차연월일
			
				int 주차연월일 =(int) temp.get날짜().until(출차연월일,ChronoUnit.DAYS);
				int 주차시분 =(int) temp.get입차시간().until(출차시간, ChronoUnit.MINUTES);
				int 총주차시간 = (주차연월일*24*60)+주차시분;
				int 주차요금 =0;
				if(총주차시간<30) {
					 주차요금 = 0;
				}
				else { 주차요금 = ((총주차시간-30)/10)*1000;}
				temp.set출차시간(출차시간);
				temp.set금액(주차요금);
				
			}
		}
		
			// 3.출차시간(현재시간) 을 구한다 (??:)
			// 4.계산[출차시간-입차시간 -> (분-30)/10*1000]   until
			// 5.(수정)찾은 객체 내 출차시간과 금액을 대입.
		
		System.out.println("해당 차량이 없습니다.");
		return false;
	}
	
	public void 주차() {
		
		
	}
	
}
