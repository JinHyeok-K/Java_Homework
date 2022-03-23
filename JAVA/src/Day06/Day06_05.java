package Day06;

public class Day06_05 {
	
	public static void main(String[] args) {
		
		// p207
		
		// 1. 생성자 없이 필드에 값 넣기
		//	빈 생성자로 객체 생성
		Korean k1 = new Korean();
			// 2. 객체 생성 후에 필드 값 변경
		
			k1.name = "유재석";
			k1.ssn = "11123-12332";
		System.out.println("k1 국적 :" +k1.nation);
		System.out.println("k1 이름 : "+ k1.name);
		System.out.println("k1 주민등록번호 : " + k1.ssn);
			
		//2 .필드 2개를 갖는 생성자로 객체 생성 ==> 간접접근 => 보안성과 안정성
		Korean k2 =new Korean("박자", "01215-15252");
		System.out.println("k2 국적 :" +k2.nation);
		System.out.println("k2 이름 : "+ k2.name);
		System.out.println("k2 주민등록번호 : " + k2.ssn);
		//============================================
		
		// 1. 빈 생성자 객체
		Korean 한국인1 = new Korean();
				//한국인1 국적이 대한민국이고 이름, 주민등록번호 없음
		
		// 2. 필드 1개 생성자 객체
		Korean 한국인2 = new Korean("유재석");
				//한국인2 국적이 대한민국이고 이름이 유재석이고, 주민등록번호 없음
		
		// 3. 필드 2개 생성자 객체
		Korean 한국인3 = new Korean("강호동", "125125-125125");
				//한국인3 국적이 대한민국이고 이름이 강호동이고, 주민등록번호 있 음
		
		// 4. 필드 3개 생성자 객체
		Korean 한국인4 = new Korean("일본", "신동엽", "55515-25252");
				//한국인3 국적이 일본이고 이름이 신동엽이고, 주민등록번호 있 음
	}

}
