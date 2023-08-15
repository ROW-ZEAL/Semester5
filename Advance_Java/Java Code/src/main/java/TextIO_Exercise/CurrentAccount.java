package TextIO_Exercise;

public class CurrentAccount extends SuperBankClass {
	double overDraftValue;
	public CurrentAccount(String acno, double acbal, double overdraft ) {
		super(acno,acbal);
		this.overDraftValue = overdraft;
	}
}
