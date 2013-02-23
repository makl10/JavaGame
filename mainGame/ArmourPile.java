package mainGame;

import armourPack.Armour;


public class ArmourPile {
 public static Armour[] spawnArmour(int numberArmour) {
	Armour[] armourPile = new Armour[numberArmour]; 
	
	for (int i = 0; i<numberArmour; i++ ){
		  armourPile[i] = new Armour ();
	 }
	
	armourProperties(armourPile, 0,"Chestplate",4,3,2,0);
	
	return armourPile;
	

 }
 
 
 static void armourProperties(Armour[] currArmour, int i, String newName, double newPhysicalResistance,
			double newMagicResistance, double newMeleeBonus, double newRangedBonus){
		currArmour[i].changeName(newName);

		currArmour[i].changePhysicalResistance(newPhysicalResistance);
		currArmour[i].changeMagicResistance(newMagicResistance);
		currArmour[i].changeMeleeBonus(newMeleeBonus);
		currArmour[i].changeRangedBonus(newRangedBonus);
	
	}
 
}

