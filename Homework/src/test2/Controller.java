package test2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;



public class Controller {
	
//	// 1. �迭
//	public static Car[] carList = new Car[100];
//	// 2. ����Ʈ
	public static ArrayList<Car> carlist = new ArrayList<>(); 
	static Scanner scanner = new Scanner(System.in);
	
	static LocalDate ���������� = LocalDate.now(); // ���� ��¥
	static LocalTime �����ð� = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
	
	
	//���� �޼ҵ�
	//(public static int(){}
	public static boolean ����() {
		//���� �ڵ� �ۼ�
		
		//1. �Է¹��� ������ȣ(�μ�) �����´�. //* ������ȣ �ߺ�üũ()
		System.out.println("���� ��ȣ");
		String ������ȣ = scanner.next();// ���� ��ȣ �Է�
		
		
		for(Car temp:Controller.carlist)	{
			if(temp!=null && temp.get������ȣ().equals(������ȣ)) {
				System.out.println(" �̹� ��ϵ� ���� ��ȣ �ӹ̴�.");
			}
		}
		
		//2. ������¥(���糯¥) �� ���Ѵ� ( ??) 
		//3. �����ð�(����ð�) �� ���Ѵ�
		
		//4. ������ȣ,������¥,�����ð� -> 3������ ->1��üȭ
		Car car = new Car(����������, ������ȣ, �����ð�, null, 0);
		
		Controller.carlist.add(car);
		System.out.println("���� �Ϸ�");
		return true;
		//5. ������ü �迭�̳� ����Ʈ�� ����
		
				
			
		
		   //* �����ð�, �ݾ��� ���� �� 
			//6. ����ó�� or DBó�� -> ������ ���ص� ��
		
		
	}
	
	
	//���� �޼ҵ�
	public static boolean ����() {
		//���� �ڵ� �ۼ�
			// 1.�Է¹��� ������ȣ(�μ�) �����´�.
		System.out.println("���� ��ȣ"); 
		String ������ȣ = scanner.next();
		
		
		// 2. �迭 or ����Ʈ �� ������ ������ȣ�� ã�Ƽ�
		for(Car temp : Controller.carlist) {
			if(temp!=null && temp.get������ȣ().equals(������ȣ)) {
				LocalDate ���������� = LocalDate.now(); // ���� ��¥
				LocalTime �����ð� = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
//				����������
			
				int ���������� =(int) temp.get��¥().until(����������,ChronoUnit.DAYS);
				int �����ú� =(int) temp.get�����ð�().until(�����ð�, ChronoUnit.MINUTES);
				int �������ð� = (����������*24*60)+�����ú�;
				int ������� =0;
				if(�������ð�<30) {
					 ������� = 0;
				}
				else { ������� = ((�������ð�-30)/10)*1000;}
				temp.set�����ð�(�����ð�);
				temp.set�ݾ�(�������);
				
			}
		}
		
			// 3.�����ð�(����ð�) �� ���Ѵ� (??:)
			// 4.���[�����ð�-�����ð� -> (��-30)/10*1000]   until
			// 5.(����)ã�� ��ü �� �����ð��� �ݾ��� ����.
		
		System.out.println("�ش� ������ �����ϴ�.");
		return false;
	}
	
	public void ����() {
		
		
	}
	
}
