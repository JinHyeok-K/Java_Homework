package Day01;

import java.util.Scanner;

public class Day01_noodle { // class start

	public static void main(String[] args) { // main start
		
		// 라면레시피 [ 입출력 / 반복문 / 제어문 ] 
		/* if문 덕지덕지 사용
		 * ==> 1. 보유라면 유, 무 선택
		 * ==> 2. 라면 조리 시작 유, 무 선택
		 * 	   ==> 2-1 물양 조절(300,550,800ml) 선택
		 *     ==> 2-2 토핑 추가 선택
		 *     end 	
		 *   
		 */
		Scanner scanner = new Scanner(System.in); // 입력 객체 선언
		int time = 90; // 끓는 시간용 정수 선언
		
		
		// 라면 유, 무
//		while(true) { // 라면 끓이기 while start 
		// 최초 메뉴 on	
		System.out.println(" =======================================");
		System.out.println(" =========== 라면 레씨삐! ===========");
		System.out.println(" 보유중인 라면이 있습니까?");
		System.out.println(" 1. 네   | 	2. 아니오 ");
		System.out.println(" 선택 : >");	int 라면보유 = scanner.nextInt();
			if(라면보유==1) { // 
				System.out.println(" 라면을 조리 하시겠습니까? ");
				System.out.println(" 1. 네   | 	2. 아니오 ");	
				System.out.println(" 선택 : >");	int 라면조리 = scanner.nextInt();
				
				
				boolean waterok = true;
				while(waterok) {
					if(라면조리 == 1) { 
						System.out.println(" 라면 조리 시작 ");
						System.out.println(" 넣을 물을 선택 해 주세요 ");
						System.out.println(" 1.300ml 2.550ml 3.800ml ");
						System.out.println(" 선택 : >");	int 물양 = scanner.nextInt();
						if(물양 == 1) { // 물 양 선택 R3
							System.out.println(" 제조사의 적정 물 양은 550ml입니다 그래도 진행 하시겠습니까? ");
							System.out.println(" 1.예 2.아니오 ");
							System.out.println(" 선택 : >");	int 물양330 = scanner.nextInt();
							if(물양330==1) { //라면 조리 시작 R3_1 
								System.out.println(" ========= 조리법 선택 ========= ");
								System.out.println(" 1. 끓기전 물에 스프 넣고 끓이기 2. 끓기전 물에 모두 다 넣고 끓이기 3. 물 끓고 나서 다 넣고 끓이기");
								System.out.println(" 선택 : >");	int 조리법1 = scanner.nextInt();
									if(조리법1==1) { 
										System.out.println(" 끓기 전 물에 스프 넣고 끓입니다.");
										for (int i=1;i<=time;i++) { // time check
											System.out.println("물 끓는 중 :" +(i*3)+"s");
										}
										System.out.println(" 물이 끓었습니다  면을 넣으시겠습니까? ");
										System.out.println(" 1. 예 		2. 아니오	");
										System.out.println(" 선택 : >");	int 조리법1_1 = scanner.nextInt();
										if(조리법1_1==1) { 
											System.out.println(" 면을 넣었습니다. ");
											for (int i=1;i<=time;i++) {
												System.out.println("라면 끓는 중 :" +(i*2)+"s");
											}
											System.out.println(" 토핑을 넣으시겠습니까?");
											System.out.println(" 1. 예 		2. 아니오	");
											System.out.println(" 선택 : >");	int 조리법1_토핑 = scanner.nextInt();
											if(조리법1_토핑==1) { 
												System.out.println(" 넣을 토핑을 선택해 주세요");
												System.out.println(" 1. 계란 2.치즈 ");
												System.out.println(" 선택 : >");	int 조리법1_토핑_선택 = scanner.nextInt();
												if(조리법1_토핑_선택==1) {
													for (int i=1;i<=time;i++) {
														System.out.println("라면 끓는 중 :" +(i)+"s");
													}
													System.out.println(" 계란 라면을 완성했습니다.");
													break;
												}
												else {
													for (int i=1;i<=time;i++) {
														System.out.println("라면 끓는 중 :" +(i)+"s");
													}
													System.out.println(" 치즈 라면을 완성했습니다.");
													break;
												}
											}
											else 
												for (int i=1;i<=time;i++) {
												System.out.println("라면 끓는 중 :" +(i)+"s");
												}
												System.out.println(" 라면을 완성했습니다.");
												break;
										}
										else System.out.println(" 물이 다 쫄아서 라면을 끓일 수 없습니다 다음에 다 시 끓여여");
										break;
									}
									else if( 조리법1==2) {
										System.out.println(" 2. 끓기전 물에 모두 다 넣고 끓입니다.");
										for (int i=1;i<=time;i++) {
											System.out.println("라면 끓는 중 :" +(i*2)+"s");
											}
										
										System.out.println(" 토핑을 넣으시겠습니까?");
										System.out.println(" 1. 예 		2. 아니오	");
										System.out.println(" 선택 : >");	int 조리법1_1 = scanner.nextInt();	
										if(조리법1_1==1) { 
											System.out.println(" 넣을 토핑을 선택해 주세요");
											System.out.println(" 1. 계란 2.치즈 ");
											System.out.println(" 선택 : >");	int 조리법1_토핑_선택 = scanner.nextInt();
											if(조리법1_토핑_선택==1) {
												for (int i=1;i<=time;i++) {
													System.out.println("라면 끓는 중 :" +(i)+"s");
												}
												System.out.println(" 계란 라면을 완성했습니다.");
												break;
											}
											else {
												for (int i=1;i<=time;i++) {
													System.out.println("라면 끓는 중 :" +(i)+"s");
												}
												System.out.println(" 치즈 라면을 완성했습니다.");
												break;
											}
										}
										else 
											for (int i=1;i<=time;i++) {
											System.out.println("라면 끓는 중 :" +(i)+"s");
											}
											System.out.println(" 라면을 완성했습니다.");
											break;
									}
									else {System.out.println(" 물이 끓고 난 뒤 라면을 끓입니다.");
										for (int i=1;i<=time;i++) {
										System.out.println("물 끓는 중 :" +(i)+"s");
										}
										System.out.println(" 토핑을 넣으시겠습니까?");
										System.out.println(" 1. 예 		2. 아니오	");
										System.out.println(" 선택 : >");	int 조리법1_토핑 = scanner.nextInt();	
										if(조리법1_토핑==1) { 
											System.out.println(" 넣을 토핑을 선택해 주세요");
											System.out.println(" 1. 계란 2.치즈 ");
											System.out.println(" 선택 : >");	int 조리법1_토핑_선택 = scanner.nextInt();
											if(조리법1_토핑_선택==1) {
												for (int i=1;i<=time;i++) {
													System.out.println("라면 끓는 중 :" +(i)+"s");
												}
												System.out.println(" 계란 라면을 완성했습니다.");
												break;
											}
											else {
												for (int i=1;i<=time;i++) {
													System.out.println("라면 끓는 중 :" +(i)+"s");
												}
												System.out.println(" 치즈 라면을 완성했습니다.");
												break;
											}
										}
										else 
											for (int i=1;i<=time;i++) {
											System.out.println("라면 끓는 중 :" +(i)+"s");
											}
											System.out.println(" 라면을 완성했습니다.");
											break;
									
									}
							}
						}
						else if(물양==2) {
							for (int i=1;i<=time;i++) {
								System.out.println("라면 끓는 중 :" +(i*2)+"s");
							}
							System.out.println(" 토핑을 넣으시겠습니까?");
							System.out.println(" 1. 예 		2. 아니오	");
							System.out.println(" 선택 : >");	int 조리법1_1 = scanner.nextInt();	
							if(조리법1_1==1) { 
								System.out.println(" 넣을 토핑을 선택해 주세요");
								System.out.println(" 1. 계란 2.치즈 ");
								System.out.println(" 선택 : >");	int 조리법1_토핑_선택 = scanner.nextInt();
								if(조리법1_토핑_선택==1) {
									for (int i=1;i<=time;i++) {
										System.out.println("라면 끓는 중 :" +(i)+"s");
									}
									System.out.println(" 계란 라면을 완성했습니다.");
									break;
								}
								else {
									for (int i=1;i<=time;i++) {
										System.out.println("라면 끓는 중 :" +(i)+"s");
									}
									System.out.println(" 치즈 라면을 완성했습니다.");
									break;
								}
							}
							else 
								for (int i=1;i<=time;i++) {
								System.out.println("라면 끓는 중 :" +(i)+"s");
								}
								System.out.println(" 라면을 완성했습니다.");
								break;
						}
						
						else //(물양==3){
							System.out.println(" 제조사의 적정 물 양은 550ml입니다 그래도 진행 하시겠습니까? ");
							System.out.println(" 1.예 2.아니오 ");
							System.out.println(" 선택 : >");	int 물양330 = scanner.nextInt();
							if(물양330==1) { //라면 조리 시작 R3_1 
								System.out.println(" 물이 끓고 다 넣고 끓입니다.");
								for (int i=1;i<=time;i++) { // time check
								System.out.println("물 끓는 중 :" +(i*3)+"s");
								}
								
								System.out.println(" 물이 끓었습니다  면을 넣으시겠습니까? ");
								System.out.println(" 1. 예 		2. 아니오	");
								System.out.println(" 선택 : >");	int 조리법1_1 = scanner.nextInt();
								if(조리법1_1==1) { 
									System.out.println(" 면을 넣었습니다. ");
									for (int i=1;i<=time;i++) {
										System.out.println("라면 끓는 중 :" +(i*2)+"s");
									}
									System.out.println(" 토핑을 넣으시겠습니까?");
									System.out.println(" 1. 예 		2. 아니오	");
									System.out.println(" 선택 : >");	int 조리법1_토핑 = scanner.nextInt();
									if(조리법1_토핑==1) { 
										System.out.println(" 넣을 토핑을 선택해 주세요");
										System.out.println(" 1. 계란 2.치즈 ");
										System.out.println(" 선택 : >");	int 조리법1_토핑_선택 = scanner.nextInt();
										if(조리법1_토핑_선택==1) {
											for (int i=1;i<=time;i++) {
												System.out.println("라면 끓는 중 :" +(i)+"s");
											}
											System.out.println(" 계란 라면을 완성했습니다.");
											break;
										}
										else {
											for (int i=1;i<=time;i++) {
												System.out.println("라면 끓는 중 :" +(i)+"s");
											}
											System.out.println(" 치즈 라면을 완성했습니다.");
											break;
										}
									}
									else 
										for (int i=1;i<=time;i++) {
										System.out.println("라면 끓는 중 :" +(i)+"s");
										}
										System.out.println(" 라면을 완성했습니다.");
										break;
								}
								else System.out.println(" 물이 다 쫄아서 라면을 끓일 수 없습니다 다음에 다 시 끓여여");
								break;
							}
						
					}	
					else if (라면조리==2) {
						waterok=false;
							if (waterok==false) {
								 { System.err.println(" 나중에 조리하세여 ");}	
							}
					break;}
				}
				
					
			}
			
			else {System.err.println(" 라면도 없는데 어떻게 끓여요 사와요");}			
//		}// 라면 끓이기 while end
	} // main end
	
}// class end
