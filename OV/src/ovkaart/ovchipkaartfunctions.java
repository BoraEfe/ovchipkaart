package ovkaart;

public class ovchipkaartfunctions extends ovchipkaartmain
{
    private String beginhalte;
    private String eindhalte;
    private String station1;
    private String station2;
    public double afstand = 0.0;
    private double saldo;
    public double reiskosten = 1;
    private String naam;
    private int id;
    private double instaptarrief = 20.0;

    public ovchipkaartfunctions(String entername, double entersaldo, int enterid)
    {
	naam = entername;
	saldo = entersaldo;
	id = enterid;
    }
    // TODO Auto-generated method stub

    public void inchecken()
    {
	if (saldo <= 20)
	{
	    System.out.println("Te weinig saldo");
	} else if (saldo >= 20)
	{
	    System.out.println("U bent ingecheckt");
	    this.saldo = saldo - instaptarrief;
	    System.out.println("uw saldo is op dit moment: " + saldo);
	}

    }

    public void uitchecken(int multiplier)
    {
	System.out.println("u bent uitgecheckt");
	saldo = saldo + instaptarrief;
	saldo = saldo - reiskosten * multiplier;
	System.out.println("uw saldo is op dit moment: " + saldo);
    }
    public void opwaarderen(double opwaardeersaldo)
    {
	System.out.println("u hebt opgewaardeerd");
	saldo = saldo + opwaardeersaldo;
	System.out.println("uw saldo is op dit moment: " + saldo);
    }


}
