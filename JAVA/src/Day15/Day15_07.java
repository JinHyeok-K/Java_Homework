package Day15;

import java.awt.Toolkit;

public class Day15_07 {
	
	
	public static void main(String[] args) {
		
		// p601. 스레드 제어
			// 1. Thread.sleep(밀리초): 주어진 시간동안 일시 정지
					// 시간단위: 밀리초 1/1000초 마이크로초 1/1000000 
					// 일반예외발생 : 일시정지 상태에서 주어진 시간이 되기 전에 실행대기[종료]
		
			// 2. Thread.yield() : 다른 스레드에게 실행 양보
		
		
		
		// p602. sleep 예제
//		Toolkit toolkit	= Toolkit.getDefaultToolkit(); //소리 관련 클래스
//		for(int i = 0 ; i<10;i++) { // 10번 반복
//			toolkit.beep(); // 소리내기 [소리가 1번 작동중에 for문 끝남]
//			try {Thread.sleep(3000);
//			} catch (Exception e) {	} // 현 스레드(main) 3초간 일시정지
//		}
		
		
		
		//  p604~606 yield()
			//1 .객체 생성
		ThreadA threadA =new ThreadA();
		//	  2/ 객체 생성
		ThreadB threadB = new ThreadB();
		//3. thread 시작
		threadA.start();
		threadB.start();
		//4 .  스레드 3초간 일시정지 
		try {Thread.sleep(3000);}
		catch(Exception e) {}
		// 5.  스레드 A에 work 갑 변경 [해당 스레드 일시정지]
		threadA.work =false;// -> Thread.yield
	
		//4 .  스레드 3초간 일시정지 
				try {Thread.sleep(3000);}
				catch(Exception e) {}
				// 5.  스레드 A에 work 갑 변경 [ 해당 스레드 일시정지 풀기]
				threadA.work =true;	
	
				// 스레도 3초간 일시정지
				try {Thread.sleep(3000);}
				catch(Exception e) {}
	}			// 스레도 A/ 스래드 B wg
				
		
	
}
