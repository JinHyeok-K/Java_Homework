package part2_05_09_5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class ���� {
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
		 		System.out.println(" 1������� �Ѷ������ ��� ���");
		 		customer.�����1 = new �Ѷ��(random_bottle,0,"1�������");
		 		// ����Ŭ���� ��ü�� = new ����Ŭ����() ;
		 		// ����� ������ ���� !!!!!!!!
		 		break;// switch Ż�� 
		 	case 2:
		 		System.out.println(" 2������� ���̽��� ��� ���");
		 		customer.�����2 = new ���̽�(random_bottle,0,"2�������");
		 		break;
		 	case 3: 
		 		System.out.println(" 3������� ó��ó������ ��� ���");
		 		customer.�����3 = new ó��ó��(random_bottle,0,"3�������");
		 		break;
			
			
			}
			System.out.println("-----------------------");
		}
//		
		
		
	}
}
