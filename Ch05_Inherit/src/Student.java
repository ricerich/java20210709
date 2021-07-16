
public class Student extends Person 
{
	//멤버변수가 하나도 없음! 하지만 부모에 있음
	
	public Student() {
		super(99, 30, 175, "홍길동");
	}
	
	void print()
	{
		System.out.print(age +" ");
		System.out.print(name +" ");
		System.out.print(height +" ");
		System.out.println(getWeight() +" ");
	}
	
	
	public void set() {
		age = 30; // 슈퍼 클래스의 디폴트 멤버 접근 가능
		name = "홍길동"; // 슈퍼 클래스의 public 멤버 접근 가능
		height = 175; // 슈퍼 클래스의 protected 멤버 접근 가능
		// weight = 99; // 오류. 슈퍼 클래스의 private 접근 불가
		setWeight(99); // private 멤버 weight은 setWeight()으로 간접 접근
	}

}
