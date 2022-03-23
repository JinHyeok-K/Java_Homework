package Day09;

public class Car { // class 선언
	
	// 1. 필드
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backtRightTire = new Tire("뒤오른쪽",4);
// 정의 클래스명 객체명 = new 상생자(타이어위치, 타이어수명) 
	// 2. 생성자
	// 3. 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll()==false) {stop(); return 1;}
		// 타이어가 회전을 햇는데 결과가 false 이면 펑크
		// true 이면 수명 남은
		if(frontRightTire.roll()==false){stop(); return 2;}
		if(backLeftTire.roll()==false){stop(); return 2;}
		if(backtRightTire.roll()==false){stop(); return 2;}
		return 0;
	}
	void stop(){
		System.out.println("[자동차가 멈춥니다.]");
	}
		

}
