package mainGame;

public class Item {
	 public String name = "N/A";
	 public double storeValue = 0;
	 public double resaleValue = 0;
	 public double weight = 0;
		
		
	public void changeWeight(double newValue) {
	    weight = newValue;
   }
	 
    public void changeName(String newValue) {
        name = newValue;   
   }
    public void changeStoreValue(double newValue) {
        storeValue = newValue;   
   }
    public void changeResaleValue(double newValue) {
        resaleValue = newValue;   
   }
    
}
