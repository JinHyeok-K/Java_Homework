package Day01;

import java.util.Scanner;

public class Day01_06 { //c.s

	public static void main(String[] args) { // m.s
		
		Scanner scanner = new Scanner(System.in);
		
		// System.out.printf(" ���� : "); String num = scanner.next();
		System.out.printf(" �ۼ��� : "); String A = scanner.next();
		System.out.printf(" ���� : "); String B = scanner.next();
		System.out.printf(" ��¥ : "); String date = scanner.next();
		
		/* ex1) �ۼ��� / ���� / ��¥��
		 */
		System.out.println("----------- �� �� �� ----------");
		System.out.println("|����|�ۼ���|����     |��¥|");
		System.out.println("| 1 |"+A+"|"+B+" |"+date+"|");
		System.out.println("-----------------------------");
		
		scanner.close();
		/* ex2) ���� / �ۼ��� / ���� / ��¥
		System.out.println("----------- �� �� �� ----------");
		System.out.println("|����|�ۼ���|����     |��¥|");
		System.out.println("|"+num+ "|"+A+"|"+B+" |"+date+"|");
		System.out.println("-----------------------------");
		*/
		
		
	}//m.e
	
	
} //c.e
