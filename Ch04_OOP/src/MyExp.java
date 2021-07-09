public class MyExp 
{
	private int base;
	private int exp;
	
//	public int getBase() {
//		return base;
//	}
//
//	public int getExp() {
//		return exp;
//	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getValue() {
		int res=1;
		for(int i=0; i<exp; i++)
			res = res * base;
		return res;
	}
}
