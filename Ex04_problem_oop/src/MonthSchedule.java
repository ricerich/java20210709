import java.util.Scanner;

public class MonthSchedule 
{
	int totalDay;
	Day days[];
	
	public MonthSchedule(int totalDay) 
	{
		this.totalDay = totalDay;
		
		days = new Day[this.totalDay];//30개짜리 객체배열
		
		for(int i=0; i<days.length; i++)
		{
			days[i] = new Day();
		}
	}

	public void run() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이번달 스케줄 관리 프로그램.");
		
		while(true)
		{
			System.out.print("할일 (입력:1, 보기:2, 끝내기:3) >>");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default :
					System.out.println("1,2,3 중에 입력하시오!");
//					break;
			}
		}
	}
	
	private void input() 
	{
		System.out.print("날짜(1~30)?");
		Scanner sc = new Scanner(System.in);
		int nDay = sc.nextInt();
		nDay--;
		System.out.print("할일(빈칸없이 입력)");
		String strWork = sc.next();
		days[nDay].set(strWork);
		
	}
	
	private void view() {
		System.out.print("날짜(1~30)?");
		Scanner sc = new Scanner(System.in);
		int nDay = sc.nextInt();
		nDay--;
		System.out.println(""+(nDay+1)+"일의 할 일은 "+days[nDay].get()+" 입니다!");
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다!");
	}

}
