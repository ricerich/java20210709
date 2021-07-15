
public class DBMain {
	public static void main(String args[]) { // 메소드이면서 프로그램실행에 관여함
		
		DB_Book dbBook = new DB_Book();
		dbBook.getCon();
		dbBook.getDB_Book();
		
		//2번 배열로 출력
//		bookList1.printBookArr();
//		bookList1.printBookArr();
//		bookList1.printBookArr();
		
		//3번 객체로 출력
//		bookList1.book1.printBook1();//마지막꺼만 출력
		
		//4번 객체배열 출력
//		for(int i=0; i<bookList1.bookArr.length;++i)
//			bookList1.bookArr[i].printBook1();
		//위 방법은 멤버변수에 직접 접근 비추(->private로 해야함)
		
		for(int i=0; i<dbBook.getBookArr().length;++i)
			dbBook.getBookArr()[i].printBook1();
		
//		Booklist book2 = new Booklist();
//		bookList1.getCon();
//		bookList1.printCustomer();
	}
}
