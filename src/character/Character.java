package character;

import item.Inventory;

public class Character 
{
	private String name;
	private AttributeSet attributes;
	private Race race;
	Inventory inventory;
	
	public Character(String nm, AttributeSet attr, Race rc)
	{
		name = nm;
		attributes = attr;
		race = rc;
		inventory = new Inventory();
	}
	
	public Race getRace()
	{
		return this.race;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public AttributeSet getAttributes()
	{
		return this.attributes;
	}
	
	public Inventory getInventory()
	{
		return this.inventory;
	}
	
	public String toString()
	{
		return ("Name: " + name + "\n" + "Race: " + race.toString() + "\n" + attributes.toString()+ "\n" + inventory.toString());
	}
}

	
