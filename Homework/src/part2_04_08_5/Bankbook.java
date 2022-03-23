package part2_04_08_5;

public class Bankbook {
	
	private int Bankbook_number;
	private int save_money;
	private String id;
	private int loan_address;
//	private String name;
	
	public Bankbook() {
	
	}

	public Bankbook(int bankbook_number, int save_money, String id, int loan_address) {
		super();
		Bankbook_number = bankbook_number;
		this.save_money = save_money;
		this.id = id;
		this.loan_address = loan_address;
	}

	public int getBankbook_number() {
		return Bankbook_number;
	}

	public void setBankbook_number(int bankbook_number) {
		Bankbook_number = bankbook_number;
	}

	public int getSave_money() {
		return save_money;
	}

	public void setSave_money(int save_money) {
		this.save_money = save_money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLoan_address() {
		return loan_address;
	}

	public void setLoan_address(int loan_address) {
		this.loan_address = loan_address;
	}	
	
	
	
	
}
