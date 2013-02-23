package mainGame;



public class Weapon extends Item{


	
		public double physicalDamage = 0;
		public double fireDamage = 0;
		public double shockDamage = 0; 
		public double darkDamage = 0;
		
		public String damageType = "N/A";
		
		
	
		
	
	     void changePhysicalDamage(double newValue) {
	         physicalDamage = newValue;
	    }
	     
	     void changeFireDamage(double newValue) {
	         fireDamage = newValue;
	    }
	     
	     void changeShockDamage(double newValue) {
	         shockDamage = newValue;
	    }
	     
	     void changeDarkDamage(double newValue) {
	    	 darkDamage = newValue;
	    }
	     
	     void changeDamageType(String newValue) {
	         damageType = newValue;
	    }

	    

	 
	     
	
	
}

