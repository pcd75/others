package dmeo;

import java.util.Random;

public class MathDemo {
	
	public static void main(String[] args) {
		 Random random = new Random(); 
	        long randomNumber = Math.abs(random.nextLong()); 
	        String randomString = Long.toString(randomNumber); 
	        String tenDigitNumber = randomString.substring(0, 10);
		System.out.println(tenDigitNumber);
	}

}
