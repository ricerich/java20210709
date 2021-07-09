
//1.클래스 만들기
public class Person {
	//만들 때 구성성분 3가지
	//①멤버변수
	private String name;
	private int age;
	private double height;
	
	//②생성자 (메소드)
	public Person()
	{
		System.out.println("나는 생성자!");
	}
	
	//③메소드
	public int addAge1(int plus)
	{
		age = age + plus;
		return age;
	}
	
	public void addAge2(int plus)
	{
		age = age + plus;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name1)
	{
		name = name1;
	}
	
	public void setAge(int age1)
	{
		age = age1;
		printAge();
	}
	
	private void printAge()
	{
		System.out.println("객체 나이 출력->"+age);
	}
}