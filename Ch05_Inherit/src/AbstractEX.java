
public class AbstractEX 
{
	public void run() 
	{
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));

		System.out.println(c.average(new int [] { 2,3,4 }));
		
		int arr1[] = new int [] { 2,3,4 };
		double avg = c.average(arr1);
		System.out.println(avg);
		
		int arr2[] = { 2,3,4 };
		double avg2 = c.average(arr1);
		System.out.println(avg2);
	}
	
}
