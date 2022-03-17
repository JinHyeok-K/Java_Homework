package test;

import java.util.Scanner;

public class ex {
	
	public static void main(String[] args) {
		
		학생[] 학생명부 = new 학생[100];
		int[] 석차 = new int[학생명부.length];
		Scanner scanner =new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("===========================");
				System.out.println("qmfqkqmffk");
				System.out.println("===========================");
				
				//석차 초기화
				for (int i=0; i<학생명부.length;i++) {
					석차[i] = 1;
				}
				for(int i =0;i<학생명부.length-1;i++) {
					for(int j=i+1;j<학생명부.length;j++) {
						if(학생명부[j]!=null&& 학생명부[i].get평균() < 학생명부[j].get평균() ) {
							석차[i]++;
						}
						else if(학생명부[j]!=null&& 학생명부[i].get평균() > 학생명부[j].get평균() ) {
							석차[j]++;
						}
					}
				}
				
				for (int i = 0; i<학생명부.length;i++) {
					if(학생명부[i]!=null)
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d\n",
							(i+1),학생명부[i].get이름(),학생명부[i].get국어(),학생명부[i].get영어(),
							학생명부[i].get수학(),학생명부[i].get총점(),학생명부[i].get평균(i),석차[i]);
				}
				
					
				
				
				
				
				
				
			}catch(Exception e) {
				
			}
		}
	}
}
