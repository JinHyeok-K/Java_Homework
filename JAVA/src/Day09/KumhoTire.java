package Day09;

public class KumhoTire extends Tire{
	//        서브클래스  extends 슈퍼클래스
	// 1. 필드
	// 2. 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// 슈퍼 클래스 내 생성자 [ 코드 줄이기 ]
		
		
	}
	// 3. 메소드
	@Override
	public boolean roll() {
		accumulatedRotation++; // 누적 회전수를 1 증가 // 타이어 회전
		if (accumulatedRotation<maxRotation) {
			// 만약에 누적 회전수가 최대 회전수가 작으면 [ 수명 남음]
			System.out.println(location+"금호타이어 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else { // 아니면 [수명 없다]
			System.out.println("***"+location+" 금호타이어 펑크 ***");
			return false;
		}
	}
}
