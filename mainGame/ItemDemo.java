package mainGame;

import java.util.Random;

import characterPack.Character;


 class ItemDemo {

	    public static void main(String[] args) {
	    
	    	int numberSwords = 2;
	    	int numberBows=2;
	    
	    Melee[] swordsPile = WeaponPile.spawnSwords(numberSwords);
	   	Ranged[] bowsPile = WeaponPile.spawnBows(numberBows);

	   	
	    	printWeaponStats(swordsPile,numberSwords);
	    	printWeaponStats(bowsPile,numberBows);
	    	
	    	
	    Character chris = new Character();	
	    chris.changeName("Chris");
	    chris.addInventoryItem(swordsPile[0]);
	    chris.changeWeapon(bowsPile[0]);
	  
	  
	    chris.printBasicInfo();
	    chris.takeDamage(20);
	    chris.printBasicInfo();
	    chris.doDamage();
//	    Random randomGenerator = new Random();
//	    
//	      double randomInt = randomGenerator.nextInt(100);
//	      
//	      System.out.println(randomInt);
//	    
	    }
	    
	    public static void printWeaponStats(Weapon[] printWeapon,int numberWeapons){
	    	for (int i=0; i<numberWeapons; i++){
	    	System.out.println("Weapon Name:" +
		             printWeapon[i].name + ". Damage Type: " + printWeapon[i].damageType + ". Phyiscal Damage:" + printWeapon[i].physicalDamage +
		             ". Fire Damage:" + printWeapon[i].fireDamage + ". Shock Damage:" + printWeapon[i].shockDamage + ". Dark Damage:" + printWeapon[i].darkDamage);
	    	}
	    	 
	    }
 		
	
	}  
 