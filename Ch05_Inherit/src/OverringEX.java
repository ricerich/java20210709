
public class OverringEX 
{
	public void run() 
	{
		Weapon weapon;
		
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}
}
