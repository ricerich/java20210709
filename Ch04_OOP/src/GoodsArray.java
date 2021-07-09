import java.util.Scanner;

public class GoodsArray 
{
	//1.멤버변수(=속성,필드)
	Goods[] goodsArray;
	
	//2.생성자
//	GoodsArray()
//	{
//		goodsArray = new Goods[3];	
//	}
	
	GoodsArray()
	{
		goodsArray = new Goods[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<goodsArray.length;++i)
		{
			System.out.print(i+"입력시작>>");
			String name = sc.next();
			int price = sc.nextInt();
			int n = sc.nextInt();
			int sold = sc.nextInt();
			
//			Goods goods = new Goods(name, price, n, sold);
//			goodsArray[i] = goods;
			
			goodsArray[i] = new Goods(name, price, n, sold);
		}
	}
	
	//3.(멤버)메소드(=함수)
	void printGoodsArray()
	{
		for(int i=0;i<goodsArray.length;++i)
		{
			String name = goodsArray[i].getName();
			int price = goodsArray[i].getPrice();
			int n = goodsArray[i].getNumberOfStock();
			int sold = goodsArray[i].getSold();
			
			System.out.println(name +" "+ price +" " + n + " " + sold);
		}
	}
}
