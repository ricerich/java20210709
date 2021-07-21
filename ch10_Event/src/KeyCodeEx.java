import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame  {
	private JLabel la = new JLabel();
	Container c;

	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.addKeyListener(new MyKeyListener(la, c));
		c.add(la);

		setSize(300,150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}
	
//	class MyKeyListener extends KeyAdapter 
//	{
//		public void keyPressed(KeyEvent e) 
//		{
//			la.setText(e.getKeyText(e.getKeyCode()));
//			
//			c.setBackground(Color.gray);
//
//			if(e.getKeyChar() == '%') 
//				c.setBackground(Color.YELLOW);
//			else if(e.getKeyCode() == KeyEvent.VK_F1) 
//				c.setBackground(Color.GREEN);
//		}
//	}

}
