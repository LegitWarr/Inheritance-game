//5. Character class object. Inherits from object class
//Dr. G
//10-5-18
//Edited 2-17-19

public class Character extends Object
{
	protected int hitPoints; 
	protected int strength; 
	protected int durability;
	protected enum STATUS {DEAD, ALIVE};
	protected STATUS status;
	public int attack;

	//6. Create this no argument constructor, but notice what happens if you don't have a
	//no argument object constructor
	public Character()
	{
		//6.1 Children do not inherit constructors 
		//call the base class no argument construtor first
		super();
		hitPoints = 0;
		strength = 0;
		attack = 0;
		status = STATUS.ALIVE;
	}
	
	//Dont do//7. Now comment out both constructors and watch what happens. 
	
	//a more complete constructor
	public Character(String name, Field f1, int hitPoints, int strength)
	{
		//7.1 These aren't instance variables?
		//7.2 Could we replace these with a constructor?
		super(name, f1);
		//super(name, f1,-1,-1);
		//This child's instances
		this.hitPoints = hitPoints;
		this.strength = strength;
		status = STATUS.ALIVE;
	}
	
	
	//8. This constructor only addresses the subclass variables. What happens to the 
	//inherited variables?
	public Character(int hitPoints, int strength)
	{
		
		super();
		this.hitPoints = hitPoints;
		this.strength = strength;
		status = STATUS.ALIVE;
	}
	
	//We'll need some getters for later use, but we'll "set" with damage and heal methods
	public int getHitPoints()
	{return hitPoints;}
	
	public int getStrength()
	{return strength;}

	public void setAttack(int attack)
	{this.attack=attack;}
	
	public int getAttack()
	{return attack;}
	
	public void setDurability(int durability)
	{this.durability=durability;}
	
	public int getDurability()
	{return durability;}
	
	//So we can test our creation
	public void showStats()
	{
	System.out.printf("Name: %s%n Hit Points: %d%n Strength: %d%n X = %d y = %d%n", name, hitPoints, strength, x, y );
	}
	
	//Is the character still alive?
	public boolean isAlive()
	{
		if (status==STATUS.DEAD) return false;
		else return true;
	}
	
	//Destroy the character and move him off the grid
	public void destroyCharacter()
	{
		x= -1;
		y= -1;
		status = STATUS.DEAD;
	}
	
	public void takeDamage(int damage)
	{
		hitPoints-=damage;
		if (hitPoints <= 0) status=STATUS.DEAD;
	}
	
	public void heal(int points)
	{
		hitPoints+=points;
	}

	//MOVE TO HERO FILE
}