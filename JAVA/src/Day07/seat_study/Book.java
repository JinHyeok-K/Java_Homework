package Day07.seat_study;

public class Book {// class start
	/*
	 * 	1. �ʵ�
	 *  	[ ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ�� ]
		2. ������
		
		3. �޼ҵ�
	 *  	[ 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.�������� ]
	 * 
	 */
	// 1. �ʵ�
	String ISBN;
	String book;
	String writter;
	boolean rental;
	String rental_ID;
	
	// 2. ������
	Book(){}

	public Book(String ISBN, String book, String writter, boolean rental, String rental_ID) {
		ISBN = ISBN;
		this.book = book;
		this.writter = writter;
		this.rental = rental;
		this.rental_ID = rental_ID;
	}
	
	
	// 3. �޼ҵ�
		// 1. ���� �˻�
	void find_book() {}
		// 2. ���� ���
	void book_index() {}
		// 3. ���� �뿩
	void book_give() {}
		// 4. ���� �ݳ�
	void book_back() {}
		// 5. ���� ���
	void book_reg() {}
		// 6. ���� ����
	void book_del() {}
	
	
	
	
	
}// class end
