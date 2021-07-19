
public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{

	@Override
	public void play() {
		System.out.println("음악을 재생합니다!");
		
	}

	@Override
	public void stop() {
		System.out.println("음악을 중지합니다!");
		
	}

	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~!!!");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다!");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자가 갑니다!");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자가 왔어요!!");
	}

	public void schedule() {
		System.out.println("일정을 관리합니다!!");
		
	}
}
