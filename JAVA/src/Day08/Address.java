package Day08;

import java.util.Random;

import Day07.Member;

public class Address {
	
	// 1. 필드
	
		//1.입금 
		//2.출금 
		//3.이체  == > 이체 목록 class
		//4.대출  == > 대출 목록 class
		//5.계좌목록
	String 이름;
	String id;
	String password;
	int Adds;
	int 잔액;
	int 대출;
	
	int 입금;
	int 출금;
	String 이체;
	String 계좌목록;
	String 계좌관리;
	String 대출관리;
	 
	
	
	// 2. 생성자
	public Address() {
		
	}

	public Address(String 이름, int 입금,String 이체, int 출금, int 대출, String 계좌목록,String 계좌관리,String 대출관리 ) {
		this.이름 = 이름; 		this.입금 = 입금; 		this.출금 = 출금; 		this.이체 = 이체; 
		this.대출 = 대출; 		this.계좌목록 = 계좌목록; 	this.계좌관리 = 계좌관리; 	this.대출관리 = 대출관리;
	}
	public Address(String 이름, String id, String password, int Adds, int 잔액, int 대출) {
		this.이름 = 이름; 		this.id = id; 		this.password = password; 		this.Adds = Adds; 
		this.잔액 = 잔액; 		this.대출 = 대출;
	}
	

	void 입금(String loginid) {
		System.out.print("입금 금액");
		int input = Day08_05_은행계좌.scanner.nextInt();
		for (Day08.Member temp : Day08_05_은행계좌.members) {
			
			if(temp != null && temp.id.endsWith(loginid)) {
				temp.잔액 +=input;
				System.out.println("현재 "+temp.잔액+" 원이 있습니다.");
				return;
			}
			
		}
		
	}
	void 출금(String loginid) {
		
		System.out.print(" 출금 금액 : ");		int output = Day08_05_은행계좌.scanner.nextInt();
		System.out.print("비밀 번호를 입력하세요"); String pw = Day08_05_은행계좌.scanner.next();
		
		for (Day08.Member temp : Day08_05_은행계좌.members) {
			if(temp !=null && temp.id.equals(loginid) && temp.password.equals(pw)) {
				if(temp.잔액<output) {
					System.out.println("잔액이 모자랍니다.");
					return;
				}
				else if(temp.잔액>=output) {
						temp.잔액 -= output;
				System.out.println("잔액이 "+temp.잔액 + " 있습니다.");
				}
			}
			else if(temp!=null && temp.id.equals(loginid) != temp.password.equals(pw)) {
				System.err.println(" 비밀번호가 틀립니다. ");
				return;
			}
			
		}
		
	}
	void 이체(String loginid) {
		System.out.print(" 이체하실 계좌번호를 입력하세요"); int adds= Day08_05_은행계좌.scanner.nextInt();
		System.out.print(" 출금 금액 : ");		int output = Day08_05_은행계좌.scanner.nextInt();
		System.out.print("비밀 번호를 입력하세요 :"); String pw = Day08_05_은행계좌.scanner.next();
		int i =0;
		for (Day08.Member temp : Day08_05_은행계좌.members) {
			if(temp !=null && temp.id.equals(loginid) && temp.password.equals(pw)) {
				if(temp.잔액<output) {
					System.out.println("잔액이 모자랍니다.");
					return;
				}
				else if(temp.잔액>=output) {
					for(Day08.Member temp2 : Day08_05_은행계좌.members) {
						if(temp2 !=null && temp2.add_num == adds)  {
							temp.잔액-=output;
							System.out.println("잔액이 " + temp.잔액 +"남았습니다");
							temp2.잔액+=output;
						return;
						}
						
					}
					
						
				}
					

			}
			else if(temp!=null && temp.id.equals(loginid) != temp.password.equals(pw)) {
				System.err.println(" 비밀번호가 틀립니다. ");
					break;
			}
	
//				else  temp.잔액-=output;
//					System.out.println("잔액이 "+ + "");
		}
		return;
	}
	
	
	void 대출(String loginid) {
		Random random= new Random();
		double add_num = random.nextDouble(9.9)+1; 
		
		System.out.print("대출 금액");  int 대출금액 = Day08_05_은행계좌.scanner.nextInt();
		System.out.print("\n비밀 번호를 입력하세요 :"); String pw = Day08_05_은행계좌.scanner.next();
		
		for (Day08.Member temp : Day08_05_은행계좌.members) {
			if(temp !=null && temp.id.equals(loginid) && temp.password.equals(pw)) {
				System.out.printf(" 현재 대출 이율은 %.2f 입니다 대출받으시겠습니까?", add_num );
				System.out.print("1.예  2.아니오:"); int se1 = Day08_05_은행계좌.scanner.nextInt();
				if(se1==1) {
					temp.잔액 += 대출금액; 
					대출금액 -= 대출금액;
					return;
				}
				else if(se1==2) {
					System.out.println(" 안녕히 가십시오 ");
					return;
				}
				else System.out.println("잘못된 입력입니다.");
			}
			
			else if(temp!=null && temp.id.equals(loginid) != temp.password.equals(pw)) {
				System.err.println(" 비밀번호가 틀립니다. ");
					return;
			}
		}
		
		
	}
	void 계좌목록() {
		
	}
	
	
	/*
	 * // Day08_05.회원들.add System.out.println("======= 계좌 메뉴 =======");
	 * System.out.println("1.입금 2.출금 3.이체 4.대출 5.계좌목록"); System.out.print(" 선택 : ");
	 * int 선택 = Day08_05.scanner.nextInt(); // 입금 if(선택==1) {
	 * System.out.print(" 입금 하시는 금액 : "); int 금액=Day08_05.scanner.nextInt();
	 * 
	 * 
	 * } else if(선택==2) { System.out.print(" 출금 하시는 금액 : "); int
	 * 금액=Day08_05.scanner.nextInt(); } else if(선택==3) {
	 * 
	 * } else if(선택==4) {
	 * 
	 * } else if(선택==5) {
	 * 
	 * } else System.err.println("잘못된 입력입니다."); }
	 */
	
}
		
		

