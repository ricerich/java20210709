import java.util.Scanner;

public class PhoneBook 
{
	Phone phoneArr[];
	Scanner sc;
	
	//2.생성자
	public PhoneBook()
	{
		sc = new Scanner(System.in);
	}
	
	//3.메소드 -> 예:run()
	void set() 
	{
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수>>>");
		int cnt = sc.nextInt();
		phoneArr = new Phone[cnt];
		
		for(int i=0; i<phoneArr.length; ++i)
		{
			String name = "";
			String tel = "";
			
			System.out.print("이름과 전화번호(빈칸없이 입력)>>>");
			name = sc.next();
			tel = sc.next();
			
			phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
//		sc.close();
	}
	
	String search(String name)
	{
		for(int i=0; i<phoneArr.length; ++i)
		{
//			if(phoneArr[i].name == name)
			if(phoneArr[i].getName().equals(name))
			{
				return phoneArr[i].getTel();
			}
			
		}
		
		return "";
	}

	public void run() 
	{
		set();
		
		while(true)
		{
			System.out.print("검색할 이름>>");
//			Scanner sc = new Scanner(System.in);
			
			String name = sc.next();
			
			if(name.equals("그만")){
//				sc.close();
				break;
			}
			
			String tel = search(name);
			System.out.println(name+ "의 번호는 "+tel+" 입니다!");
//			sc.close();
		}
		
		sc.close();
	}
	
}



