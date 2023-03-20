package ovkaart;

public class SavingsAccount extends AccountTest
{
    public double withdrawalamount;
    public double depositamount;
    public double saldo = 0.0;
    public double interestamount;
    public int accountage;
    public String naam;
   

    public void withdrawal(double withdrawalamount)
    {
	if (withdrawalamount > saldo)
	{
	    System.out.println("to low balance");
	} else if (withdrawalamount <= 0)
	{
	    System.out.println("Amount to low");
	} else
	{
	    saldo = saldo - withdrawalamount;
	}

    }

    public void deposit(double depositamount)
    {
	if (depositamount < 0)
	{
	    System.out.println("Amount to low");
	} else
	{
	    saldo = saldo + depositamount;
	}

    }
    public void interest()
    {
	accountage++;
	if (accountage == +1)
	{
	    saldo = saldo * interestamount;  
	}
    }

}
