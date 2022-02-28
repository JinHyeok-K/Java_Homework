package Day01;

import java.util.Scanner;

public class Day01_05 { //c.s

	public static void main(String[] args) { //m.s
		
		//문제 1
		
		// 입력 - > 저장 - > 출력
		
		
		// 1. 입력 객체 선언
		Scanner scanner = new Scanner(System.in);
		// 2. 입력할 대상 안내 
		// 3. 입력 받은 데이터 다른 곳에 저장 ( 새로운 data가 오면 기존 data 사라짐)
		
		System.out.printf(" ID : ");  String ID = scanner.next();
		System.out.printf(" PW : ");  String PW = scanner.next();
		System.out.printf(" 성명 : ");  String name = scanner.next();
		System.out.printf(" E-mail : ");  String email = scanner.next();

		// 4 출력
		System.out.println(">>>>>> 회원 가입 완료 | 하기 정보를 확인해 주세요 >>>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.println( ID +"\t" + PW+"\t"+ name +"\t"+email);
		
		
		
		
		
		
		/*
		Scanner 입력객체 = new Scanner(System.in);
		
		System.out.printf(" ID : ");	String ID = 입력객체.next();
		System.out.printf(" PW : ");	string PW = 입력객체.next();
		System.out.printf(" 이름 : ");	string 이름 = 입력객체.next();
		System.out.printf(" E-mail : ");	string Email = 입력객체.next();
		*/
		
		
		
		
		
		// 
				
		
		
		
		
	} //m.e
	
} //c.e
