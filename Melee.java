public class Melee extends Weapon
{
	public int strength;
	public int durability;
	
	public Melee(int strength, int durability)
	{
		this.strength=strength;
		this.durability=durability;
	}
	
	public int getStrength()
	{
		return strength;
	}

}