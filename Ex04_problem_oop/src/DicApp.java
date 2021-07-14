import java.util.Scanner;

public class DicApp 
{
	public void run() 
	{
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("한글 단어는?");
			String kor = sc.next();
		
			if(kor.equals("그만"))
				break;
			
			String eng = Dictionary.kor2Eng(kor);
			
			if(eng.equals(""))//해당 값이 없으면
				System.out.println(kor +"는 저의 사전에 없습니다!");
			else
				System.out.println(kor +"은(는) " + eng);
			
		}
		sc.close();
	}

}
