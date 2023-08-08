public class main {
    public static void main(String[] args) {

        savingalc ram = new savingalc(121515, 6000.00);
        savingalc shyam = new savingalc(38989, 4000.00);

        System.out.println("Ram Account Details: \n");
        System.out.println("Account Number: " + ram.displayalc());
        System.out.println("Balance: " + ram.displayBalance());

        System.out.println("Shyam Account Details: \n");
        System.out.println("Account Number: " + shyam.displayalc());
        System.out.println("Balance: " + shyam.displayBalance());

        System.out.println("-----------------------------");
        System.out.println("Ram Deducted Balance:" + ram.deductamt());
        System.out.println("Shyam Deducted Balance:" + shyam.deductamt());

        System.out.println("-----------------------------");
        System.out.println("Deposit Amount RM 500 to Ram Alc: ");
        System.out.println(ram.depositram());

        System.out.println("-----------------------------");
        System.out.println("Withdrawn Amount RM 99 to Shyam Alc: ");
        System.out.println(shyam.withdrawnshayam());

        System.out.println("-----------------------------");
        System.out.println("Display Account Details Again: \n");

        System.out.println("Ram Account Details: \n");
        System.out.println("Account Number: " + ram.displayalc());
        System.out.println("Balance: " + ram.displayBalance());

        System.out.println("Shyam Account Details: \n");
        System.out.println("Account Number: " + shyam.displayalc());
        System.out.println("Balance: " + shyam.displayBalance());





    }
}
