
public class SmartPhoneEX 
{
	public void run() 
	{
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
		phone.schedule();		
	}
}
