package Day09;

public class Day09_03 {
	public static void main(String[] args) {
		// p294~295
			// 만일 super() 생략시 자동 추가
			// super() : 부모 클래스 내 빈 생성자 호출
			// super(인수1, 인수2,...,인수n) 부모 클래스 내 [n개인수] 생성자 호출
		// 1. 서브클래스로 객체 생성
		Student student = new Student("홍길동", "1234-5678", 1);
		// 2. 서브 클래ㅡ로 만든 객체로 슈퍼클래스 내 멤버 적븐
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		// 3.
		System.out.println("studentNo :"+student.studentNo);
	}
}
