
public class MethodOverridingEx 
{
	private void paint(Shape p) {
		p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 
				  // 동적 바인딩
	}
	
	public void run()
	{
		Line line = new Line();
		paint(line); 
//		paint(new Shape()); 
//		paint(new Line()); 
//		paint(new Rect()); 
//		paint(new Circle()); 

	}
	
//	void run2()
//	{
//		Shape start, last, obj;
//		// 링크드 리스트로 도형 생성하여 연결
//		start = new Line(); // Line 객체 연결
//		last = start;
//		obj = new Rect();
//		last.next = obj; // Rect 객체 연결
//		last = obj;
//		obj = new Line(); // Line 객체 연결
//		last.next = obj;
//		last = obj;
//		obj = new Circle(); // Circle 객체 연결
//		last.next = obj;
//		// 모든 도형 출력
//		Shape p = start;
//		while(p != null) {
//			p.draw();
//			p = p.next;
//		}
//	}
	

}
