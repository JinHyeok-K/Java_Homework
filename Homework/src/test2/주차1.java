package test2;

import java.util.ArrayList;


public class 주차1 {

	
	
	public static void main(String[] args) {
		
		 주차1 주차 = new 주차1();
		 주차.menu();
		 
	}
		
	void menu() {
		
		Controller controller =new Controller();
		ArrayList<Car> carlist = Controller.carlist; 

		while(true) {
//		
			
				
				System.out.println("----------------------------- 주차 현황 표 -----------------------------");
				System.out.println("\n\t\t\t"+controller.입차연월일+"  "+controller.입차시간);
			for(Car temp : controller.carlist)
				if(temp!=null) {
				System.out.println("\n   날짜\t차량번호\t\t입차시간\t\t출차시간\t\t요금");
				System.out.printf("%s\t\t%s\t%s\t\t%s\t\t%d",temp.get날짜(),
						temp.get차량번호(),temp.get입차시간(),temp.get출차시간(),temp.get금액());//				controller.carlist.get(1).get날짜());
				}
			System.out.println("\n---------------------------------------------------------------------");
			System.out.print("\t\t\t1.입차\t\t2.출차\t\t:"); int ch=Controller.scanner.nextInt();
			if(ch==1) {
				boolean result =Controller.입차();
					if(result)
						System.out.println("주차 완료 되었습니다.");
					else
						System.out.println("주차 실패 하였습니다.");
			}
			else if(ch==2) {
				boolean result = Controller.출차();
					if(result) {
						System.out.println("출차 완료. 안녕히 가십시오");
					}
					else
						System.out.println("출차 실패");
			}
		}
	}
		
	
}
