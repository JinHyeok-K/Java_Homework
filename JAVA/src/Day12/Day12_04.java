package Day12;

import java.util.Random;
import java.util.Scanner;

import javax.swing.event.CaretListener;

public class Day12_04 {
	// 차량번호 분배 프로그램
		// 조건 
			// 1. 난수 0000~9999[4자리 정수] 사이의 난수 10개 생성해서 배열에 저장 
			// 2. 모든 차량 번호를 배열에 저장 
			// 3. 끝자리 번호로 홀/짝 구분
			// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장  
			// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장 
			// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	public static void main(String[] args) {
//		Random random =new Random();
////		int CarNum = random.nextInt(10000);
////		byte[] bytes = new byte[CarNum];
//		
//		String[] Car = new String[10];
//		// 2. 바이트 배열 => 문자열 변환 [ new String(배열명); ]
////		String str1 = new String(bytes);
//	
////		System.out.println(CarNum);
//		for (int i = 0;i<Car.length;i++) {
//			int CarNum = random.nextInt(10000);
//			byte[] bytes = new byte[CarNum];
////			String Car = new String(bytes);
//		}
//		System.out.println(Car);
		
		String[] carlist = new String[10];
		Scanner scanner =new Scanner(System.in);
		while(true) {
			
			System.out.println("\n주차중인 모든 차량 번호");
			for(String temp :carlist) {	if (temp!=null) System.out.println(temp+"  ");}
			
			System.out.println("주차중인 모든 홀수 번호");
			int i=0;
			for(String temp :carlist) {	if (temp!=null&&temp[i]/2==0) System.out.println(temp);i++;}
			
			
			
			System.out.println("1.차량입차");  int ch =scanner.nextInt();
			if (ch == 1) {
				Random random = new Random();//랜덤객체
				int intnum = random.nextInt(10000); // 0~9999 중 난수 발생
				String strnum = String.format("%04d", intnum);
											// 형식
												// %d : 정수 %f 실수 %s 문자열 %c 문자
												// %0숫자d: 숫자만큼 자릿수 
				boolean save=false;
				for(int i=0;i<carlist.length; i++) {
					if(carlist[i]==null) {carlist[i] =strnum;save=true;break;}
				}
				if (save==false)System.out.println("만차] 주차불가");
					}
				}
				
			
		}
		
		
		
		
		
		
		
		
		
	
}
