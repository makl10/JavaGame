package characterPack;
import java.util.Random;
public class randomGaussian {
	 
	public static double returnGaussian(double mean, double variance) {
	randomGaussian gaussian = new randomGaussian();
//	    double MEAN = 100.0f; 
//	    double VARIANCE = 5.0f;
	  double gaussianNumber = gaussian.getGaussian(mean, variance);
	  return gaussianNumber;
	    }
	  

	  private Random fRandom = new Random();
	  
	  private double getGaussian(double aMean, double aVariance){
	      return aMean + fRandom.nextGaussian() * aVariance;
	  }

}