
public class Ex04_04 {
	
	
	static void f1(){}
	static void f3(){}
	static void f4(){}
	
	public static void main(String[] args) 
	{
		f1();
		
		char c[] = {'t','h','i','s',' ','i','s',' ','p','e','n','c','i','l'};
		
//		ArrayParameter ap = new ArrayParameter();
//		ap.printCharArray(c);
//		ap.replaceSpace(c);
//		ap.printCharArray(c);
		
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	}
}
