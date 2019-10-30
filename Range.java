public class Range extends Weapon
{

	public int strength;
	public int durability;
	
	public Range(int strength, int durability)
	{
		this.strength=strength;
		this.durability=durability;
	}
	
	public int getStrength()
	{
		return strength;
	}
}