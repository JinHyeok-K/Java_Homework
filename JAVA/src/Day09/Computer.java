package Day09;

public class Computer extends Calculator{
			// sub class extends super class
	//1.필드
	//2.생성자
	//3.메소드
		// * 오버라이딩[super class 내 메소드 재정의(수정)
		// ctrl_1
	 // 상속 받은 super class가 가지고 있는 메소드 호출
	@Override
	double areaCircle(double r) {
		 System.out.println("Computer 객체의 areaCircle() 실행");
		 return Math.PI * r * r;
	 }
}
