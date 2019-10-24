//Generic game object super class file
//This class should never be instantiated
//Dr. G 
//10-5-18
//Edited 2-17-19

//4. Create an object class for something that we want to place in our field. 
//Review all of the code below. 

public class Object
{
	//The object's name
	protected String name;
	//The field the object is in
	protected Field f1; 
	//The location in the field
	protected int x; 
	protected int y;
	
	public Object()//no argument constructor placing object off the field
	{
		this.name = null; 
		this.f1 = null; 
		this.x = -1;
		this.y = -1;
	}
	
	//Complete constructor
	public Object(String name, Field f1, int x, int y)
	{
		this.name = name; 
		this.f1 = f1; 
		this.x = x;
		this.y = y;
	}
	
	public Object(String name, Field f1)
	{
		this.name = name; 
		this.f1 = f1; 
		x = -1;
		y = -1;
	}
	
	//Constructor for the object without putting it on the field yet
	//Maybe instead we'll put it in our hero's inventory
	public Object(String name)
	{
		this.name = name;
		x=-1; 
		y=-1;
	}
	
	//Sometimes an object gets destroyed. 
	//Note this does not de-allocate the memory this object took up
	public void DestroyObject()
	{
		this.name = null; 
		this.f1 = null; 
		this.x = -1;
		this.y = -1;
	}	
	
	
	//MOVE TO THE CHARACTER CLASS
}