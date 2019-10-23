//9. Here's our hero. The hero is a ___________ which is a _____________. 
//Which is an example of ___________________.
//For placement each object has a _____________________. That's an example of 
//____________________________
//Playable hero object subclass of a Characterxs
//Dr. G 
//10-5-18
//Edited: 2-17-19


public class Hero extends Character
{
	private Weapon w1;
	private Object inventory [];
	private final int INVENTORY_SIZE = 10; 

	//10. Constructors for hero object
	public Hero()
		{
		//10.1 Call the parents constructor and follow what happens
		super();
		inventory = null;
		}
	
	public Hero(String name, Field f1, int hitPoints, int strength)
		{ 
		//this.name = name;
		super(name, f1, hitPoints, strength);
		//Start him at position 0
		x = 0; 
		y = 0;
		//Give him a status of alive
		//status = status.ALIVE;
	
		//only allow for a max of 300 hit points
		//What is this an example of?
		if (hitPoints > 300) this.hitPoints = 300; 
		else this.hitPoints = hitPoints;
	
		//only allow for a max of 100 strength
		//What is this an example of?
		if (strength > 100) this.strength =100;
		else this.strength = strength; 
	
		//create an inventory of objects for the hero to carry around
		inventory = new Object [INVENTORY_SIZE];
	
		//initialize inventory array
		initInventory();
		}
		
	//This is the reason for the name only constructor in the object class
	private void initInventory()
	{
	 for (int i = 0; i< INVENTORY_SIZE; ++i)
	 	inventory[i] = new Object("EMPTY"); 
	}
	
	public void equip(Weapon w1)
	{
		this.w1=w1;
	}
	//11. What other functions would we need to give our hero?
	
	//NOW GO TAKE A LOOK AT THE VILLIAN FILE. 
}