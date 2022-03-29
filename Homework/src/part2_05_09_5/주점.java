package part2_05_09_5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class 주점 {
	public static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
//	
	static int hour = 6;

	public static void main(String[] args) {
		
		Al_customer customer = new Al_customer();
		
		for (int i=1 ; i<=hour*24;i++) {
			int random_bottle = random.nextInt(10)+1;
			int problem_refrigeator =  customer.sell_start();
			switch( problem_refrigeator ) {
		 	case 1:
		 		System.out.println(" 1번냉장고 한라산으로 재고 등록");
		 		customer.냉장고1 = new 한라산(random_bottle,0,"1번냉장고");
		 		// 슈퍼클래스 객체명 = new 서브클래스() ;
		 		// 상속을 받으면 가능 !!!!!!!!
		 		break;// switch 탈출 
		 	case 2:
		 		System.out.println(" 2번냉장고 참이슬로 재고 등록");
		 		customer.냉장고2 = new 참이슬(random_bottle,0,"2번냉장고");
		 		break;
		 	case 3: 
		 		System.out.println(" 3번냉장고 처음처럼으로 재고 등록");
		 		customer.냉장고3 = new 처음처럼(random_bottle,0,"3번냉장고");
		 		break;
			
			
			}
			System.out.println("-----------------------");
		}
//		
		
		
	}
}
