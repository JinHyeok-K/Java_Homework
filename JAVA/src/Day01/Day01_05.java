package Day01;

import java.util.Scanner;

public class Day01_05 { //c.s

	public static void main(String[] args) { //m.s
		
		//���� 1
		
		// �Է� - > ���� - > ���
		
		
		// 1. �Է� ��ü ����
		Scanner scanner = new Scanner(System.in);
		// 2. �Է��� ��� �ȳ� 
		// 3. �Է� ���� ������ �ٸ� ���� ���� ( ���ο� data�� ���� ���� data �����)
		
		System.out.printf(" ID : ");  String ID = scanner.next();
		System.out.printf(" PW : ");  String PW = scanner.next();
		System.out.printf(" ���� : ");  String name = scanner.next();
		System.out.printf(" E-mail : ");  String email = scanner.next();

		// 4 ���
		System.out.println(">>>>>> ȸ�� ���� �Ϸ� | �ϱ� ������ Ȯ���� �ּ��� >>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println( ID +"\t" + PW+"\t"+ name +"\t"+email);
		
		scanner.close();
		
		
		
		
		
		/*
		Scanner �Է°�ü = new Scanner(System.in);
		
		System.out.printf(" ID : ");	String ID = �Է°�ü.next();
		System.out.printf(" PW : ");	string PW = �Է°�ü.next();
		System.out.printf(" �̸� : ");	string �̸� = �Է°�ü.next();
		System.out.printf(" E-mail : ");	string Email = �Է°�ü.next();
		*/
		
		
		
		
		
		// 
				
		
		
		
		
	} //m.e
	
} //c.e
