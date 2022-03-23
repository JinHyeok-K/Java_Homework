package part2_04_08_5;

public class Loan {
	
	private String Loan_name;
	private int Loan_amount;
	private String Loan_interest;
	private String Loan_customer;
	private boolean Loan_Repayment;
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}

	public Loan(String loan_name, int loan_amount, String loan_interest, String loan_customer, boolean loan_Repayment) {
		super();
		Loan_name = loan_name;
		Loan_amount = loan_amount;
		Loan_interest = loan_interest;
		Loan_customer = loan_customer;
		Loan_Repayment = loan_Repayment;
	}

	public String getLoan_name() {
		return Loan_name;
	}

	public void setLoan_name(String loan_name) {
		Loan_name = loan_name;
	}

	public int getLoan_amount() {
		return Loan_amount;
	}

	public void setLoan_amount(int loan_amount) {
		Loan_amount = loan_amount;
	}

	public String getLoan_interest() {
		return Loan_interest;
	}

	public void setLoan_interest(String loan_interest) {
		Loan_interest = loan_interest;
	}

	public String getLoan_customer() {
		return Loan_customer;
	}

	public void setLoan_customer(String loan_customer) {
		Loan_customer = loan_customer;
	}

	public boolean isLoan_Repayment() {
		return Loan_Repayment;
	}

	public void setLoan_Repayment(boolean loan_Repayment) {
		Loan_Repayment = loan_Repayment;
	}
	
	
}
