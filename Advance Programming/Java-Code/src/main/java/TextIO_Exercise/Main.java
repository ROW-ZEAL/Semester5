package TextIO_Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// What? - Previous Exercise ko mha - data haru lai file mha rakhyerw file read garerw dekhau ney

	public static void main(String[] args) throws IOException {

		//Instant create
//		SavingAccount sa1 = new SavingAccount("010001",2000.00,0.06);
//		SavingAccount sa2 = new SavingAccount("010002",5000.00,0.03);
		//call 1

//		CurrentAccount ca1 = new CurrentAccount("020001",4000.00,5000.00);
//		CurrentAccount ca2 = new CurrentAccount("020002",10000.00,8000.00);


//		sa1.DepositeWithInterest(500);
//		sa2.DepositeWithInterest(600);
//		ca1.deposite(100);
//		ca2.deposite(50);

		//overriding - yautai parameter ma value pass garne ho

//		displayAccount(sa1);
//		displayAccount(sa2);
//		displayAccount(ca1);
//		displayAccount(ca2);
//		SavingAccount sa3 = new SavingAccount("010003",1000.00);
//		displayAccount(sa3);

		//2

		//--------------------------------
		// New way by reading file

		java.io.File data1 = new java.io.File("/Users/sandip/Documents/Github/Semester-5/Advance Programming/Java-Code/src/main/java/TextIO_Exercise/saving_data.txt");
		java.io.File data2 = new java.io.File("/Users/sandip/Documents/Github/Semester-5/Advance Programming/Java-Code/src/main/java/TextIO_Exercise/current_data.txt");

		// For Saving Alc
		Scanner src = new Scanner(data1);
		SavingAccount savAlc = null;
		ArrayList<SavingAccount> accounts = new ArrayList();

		while (src.hasNext()) {
			String BankAlc = src.next();
			double Balance = src.nextDouble();
			double Interest = src.nextDouble();

			savAlc = new SavingAccount(BankAlc, Balance, Interest);
			accounts.add(savAlc);

		}
		for (SavingAccount sav : accounts) {
			sav.DepositeWithInterest(500);
			sav.DisplayAllGivenAccount();
		}

		// For Current Alc
		Scanner src1 = new Scanner(data2);
		CurrentAccount savAlc1 = null;
		ArrayList<CurrentAccount> accounts1 = new ArrayList();

		while (src1.hasNext()) {
			String BankAlc = src1.next();
			double Balance = src1.nextDouble();
			double Interest = src1.nextDouble();

			savAlc1 = new CurrentAccount(BankAlc, Balance, Interest);
			accounts1.add(savAlc1);

		}
		for (CurrentAccount sav : accounts1) {
			sav.DisplayAllGivenAccount();
		}

	}
}
