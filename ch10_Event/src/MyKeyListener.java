import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class MyKeyListener extends KeyAdapter 
{
	JLabel la;
	Container c;
	
	MyKeyListener(JLabel la, Container c)
	{
		this.la = la;
		this.c = c;
	}
	
	public void keyPressed(KeyEvent e) 
	{
		la.setText(e.getKeyText(e.getKeyCode()));
		
		c.setBackground(Color.gray);
	
		if(e.getKeyChar() == '%') 
			c.setBackground(Color.YELLOW);
		else if(e.getKeyCode() == KeyEvent.VK_F1) 
			c.setBackground(Color.GREEN);
	}
}
