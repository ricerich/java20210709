public class Ex04_Test 
{
	public static void main(String[] args) 
	{
		//2.클래스 사용, 3.객체 만들기
		Person p1 = new Person();
		
		//4.객체 사용(①멤버변수 or ②메소드)
		//①멤버변수
//		p1.name = "홍길동";//멤버변수 접근 금지
//		p1.age = 20;//멤버변수 접근 금지
		p1.setName("홍길동");
		p1.setAge(20);
		
		//System.out.println(p1.name +"의 나이는"+p1.age);
		System.out.println(p1.getName() +"의 나이는"+p1.getAge());
		
		//②메소드
		int realAge1 = p1.addAge1(3);
		System.out.println("진짜 나이는=>"+realAge1);

		p1.addAge2(5);
//		System.out.println("진짜 나이는=>"+p1.age);//멤변 접근 금지
		System.out.println("진짜 나이는=>"+p1.getAge());
		
	}
}


