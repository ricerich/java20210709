
public class ArrayUtil 
{

	public static int[] concat(int[] arr1, int[] arr2) 
	{
		int cnt = arr1.length + arr2.length;
		int arr3[] = new int[cnt];
		
		for(int i=0; i<arr1.length; ++i)
			arr3[i] = arr1[i];
		
		for(int i=0; i<arr2.length; ++i) 
		{
			int start = arr1.length+i;
			arr3[start] = arr2[i];
		}
		
		return arr3;
	}

	public static void print(int[] arr3) 
	{
		System.out.print("[");
		for(int i=0; i<arr3.length; ++i)
		{
			String str1 = "";
			if(i != arr3.length-1)
				str1 = ",";
			
			System.out.print(arr3[i] +str1);
		}
		System.out.print("]");
		
	}
	
}
