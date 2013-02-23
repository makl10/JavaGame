package mainGame;

public class WeaponPile {

	public static Melee[] spawnSwords (int numberSwords) {
		
		 
 		//SPAWN SWORDS
 		 Melee[] swordsPile = new Melee[numberSwords] ; 
 		 
 		 for (int i = 0; i<numberSwords; i++ ){
 			  swordsPile[i] = new Melee ();
 		 }
 		 
 		 
 		 weaponProperties(swordsPile, 0, "Long Sword","Physical",2,0,0,0);
 		 //Insert Sword Properties Here
 		 //swordsPile[0].changePhysicalDamage(2);
 		 //swordsPile[0].changeName("Long Sword");
 		 //swordsPile[0].changeDamageType("Physical");
 		
 		 weaponProperties(swordsPile, 1, "Short Sword","Physical", 1.7,0,0,0);
 		 //swordsPile[1].changePhysicalDamage(1.4);
 		 //swordsPile[1].changeName("Short Sword");
 		 //swordsPile[1].changeDamageType("Physical");
 		
 		 
 		
 		 
 		 return swordsPile;
 		
 	}
	 static void weaponProperties(Weapon[] currWeapon, int i, String newName, String newDamageType, double newPhysicalDamage,
			double newFireDamage, double newShockDamage, double newDarkDamage){
		currWeapon[i].changeName(newName);
		currWeapon[i].changeDamageType(newDamageType);
		currWeapon[i].changePhysicalDamage(newPhysicalDamage);
		currWeapon[i].changeFireDamage(newFireDamage);
		currWeapon[i].changeShockDamage(newShockDamage);
		currWeapon[i].changeDarkDamage(newDarkDamage);
	
	}
	
	public static Ranged[] spawnBows (int numberBows){
		
		
		 //SPAWN BOWS
		 Ranged[] bowsPile = new Ranged[numberBows];
		 
		 for (int i = 0; i<numberBows; i++ ){
			  bowsPile[i] = new Ranged ();
		 }
		 
		 bowsPile[0].changePhysicalDamage(2);
		 bowsPile[0].changeName("Long bow");
		 bowsPile[0].changeDamageType("Physical");
		
		 bowsPile[1].changePhysicalDamage(1.4);
		 bowsPile[1].changeName("Short bow");
		 bowsPile[1].changeDamageType("Physical");
		 
		
	
		 return bowsPile;
	}
	
	
	
}
