import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class MyMouseAdapter extends MouseAdapter  
{
	
	JLabel la = new JLabel();
	
	public MyMouseAdapter(JLabel la)
	{
		this.la = la;
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		super.mousePressed(e);
		
		int x = e.getX();
		int y = e.getY();
		
		la.setLocation(x,y);
		
	}
	
}
