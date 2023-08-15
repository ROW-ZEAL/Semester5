package TextIO_Exercise;

public class SuperBankClass {
	String accno;
	double AcBal;
	public SuperBankClass(String accno, double AcBal) {
		this.accno = accno;
		this.AcBal = AcBal;
	}
	
	//set
	public void deposite(double amt) {
//		this.AcBal = this.AcBal + amt; -- below and this line works as same
		this.AcBal += amt;
	}
	
	public void DisplayAllGivenAccount() {
		System.out.println("Account "+ accno);
		System.out.println("Balance "+ AcBal);
		System.out.println("");
	}
	
	public double getBalance() {
		return AcBal;
	}
	public void setDepositeWithInterest(double amt) {
		AcBal += amt;
	}
}
