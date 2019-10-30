public class Magic extends Weapon
{
	public int strength;
	public int durability;
	
	public Magic(int strength, int durabliity)
	{
		this.strength=strength;
		this.durability=durabliity;
	}
	
	public int getStrength()
	{
		return strength;
	}
}