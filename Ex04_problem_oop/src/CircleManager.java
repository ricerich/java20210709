import java.util.Scanner;

public class CircleManager 
{

	public void run() 
	{
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0; i<c.length; i++)
			c[i].show();
		
		double max =0;
		int maxIndex = 0;
		for(int i=0; i<c.length; i++)
		{
			double square = c[i].getSquare();
			if(square > max)
			{
				max = square;
				maxIndex = i;
			}	
		}
		
		c[maxIndex].show();
				
		scanner.close();
	}

}
