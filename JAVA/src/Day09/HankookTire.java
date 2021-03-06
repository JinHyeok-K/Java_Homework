package Day09;

public class HankookTire extends Tire{
			//서브클래스	 extends 슈퍼클래스
	// 1. 필드
	// 2. 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// super(인수1,인수2) => 슈퍼클래스 내 [인수 2개] 생성자 호출
	}
	// 3. 메소드
		// ctrl+스페이스바 (roll override 선택 -> @override)
	@Override // 슈퍼 클래스 내 메소드 재 정의[수정]
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"한국 타이어 수명 : "+ maxRotation);
			return true;
		}else {
			System.out.println("***"+location+"한국 타이어 펑크 ***");
			return false;
		}
	}

}
