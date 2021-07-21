import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerExFrame extends JFrame 
{
	private JLabel [] lblArr; 

	public KeyListenerExFrame() {
		setTitle("keyListener ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.addKeyListener(new MyKeyListener());

		lblArr = new JLabel [3]; 
		lblArr[0] = new JLabel(" getKeyCode() ");
		lblArr[1] = new JLabel(" getKeyChar() ");
		lblArr[2] = new JLabel(" getKeyText() ");

		for(int i=0; i<lblArr.length; i++) {
			c.add(lblArr[i]);
			lblArr[i].setOpaque(true);
			lblArr[i].setBackground(Color.YELLOW);
		}
		setSize(300,150);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) 
		{
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();

			lblArr[0].setText(Integer.toString(keyCode));
			lblArr[1].setText(Character.toString(keyChar));
			lblArr[2].setText(e.getKeyText(keyCode));
		}	
	}

}
