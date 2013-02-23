package armourPack;

import mainGame.*;

public class Armour extends Item {

	double physicalResistance = 0;
	double magicResistance = 0;
	double meleeBonus = 0;
	double rangedBonus = 0;
    
    public void changeMagicResistance(double newValue) {
        magicResistance = newValue;
   }
    
    public void changePhysicalResistance(double newValue) {
        physicalResistance = newValue;
   }
    
    public void changeMeleeBonus(double newValue) {
        meleeBonus = newValue;
   }
    
    public void changeRangedBonus(double newValue) {
        rangedBonus = newValue;
   }
    
}
