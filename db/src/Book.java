
public class Book 
{
	//1.멤버변수
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	//2.생성자
	public Book() { }
	
	public Book(int bookid, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	//3.메소드
//	private void printBook1(int bookid, String bookname, String publisher, int price) {
	public void printBook1() { //매개변수 필요없음, 왜냐면 멤변으로 다 가지고 있기때문
		System.out.print(bookid +" ");
		System.out.print(bookname +" ");
		System.out.print(publisher + " ");
		System.out.println(price);
		
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPrice() {
		return price;
	}
	
	
	
	

}
