package ovkaart;

public class ovchipkaartmain extends AccountTest
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	ovchipkaartfunctions bora = new ovchipkaartfunctions("bora", 50, 000);
	bora.opwaarderen(20);
	bora.inchecken();
	bora.uitchecken(4);
	
	bora.inchecken();
	bora.uitchecken(10);

	    
	}
    

}
