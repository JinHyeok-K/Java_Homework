package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

public class Day13_02 {
	
	public static void main(String[] args) {
		// p539
			// Date Ŭ���� (java.util) : �ý��� ��¥ / �ð�
		Date date = new Date(); // date ��ü ����
		System.out.println("���� ��¥/�ð� : "+ date);
		System.out.println("��ü���� �޼ҵ� :"+date.toString());
			// SimpleDateFormat Ŭ���� : ��¥ /�ð� ���� (���� =���) ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// ��¥�� ���� �����ϱ� [ date ���� => String �� ��ȯ ]
		System.out.println("��¥���ĺ��� : "+sdf.format(date));
										// ���İ�ü.format(��¥��ü)
		// p.540
			// Calendar class : �ü�� �ð����� ��¥ / �ð��� ���� ����
		Calendar now = Calendar.getInstance(); // Calendar Ŭ���� �� ��ü ȣ��;
			// �̹� Calendar Ŭ���� �� ��ü ���� !!   = ��ü����(new�� ���) �� �ʿ䰡 ����
		System.out.println(" ���� : "+ now.get(Calendar.YEAR));// ����
		System.out.println(" �� : "+ now.get((Calendar.MONTH)+1));// �� : 0~11 [0:1��]
		System.out.println(" �� : "+ now.get(Calendar.DAY_OF_MONTH)); //�� 
													// �� �������� �ϼ�
		System.out.println(" ���� : "+ now.get(Calendar.DAY_OF_WEEK));  //����
													// �� ������ �ϼ� [1�� 2�� 3ȭ 4�� 5�� 6�� 7��]
		
		// ����[����] -> �ѱ� ��ȯ
		int week = now.get(Calendar.DAY_OF_WEEK );
		String ���� = null;
		switch(week) {
		case 1 : ���� = "�Ͽ���" ; break;
		case 2 : ���� = "������" ; break;
		case 3 : ���� = "ȭ����" ; break;
		case 4 : ���� = "������" ; break;
		case 5 : ���� = "�����" ; break;
		case 6 : ���� = "�ݿ���" ; break;
		case 7 : ���� = "�����" ; break;
		
		}
		
		
		System.out.println("����[�ѱ�]: "+ ����);
		
		// ���� /����
		System.out.println(" ����/���� : "+ now.get(Calendar.AM_PM)); // 0:����  1:����
		int ampm = now.get(Calendar.AM_PM);
		String �������� = null;
		if(ampm==0) �������� = "����";
		else �������� ="����";
		System.out.println("����/���� : "+��������);
		
		System.out.println("�� : "+now.get(Calendar.HOUR));
		System.out.println("�� : "+now.get(Calendar.MINUTE));
		System.out.println("�� : "+now.get(Calendar.SECOND));
		
		// ZonedDateTime class : ���� �����ð�
		ZonedDateTime ������  = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("������ : "+������);
			������ = ������.now(ZoneId.of("Asia/Seoul"));
			System.out.println("���� �� : "+������);
			������ = ������.now(ZoneId.of("America/New_York"));
			System.out.println("���� �� : "+������);
		
		
		
	}
}
