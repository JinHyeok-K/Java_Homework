package test1;

import java.util.Scanner;

public class test2 {
	
//		1. 성적표는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//		2. 메뉴에서 1번 선택시 학생점수를 추가 합니다. [ 5점 ]
//		3. 메뉴에서 2번 선택시 학생점수를 삭제 합니다. [ 5점 ]
//		4. 데이터는 키보드로 입력받아 배열에 저장합니다. [ 5점 ]
//		5. 성적 입력은 5명으로 하되, 최대 100명 이 가능하도록 작성합니다. [ 5점 ]
//		6. 번호 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다. [ 5점 ]
//		7. 평균은 소숫점 이하 2자리까지로 합니다. [ 5점 ]
//		8. 총점을 이용하여 석차를 구합니다. [ 5점 ]
//		9. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]

	public static void main(String[] args)	{
		
	
		Scanner scanner =new Scanner(System.in);
		//기본 출력
		System.out.println("-------------------------------------");
		System.out.println("\t성\t적\t표\t");
		System.out.println("-------------------------------------");
		System.out.println("번호  이름  국어  영어  수학  총점  평균  석차");
		System.out.println("-------------------------------------");
//		System.out.println("-------------------------------------");
//		System.out.println(" 등록 메뉴");
//		System.out.println("1.학생점수 등록 2. 학생점수 삭제"); 
		int ch = scanner.nextInt();
//		int 삭제 = scanner.nextInt();
			
//			int ch = scanner.nextInt();
			if(ch == 1) { // if 1 s
				System.out.println("학생 이름을 입력하세요"); String name = scanner.next();
				System.out.println("국어 성적을 입력하세요"); int kor = scanner.nextInt();
				System.out.println("수학 성적을 입력하세요"); int math = scanner.nextInt();
				System.out.println("영어 성적을 입력하세요"); int eng = scanner.nextInt();
			}
			if(ch == 2) { // if 1 s
				System.out.println("학생 이름을 입력하세요"); String name = scanner.next();
				System.out.println("국어 성적을 입력하세요"); int kor = scanner.nextInt();
				System.out.println("수학 성적을 입력하세요"); int math = scanner.nextInt();
				System.out.println("영어 성적을 입력하세요"); int eng = scanner.nextInt();
			}	
				
	} // me
} // ce