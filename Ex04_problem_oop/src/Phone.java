
public class Phone 
{
	//1.멤버변수
	private String name;
	private String tel;
	
	//2.생성자
//	public Phone() {
//		this.name = "홍길동";
//		this.tel = "000-0000";
//	}
	
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	//3.메소드
	public String getTel() {
		return tel;
	}

	public String getName() {
		return name;
	}
	
}
