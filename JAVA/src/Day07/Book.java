package Day07;

public class Book {
	
	// 1. �ʵ�
		// ISBN [������ȣ = �ĺ���]
		// ������
		// �۰�
		// �����뿩����
		// �뿩��ID
	String ISBN;
	String bname;
	String bwritter;
	boolean brental;// = true;
	String mid;
	
	
	// 2. ������
		// 1. �� ������ [�⺻������] : �޼ҵ� ȣ��� (ctrl+�����̽���)
	public Book() { }
		// 2. Ǯ ������ [��� �ʵ� �޴� ������ ] : ���� ���
	public Book(String ISBN, String bname, String bwritter, boolean brental, String mid) {
		this.ISBN = ISBN;
		this.bname = bname;
		this.bwritter = bwritter;
		this.brental = brental;
		this.mid = mid;
	}
	
	// 3. �޼ҵ� 
		// 1. ���� �˻�
	void �����˻�() {
		
	}
		// 2. ���� ���
	void �������() {
		
			
		System.out.println("ISBN \t������ \t�۰� \t���Ⱑ�ɿ��� \t������");
		
		for(Book temp : Day07_05_BookApplication.books) {
//			System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t"+temp.brental+"\t"+mid);
			if(temp!=null) {
				if(temp.brental) {
				System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t"+"�뿩����");
				
				}
				else {
				System.out.println(temp.ISBN+"\t"+temp.bname+"\t"+temp.bwritter+"\t"+"������");
				}
			}
		}
	}
		// 3. ���� ����
	void ��������(String loginid) {
		System.out.println("---- ���� �뿩 ������ ----");
		System.out.println(" ���� ISBN : "); String ISBN = Day07_05_BookApplication.scanner.next();
		for (Book temp : Day07_05_BookApplication.books) {
			if (temp!=null && temp.ISBN.equals(ISBN)
					&& temp.brental){
				System.out.println(" �Ӥ���) �ش� ���� �뿩�մϴ�.");
				temp.brental =false;
				temp.mid= loginid;
				return;
			}
			System.out.println("�˸�)�ش� ���� �뿩�� [�뿩�Ұ�]");			
			}
			System.out.println("�˸�)������ ������ �����ϴ�.");
			return;
		}
		
	
		// 4. ���� �ݳ�
	void �����ݳ�() {
		
	
		
		
	}
		// & ���� �α��� �� ȸ���� �뿩���� ���� ���
	void �����뿩() {}
	
	
	
		// 5. ���� ���
	void �������() {
//		System.out.print(" ����� ������ ��? : "); int b1 = Day07_05_BookApplication.scanner.nextInt();
//		if(b1>0) {
//			int j=0;
//			for(j=0;j<=b1;j++) {
//				brental =true;
//				System.out.println(" ISBN "); 	String ISBN= Day07_05_BookApplication.scanner.next();
//				System.out.println(" ���� �� "); 	String bname= Day07_05_BookApplication.scanner.next();
//				System.out.println(" �۰� "); 	String bwritter= Day07_05_BookApplication.scanner.next();
//				
//				}
//		}
		System.out.println("================= ���� ���===============");
		System.out.print(" ISBN  : "); 	String ISBN= Day07_05_BookApplication.scanner.next();
		
		// ISBN �ߺ� üũ
		for(Book temp: Day07_05_BookApplication.books) {
			if(temp!=null && temp.ISBN.equals(ISBN)) {
				System.err.println("������ ISBN�� �����մϴ�.");
				return; // ���� ��� ���� 
			}
		}
		System.out.print(" ���� �� : "); 	String bname= Day07_05_BookApplication.scanner.next();
		System.out.print(" �۰�  :"); 		String bwritter= Day07_05_BookApplication.scanner.next();
		
		Book book = new Book(ISBN,bname,bwritter,true,null);
		
		int i =0; // �ݺ�Ƚ�� [�ε���]
		for ( Book temp: Day07_05_BookApplication.books) {
			if(temp==null) {
				Day07_05_BookApplication.books[i]=book;
				System.out.println("������� �Ϸ�");
				return;
			}
			
			i++; // �ε��� ����
		}
		
	}
	
		// 6. ���� ����
	void ��������() {
		System.out.println(" ������ ����");
		
	}

}
