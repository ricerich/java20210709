import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame
{
	//1.멤버변수
	private JLabel la = new JLabel("Hello"); 

	//2.생성자
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener(la));

		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);

		setSize(250, 250);
		setVisible(true);
	}
	
	//4.이너클래스
//	public class MyMouseListener implements MouseListener {
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
//			la.setLocation(x, y);
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {}
//
//		@Override
//		public void mouseExited(MouseEvent e) {}
//		
//		@Override
//		public void mouseClicked(MouseEvent e) {}
//	}
}
