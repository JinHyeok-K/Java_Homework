package part2_04_08_5;

public class 모바일뱅크프로그램_2인과제 {
	// 모바일 뱅크 프로그램 [ 2인 과제 ]
			// 요구사항
			// 회원 주요기능 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			// 계좌 주요기능 : 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록
					// *회원이 계좌 만들어서 사용
					// *관리자(은행원) 대출 상품을 등록 하면 등록된 대출상품들을 회원들이 
					// 선택해서 대출 사용
			// 설계 : 통장 , 대출 , 회원
					// 대출클래스 = 도서클래스 
						// 필드 : 1.대출이름 2.금액 3.이자 4.대출인[id] 5.상환여부
					// 통장클래스
						// 필드 : 1.계좌번호(중복x) 2.예금액 3.이름[id]
		
		//통장
		//대출
//	model 1 : 계좌번호, 이름,phone, id,password, 예금액, 대출액
// model 2 : 
		
		// 회원가입 클래스(member) - id,pw,이름,전화번호 => 계좌번호 random 발생 -> 배열 저장
		// 통장 클래스( account ) = 계좌번호 , 이름, 예금액
		//
	public static void main(String[] args) {
		모바일뱅크프로그램_2인과제 app = new 모바일뱅크프로그램_2인과제();
		System.out.println(" 환영합니다. ");
		app.menu();
	}
	
	void menu() {
		
		
		Bank_total_controller contorller = new Bank_total_controller();
		Bank_account_controller acc_con = new Bank_account_controller();
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("본 은행 회원이십니까?"); 
			System.out.println("1.예 2.아니오"); int ch1= contorller.scanner.nextInt();
			if(ch1==2) {
				System.out.println("회원가입하시겠습니까?"); 
				System.out.println("1.예 2.아니오"); int ch2= contorller.scanner.nextInt(); 
				
				if(ch2==1) { //회원가입 메뉴 가입 후 초기메뉴
					
					boolean result = acc_con.회원가입();
						if(result)
							System.out.println("회원가입이 완료되었습니다.");
						else
							System.err.println("회원가입 실패");
				}
				else if(ch2==2) {
					System.out.println("안녕히 가십시오");
					break;
				}
				else {}
			}
			else if(ch1==1) { //로그인 메뉴 
				contorller.startMenu();
			}
		}
	}
	
}



