import java.security.SecureRandom;

public class Weapon extends Object
{
	public int strength;
	public int durability;
	
	SecureRandom rand = new SecureRandom();
	
	public int getStrength()
	{
		return strength;
	}
	
	public int getDurability()
	{
		return durability;
	}
	
	public void setDurability(int durability)
	{
		this.durability=durability;
	}
	
	public int specAttack()
	{
		int x = rand.nextInt(5)+1;
		x=x*5;
		return x;
	}
	
}