import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class OutListenerFrame extends JFrame 
{
	public OutListenerFrame() 
	{
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기
		
		c.add(btn);

		setSize(350, 150);
		setVisible(true);	
	}
}
