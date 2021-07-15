import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Book 
{
	Connection con; // 멤버변수
	Statement stmt;
	ResultSet rs;
	
	
	//1번: 변수
	int bookid;
	String bookname;
	String publisher;
	int price;
	
	//2번: 배열 - 생성자에서 초기화 필요
	int bookidArr[];
	String booknameArr[];
	String publisherArr[];
	int priceArr[];
	
	//3번: 객체 - 생성자에서 초기화 필요
	Book book1;
	
	//4번: 객체 배열 - 생성자에서 초기화 필요
	private Book bookArr[];
	
	public Book[] getBookArr() {
		return bookArr;
	}

	//2.생성자
	public DB_Book() {
		//2번 배열 생성 초기화
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
		
		//3번 객체 생성 초기화
		book1 = new Book();
		
		//4번 객체배열 생성 초기화
		bookArr = new Book[10];
		
		for(int i=0; i<bookArr.length;++i)
			bookArr[i] = new Book();
	}
	

//	public Booklist() {
	public void getCon() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##추가
		String pwd = "madang"; // c##추가
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getDB_Book() { // 생성자
//		String query = "SELECT * FROM book";
		try {
			stmt = con.createStatement(); // 2
			
			rs = stmt.executeQuery("SELECT * FROM book"); // 3
			
			System.out.println("ID \tNAME \tPUBLISHER \tPRICE");
			
			int i=0;
			while (rs.next()) 
			{
//				System.out.print(rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getInt(4));
				
				//1번 변수에 저장
//				bookid = rs.getInt(1);
//				bookname =rs.getString(2);
//				publisher = rs.getString(3);
//				price =rs.getInt(4);
				
				//1번 변수일 출력
				//printBook(bookid, bookname, publisher, price);
				
				//2번 배열에 저장
//				bookidArr[i] = rs.getInt(1);
//				booknameArr[i] =rs.getString(2);
//				publisherArr[i] = rs.getString(3);
//				priceArr[i] =rs.getInt(4);
//				
//				i++;
				
				//3번 객체에 저장(접근 안됨)
//				book1.bookid = rs.getInt(1);
//				book1.bookname =rs.getString(2);
//				book1.publisher = rs.getString(3);
//				book1.price =rs.getInt(4);
				
				//3번 객체에 저장
//				book1.setBookid(rs.getInt(1));
//				book1.setBookname(rs.getString(2));
//				book1.setPublisher(rs.getString(3));
//				book1.setPrice(rs.getInt(4));
				
//				printBook(book1.bookid, book1.bookname, book1.publisher, book1.price);
//				printBook(book1.getBookid(), book1.getBookname(),
//						  book1.getPublisher(), book1.getPrice());
//				//3번 객체는 위처럼 하지말고, 아래처럼
//				book1.printBook1();
				
				//4번 객체 배열에 저장
				//bookArr[i] = new Book();//이 부분은 생성자로 보낸다.
				
//				bookArr[i].setBookid(rs.getInt(1));
//				bookArr[i].setBookname(rs.getString(2));
//				bookArr[i].setPublisher(rs.getString(3));
//				bookArr[i].setPrice(rs.getInt(4));
				
				bookArr[i] = new Book(rs.getInt(1),
									  rs.getString(2),
									  rs.getString(3),
									  rs.getInt(4));
//				
//				//4번 객체 배열 출력
//				bookArr[i].printBook1();
				//4번 출력은 외부에서 사용 추천
				
				i++;

			}
			
			//1번 변수를 while 밖에서 사용하면, 마지막 값만 나옴(출력)
//			printBook(bookid, bookname, publisher, price);
			
			//2번 배열 출력
			//printBookArr();//
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	//1번 변수 출력용, 3번 객체용으로 사용할 수 있지만 하면 안좋음!
	private void printBook(int bookid, String bookname, String publisher, int price) {
		System.out.print(bookid +" ");
		System.out.print(bookname +" ");
		System.out.print(publisher + " ");
		System.out.println(price);
		
	}

	//2번 배열 출력용
	public void printBookArr() 
	{
		for(int i=0; i<bookidArr.length; ++i)
		{
			System.out.print(bookidArr[i] +" ");
			System.out.print(booknameArr[i] +" ");
			System.out.print(publisherArr[i] + " ");
			System.out.println(priceArr[i]);
		}
		
	}



	
//	public void printCustomer() { // 생성자
////		String query = "SELECT * FROM book";
//		try {
//			stmt = con.createStatement(); // 2
//			
//			rs = stmt.executeQuery("SELECT * FROM customer"); // 3
//			
//			System.out.println("ID \tNAME \tPUBLISHER \tPRICE");
//			while (rs.next()) {
//				System.out.print(rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getString(4));
//
//			}
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}

//	public static void main(String args[]) { // 메소드이면서 프로그램실행에 관여함
//		Booklist so = new Booklist();
//		so.sqlRun();
//	}
}
