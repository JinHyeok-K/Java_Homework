package part2_04_08_5;

public class Loan {
	
	private String Loan_name;
	private int Loan_moeny;
	private long Loan_interest;
	private String Loan_customer;
	private int Loan_address;
	
	public Loan() {
		
	}

	public Loan(String loan_name, int loan_moeny, long loan_interest, String loan_customer, int loan_address) {
		super();
		Loan_name = loan_name;
		Loan_moeny = loan_moeny;
		Loan_interest = loan_interest;
		Loan_customer = loan_customer;
		Loan_address = loan_address;
	}

	public String getLoan_name() {
		return Loan_name;
	}

	public void setLoan_name(String loan_name) {
		Loan_name = loan_name;
	}

	public int getLoan_moeny() {
		return Loan_moeny;
	}

	public void setLoan_moeny(int loan_moeny) {
		Loan_moeny = loan_moeny;
	}

	public long getLoan_interest() {
		return Loan_interest;
	}

	public void setLoan_interest(long loan_interest) {
		Loan_interest = loan_interest;
	}

	public String getLoan_customer() {
		return Loan_customer;
	}

	public void setLoan_customer(String loan_customer) {
		Loan_customer = loan_customer;
	}

	public int getLoan_address() {
		return Loan_address;
	}

	public void setLoan_address(int loan_address) {
		Loan_address = loan_address;
	}


//	
}
