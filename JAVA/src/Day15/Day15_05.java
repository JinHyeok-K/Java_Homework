package Day15;

public class Day15_05 {
	// p.591 동기화
				// 멀티스레드 사용 시 동기화 선택[ 단일 스레드 사용시 필요x ]
				// *여러개의 스레드가 동일한 메소드 호출
				// 동시다발적으로 하나의 메소드 호출
			// 예1) 동기화 없는 메소드 사용 시
				// 2개의 스레드가 동일한 메소드 호출
		public static void main(String[] args) {
			// 1.   계산기 객체 생성
			Calculator 계산기 = new Calculator();
			
			//2. User 1  객체 생성
			User1 user1 = new User1();
			// * 계산기 객체를    user1 설정[대입]
			user1.setCalculator( 계산기 );
			user1.start();
			//3.User 2  객체 생성
			User2 user2 = new User2();
			// * 계산기 객체를    user2 설정[대입]
			user2.setCalculator( 계산기 );
			user2.start();
			
		}
}
