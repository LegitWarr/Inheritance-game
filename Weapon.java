import java.security.SecureRandom;

public class Weapon extends Object
{
	public int strength;
	public int durability;
	SecureRandom rand = new SecureRandom();
	
	public Weapon(int strength, int durability)
	{
		this.strength = strength;
		this.durability = durability;
	}
	
	public int getDurability()
	{return durability;}
	
	public int setDurability()
	{return durability;}
}