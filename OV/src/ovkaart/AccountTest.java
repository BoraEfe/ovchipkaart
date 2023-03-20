package ovkaart;


public class AccountTest
{

    public static void main(String[] args)
    {
	SavingsAccount sabora = new SavingsAccount();
	sabora.naam = "Bora";
	sabora.saldo = 1000;
	sabora.interestamount = 1.30;
	SavingsAccount saroel = new SavingsAccount();
	saroel.naam = "Roel";
	saroel.saldo = 10200;

	System.out.println(sabora.naam + ": " + sabora.saldo);

	sabora.withdrawal(50);
	sabora.deposit(30);
	
	System.out.println(sabora.naam + ": " + sabora.saldo);
	
	sabora.interest();
	System.out.println(sabora.naam + ": " + sabora.saldo);
	sabora.interest();
	System.out.println(sabora.naam + ": " + sabora.saldo);
    }

}
