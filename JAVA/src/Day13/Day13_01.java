package Day13;

import java.util.Random;

public class Day13_01 {

	public static void main(String[] args) {
		
		//p.534 : Math 클래스(java.lang 패키지) import 할 필요 없음 [수학 관련 메소드 제공 ] 객체 없이 사용 가능
		// -> Static 으로 되어있음
			// 1. Math.abs(수) : 해당 수의 절대값
		System.out.println(" 절대값 : "+ Math.abs(-5));
		System.out.println(" 절대값 : "+ Math.abs(-3.14));
			// 2. Math.ceil(수) : 가까운 정수로 올림
		System.out.println(" 올림값 : "+ Math.ceil(5.3)); // 소수점 첫째자리에서 올림
		System.out.println(" 올림값 : "+ Math.ceil(-5.3)); //  가까운정수로 올림 -6이아닌 -5 출력
			// 3. Math.floor(수) : 가까운 정수로 내림
		System.out.println(" 버림값 : "+ Math.floor(5.3)); // 소수점 첫째자리에서 내림
		System.out.println(" 버림값 : "+ Math.floor(-5.3)); // 가까운 정수로 내림 -5가 아닌 -6출력
			// 4. Math.max(수1,수2) : 두 수 중에서 큰값 출력
		System.out.println(" 최대값 : "+ Math.max(5, 9));
		System.out.println(" 최대값 : "+ Math.max(5.3, 2.5));
			// 5. Math.min(수1,수2) : 두 수 중에서 작은값 출력
		System.out.println(" 최소값 : "+ Math.min(5, 9));
		System.out.println(" 최소값 : "+ Math.min(5.3, 2.5));
			// 6. Math.random() : 0~1 사이의 (double)형 난수 발생
		System.out.println(" 난수 : "+ Math.random()); // 0~1 사이의 난수 발생
		// vs
//		Random random = new Random();
		
			// 7. Math.rint(수) : 가까운 정수의 실수값으로 반올림
		System.out.println(" 가까운 정수의 실수값 : "+Math.rint(5.3));// 5  반올림
		System.out.println(" 가까운 정수의 실수값 : "+Math.rint(5.4));// 5  반올림
		System.out.println(" 가까운 정수의 실수값 : "+Math.rint(5.5));// 6  반올림
		System.out.println(" 가까운 정수의 실수값 : "+Math.rint(5.7));// 6  반올림 - 실수 타입
			// 8. Math.round(수) : 가까운 정수의 정수값으로 반올림		
		System.out.println(" 가까운 정수의 정수값 : "+Math.round(5.3));  // 반올림 - 정수 타입
		
		// p.536
		// 주사위 [1~6]
//		
		System.out.println(Math.random()*6); // 0~1(0.99999999) *6 => 0~6 출력
		System.out.println(Math.random()*6 +1); // 0~6 +1 => 1~7
		int num=(int)(Math.random()*6)+1;
			// (기본자료형) 값/변수 = 강제 형변환 (데이터손실)
			// double => int 강제 형 변환시 => 소수점 잘림
		System.out.println("1부터 6사이의 난수 : "+num);
		///////////////////////////////////////////////////////////////////
		Random random = new Random();
		System.out.println("1~6사이의난수(random class) :"+(random.nextInt(6)+1)); // 0~5 +1 => 1~6
		 // 형 변환 할
	}
}
