package part2_04_08_5;

public class Account {
	
	private String id;
	private String password;
	private String name;
	private String Phone;
	private boolean loan_Repayment;
	
	public Account() {
	
	}

	public Account(String id, String password, String name, String phone, boolean loan_Repayment) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		Phone = phone;
		this.loan_Repayment = loan_Repayment;
//		this.loan_address = loan_address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public boolean isLoan_Repayment() {
		return loan_Repayment;
	}

	public void setLoan_Repayment(boolean loan_Repayment) {
		this.loan_Repayment = loan_Repayment;
	}

//	public int getLoan_address() {
//		return loan_address;
//	}
//
//	public void setLoan_address(int loan_address) {
//		this.loan_address = loan_address;
//	}
//

	
}
