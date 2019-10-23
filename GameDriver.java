//Game driver for testing inheritance demonstration files
//Dr. G
//10-5-18
//Edited 2-17-19

//14. Now let's test our set up so far
import java.util.Scanner;
import java.security.SecureRandom;

public class GameDriver
{
	SecureRandom rand = new SecureRandom();
	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//Create a 20 x 20 field
		Field f1 = new Field(20,20);
		
		//We are going to create a test fight scenario involving a hero and a bad guy
		//For now, we'll ignore moving around the field. 
		//Can you see how this is related to your 1400 semester long project?
		
		//15. 
		//Add the ability to take damage and to heal to our hero and bad guy

		//Create a Hero with strength 10 and hit points 100
		
		Hero h1 = new Hero("Bob", f1, 100, 10);

		//Create a 3 Bad guys with strength 5 and hit points 200
		
		Baddy b1 = new Baddy("Goblin1", f1, 300, 5);
		//Baddy b2 = new Baddy("Goblin2", f1, 200, 5);
		//Baddy b3 = new Baddy("Goblin3", f1, 200, 5);
		Weapon w1 = new Weapon(30, 40);
		
		
		//System.out.println(h1.getStrength());
		//System.out.println(h1.getAttack());
		System.out.println("Choose your weapon!");
		System.out.println("1.) Sword! Attack: 10 Durability: 20");
		
		
		int x = sc.nextInt();
		System.out.println();
		switch(x)
		{
			case 1:		
					
					h1.equip(w1);
					h1.setAttack(30);
					fight(h1,b1);
					break;	
		}

		//Create a fight function that accepts a hero and a bad guy let them fight it out
		
	}
	
	public static void fight(Hero h1, Baddy b1)
	{
		Scanner sc = new Scanner(System.in);
	
		//Battle until the bad guys hit points are 0 or lower
		while (h1.isAlive() && b1.isAlive())
		{
			//Hero attacks
			System.out.println("1.)Attack with weapon.");
			System.out.println("2.)Attack unarmed.");
			int x = sc.nextInt();
			switch(x)
			{
				case 1:
					b1.takeDamage(h1.getStrength() + h1.getAttack());
					System.out.println(b1.getHitPoints());
					break;
				case 2: 
					b1.takeDamage(h1.getStrength());
					System.out.println(b1.getHitPoints());
					break;
			}
			
			
			
			//bad guy attack if it is still alive
			//if (b1.isAlive())
			//{
			//	h1.takeDamage(b1.getStrength());
			//}
		}
		
		//show the outcome of the battle
		if(h1.isAlive())
			{
				System.out.println("Hero won");
			}
			else
				System.out.println("Baddy won");
	}
	
}