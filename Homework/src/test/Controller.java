package test;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	// 1. �迭 ��� 
		//public static Car[] carlist = new Car[100];
		// 2. ����Ʈ ���
		static Scanner scanner = new Scanner(System.in);
		static LocalDate ���������� = LocalDate.now();
		static LocalTime �����ú� = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
		public static ArrayList<Car> carlist = new ArrayList<>(); 
		
		// ���� �޼ҵ� 
		public static boolean ����() {
			
			// ���� �ڵ� �ۼ� 
				// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			System.out.print(" ������ȣ �Է� :"); String ������ȣ= scanner.next();
			
			for(Car temp : Controller.carlist) {
				if(temp!=null && temp.get������ȣ().equals(������ȣ)  ) {
					System.out.println("������ ������ ��ϵǾ� �ֽ��ϴ�.");
					return false;
				}
			}
			
			Car car = new Car(����������, ������ȣ, �����ú�, null, 0);
			Controller.carlist.add(car);
			return true;
				// * ������ȣ �ߺ�üũ
				// 2. ������¥(���糯¥) �� ���Ѵ�( ????? : )
				// 3. �����ð�(����ð�) �� ���Ѵ�( ????? : )
				// * �����ð� , �ݾ��� ������ x 
				// 4. ������ȣ,������¥,�����ð� => 3������ -> 1��üȭ
				// 5. ������ü�� �迭�̳� ����Ʈ �� ���� 
			
		}
		// ���� �޼ҵ� 
		public static boolean ����() {
			// ���� �ڵ� �ۼ�
				// 1. �Է¹��� ������ȣ(�μ�) �����´�.
			System.out.print(" ������ȣ �Է� :"); String ������ȣ= scanner.next();
			
			for(Car temp : Controller.carlist) {
				if(temp!=null && temp.get������ȣ().equals(������ȣ)) {
					
					LocalDate ���������� = LocalDate.now();
					LocalTime �����ú� = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
					
					int �������� = (int) ����������.until(����������, ChronoUnit.DAYS);
					int �ú� = (int) �����ú�.until(�����ú�, ChronoUnit.MINUTES);
					
					int �������ð�= (��������*24*60)+�ú�;
					int ������� =0;
					
					if(�������ð�<30) {
						������� = 0;
					}
					else { 
						������� = ((�������ð�-30)/10)*1000;
					}
					temp.set�ݾ�(�������);
					temp.set�����ð�(�����ú�);
					System.out.println("���� ���: "+temp.get�ݾ�());
					return true;
				}
			}
				// 2. �迭 or ����Ʈ�� ������ ������ȣ�� ã�Ƽ� 
				// 3. �����ð�(����ð�) �� ���Ѵ� (????? : )
				// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
				// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
			System.out.println("������ ������ �ƴմϴ�.");
			return false;
		}
}
