package Day15;

public class Day15_04 {
	// 12 장 :스레드 :코드를 읽어주는 역할
		// 코드 -> 파일 -> 프로세스[프로그램]
		// 목적 : 병렬처리 
			//  main 메소드에 main 스레드 포함
	
		// 사용방법
			// 1.  Thread class
			// 2. Runnable interface
	
		// run 메소드 : 멀티스레드의 실행코드
	

	public static void main(String[] args) {
		// 예1)  Thread class  를 이용한 병렬 처리 객체 만들기
		
		//음악 class 내 Thread
		음악 m1 = new 음악();
		m1.start();
		 // run 메소드 실행 -> 스레드 실행
		
		
		//  채팅 Class 내 Thread
		// 예2)  Runnable interface 를 이용한 병렬 처리 객체 만들기
		채팅 c1 =new 채팅();
		//c1.start(); // Runnable 는 start() 메소드를 가지고 있지 않음
		Thread thread =new Thread(c1);
		thread.start();
		
		
		
		/// Main Thread
		while(true) {
			System.out.println(" 프로그램 작동중 ");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
	
		
	
	
	
	
	
	
}
	
	
	
	
