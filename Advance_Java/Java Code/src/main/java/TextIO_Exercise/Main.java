package TextIO_Exercise;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instant create
		SavingAccount sa1 = new SavingAccount("010001",2000.00,0.06);
		SavingAccount sa2 = new SavingAccount("010002",5000.00,0.03);
		//call 1
		
		CurrentAccount ca1 = new CurrentAccount("020001",4000.00,5000.00);
		CurrentAccount ca2 = new CurrentAccount("020002",10000.00,8000.00);
		
		sa1.DepositeWithInterest(500);
		sa2.DepositeWithInterest(600);
		ca1.deposite(100);
		ca2.deposite(50);
		
		//overriding - yautai parameter ma value pass garne ho

		displayAccount(sa1);
		displayAccount(sa2);
		displayAccount(ca1);
		displayAccount(ca2);
		SavingAccount sa3 = new SavingAccount("010003",1000.00);
//		displayAccount(sa3);

		//2
	}

	private static void displayAccount(SuperBankClass value) {
		// TODO Auto-generated method stub
		value.DisplayAllGivenAccount();
	}

}
