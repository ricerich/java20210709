
public class SamsungPhone implements PhoneInterface, AInterface
{

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다!");
	}

	public void flash() {		
		System.out.println("전등이 켜졌습니다!");
		System.out.println(PhoneInterface.TIMEOUT);
		
	}
	
}
