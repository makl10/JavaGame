package characterPack;
import java.util.ArrayList;
import java.util.Random;

import mainGame.*;
import armourPack.*;


public class Character {

	public String name = "";
	public String info = "";
	
	public Chestplate chestplate = new Chestplate(); 
	public Legs legs = new Legs();
	public Boots boots = new Boots();
	public Helmet helmet = new Helmet();
	public Gloves gloves = new Gloves();
	
	public double maxHealth = 100;
	public double currHealth = maxHealth;
	public double maxMana = 0;
	public double currMana = maxMana;
	public double maxStamina=100;
	public double currStamina=maxStamina;

	public Weapon weapon = new Weapon (); 
	
	public ArrayList<Item> inventory = new ArrayList<Item>();

	
	
	public void changeName(String newValue) {
	    name = newValue;
   }
	 
	public void changeInfo(String newValue) {
	    info = newValue;
   }
	 
	public void changeChestplate(Chestplate newValue) {
	    chestplate = newValue;
   }
	 
	public void changeLegs(Legs newValue) {
	    legs = newValue;
   }
	 
	public void changeBoots(Boots newValue) {
	    boots = newValue;
   }
	 
	public void changeHelmet(Helmet newValue) {
	    helmet = newValue;
   }
	 
	public void changeGloves(Gloves newValue) {
	    gloves = newValue;
   }
	 
	public void changeHealth(double newValue) {
	    maxHealth = newValue;
   }
	public void takeDamage(double damage) {
		currHealth = currHealth - damage;
	}
	 
	public void addInventoryItem(Item newItem){
		inventory.add(newItem);
	}
	
	public void removeInventoryItem(Item removeItem){
		inventory.remove(removeItem);
	}
	
	public void changeWeapon(Weapon newValue){
		weapon = newValue;
	}
	
	public void doDamage() {
		//luck, base(avgDamage, stdDamage)
		double avgDamage = 10;
		double stdDamage= 1;
		
		 Random luck = new Random();
		 double luckValue = luck.nextInt(100);
		 double baseHit = randomGaussian.returnGaussian(avgDamage,stdDamage);
		 
		    
	   //Damage Summary
		 System.out.println("Base Damage: " + baseHit + ". Luck: " + luckValue);
		 	
	}
	 
	      
	public void printBasicInfo() {
	System.out.println("Character Name: " + name + ". Weapon: " + weapon.name + ". Health: " + currHealth + "/" + maxHealth
			+ ". Mana: " + currMana + "/" + maxMana + ". Stamina: " + currStamina + "/" + maxStamina);
	}
}  
	
	


