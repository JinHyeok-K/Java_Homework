package test;

public class App_Parking_Car {
	
	public static void main(String[] args) {
		
		App_Parking_Car app = new App_Parking_Car();
		app.menu();
	}
	
	
	void menu() {
		
		while(true) {
			System.out.println("---------------- 주차시스템 ---------------");
			System.out.println(Controller.입차연월일+"  "+  Controller.입차시분);
			System.out.println("날짜\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");
			for(Car temp : Controller.carlist) {
				if(temp!=null && temp.get출차시간()==null) {
					System.out.printf("\n%s\t\t%s\t\t%s\t\t\t\t",temp.get날짜(),temp.get차량번호(),
							temp.get입차시간()+"주차중"+"정산 전");
					System.out.println("---------------------------------------");
				}
				if(temp!=null &&temp.get출차시간()!=null){
					System.out.printf("\n%s\t\t%s\t\t%s\t\t%s\t\t%d",temp.get날짜(),temp.get차량번호(),
							temp.get입차시간(),temp.get출차시간(),temp.get금액());
				}
			}
				System.out.println("\n----------------------------------------");
				System.out.println("\t\t\t 1. 입차 \t 2 출차 "); int ch= Controller.scanner.nextInt();
				
			if(ch==1) {
				boolean result = Controller.입차();
						if(result)
							System.out.println("주차 완료");
						else
							System.out.println("주차 실패");
			}
			else if(ch==2) {
				boolean result = Controller.출차();
						if(result)
							System.out.println("출차 완료");
						else
							System.out.println("출차 실패");
				}
				
			}
			
			
			
			
			
	}
		
}
	
	

