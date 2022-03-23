package Day08;

public class Day08_02 {
	
	public static void main(String[] args) {
		
		// p.245 : final
			// 최종적 뜻
			// 고정값 만들기
			// 사용되는 방법 : 1. 필드 선언시 2. 생성자에서
		
		Person p1 =new Person("123123", "오오오");
		
		// 2. 객체 내 필드 수정
//		p1.nation = "USA"; // final 필드가 아니면 수정 가능
//		p1.ssn= "USA"; // final 필드가 아니면 수정 가능
		p1.name = "오";
	}

}
