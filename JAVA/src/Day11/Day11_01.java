package Day11;

public class Day11_01 {
	// p.386 확인문제
		// 1. 3 [ 인터페이스의 멤버 : 1. 상수필드 2. 추상메소드 3. 디폴트 메소드. 4. 정적메소드 ]
		// 2. 4 [ 인터페이스 변수 = 구현객체 ]
			// 구현객체 = 클래스가 implements 한 객체
		// 
	private static void printSound(Soundable soundable) {
//	접근제한자 정적	   반환타입  메소드명 (인수[배열,변수,객체,인터페이스])		
	
		// 3.
		System.out.println(soundable.sound());
	} //=> 호출 1. new를 사용하여 호출, 사용   
	 //		   2. Static 으로 사용
		//     둘 다 메모리 할당=> 사용
	
	
	// 4.
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		// 3.
		printSound(new Cat()); // 2-2
				//  구현객체
		printSound(new Dog());
		
		Soundable soundable = new Cat();// 2-1
		Soundable[] soundables = new Cat[100]; // 2-3
			
		// 4.
			// Dao : DB 접근객체		Dto : 데이터 이동객체
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		
		// 5. 익명객체[인터페이스가 직접 구현]
			// 구현객체 : 인터페이스명 객체명 = new 클래스명(); // 반복 사용 용도
			// 익명객체 : 인터페이스명 객체명 = new 인터페이스() { 구현 }; // 1회용(간단하게 쓸 용도) 
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		}; // 구현 끝 [세미클론 꼭 닫기]
		
		action.work();
	}
	
	
}
