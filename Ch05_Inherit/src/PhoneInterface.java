
public interface PhoneInterface 
{
	static final int TIMEOUT = 10000; // 상수 필드 선언
	
	abstract void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	
	default void printLogo() 
	{ 
		System.out.println("** Phone **");
	}

}
