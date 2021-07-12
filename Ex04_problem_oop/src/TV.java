
public class TV 
{
	private String maker;
	private int year;
	private int size;
	
	public TV(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}
	
	public void show()
	{
		System.out.print(maker + "에서 만든 ");
		System.out.print(year + "년 ");
		System.out.print(size +"인치");
	}
	

}
