package Encapsulation;
public class savingalc {
    private int alcno;
    private double balance;

    public savingalc(int alcno, double balance)
    {
        this.alcno = alcno;
        this.balance = balance;
    }


    public double displayalc(){
        return alcno;

    }
    public double displayBalance(){
        return balance;

    }

    public double deductamt(){
        return balance-= 10;
    }


    public double depositram(){
        return balance += 500;
    }

    public double withdrawnshayam(){
        return balance -= 99;
    }



}

