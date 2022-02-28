package Day01;

import java.util.Scanner;

public class Day01_06 { //c.s

	public static void main(String[] args) { // m.s
		
		Scanner scanner = new Scanner(System.in);
		
		// System.out.printf(" 순번 : "); String num = scanner.next();
		System.out.printf(" 작성자 : "); String A = scanner.next();
		System.out.printf(" 내용 : "); String B = scanner.next();
		System.out.printf(" 날짜 : "); String date = scanner.next();
		
		/* ex1) 작성자 / 내용 / 날짜만
		 */
		System.out.println("----------- 방 문 록 ----------");
		System.out.println("|순번|작성자|내용     |날짜|");
		System.out.println("| 1 |"+A+"|"+B+" |"+date+"|");
		System.out.println("-----------------------------");
		
		
		/* ex2) 순번 / 작성자 / 내용 / 날짜
		System.out.println("----------- 방 문 록 ----------");
		System.out.println("|순번|작성자|내용     |날짜|");
		System.out.println("|"+num+ "|"+A+"|"+B+" |"+date+"|");
		System.out.println("-----------------------------");
		*/
		
		
	}//m.e
	
	
} //c.e
