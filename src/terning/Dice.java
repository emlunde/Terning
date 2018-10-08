package terning;

import java.util.Random;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {

        Random r = new Random();

        int randomNum = r.nextInt(6); // 0-5
        int finalNum = randomNum + 1;        // 1-6

		return finalNum;
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
