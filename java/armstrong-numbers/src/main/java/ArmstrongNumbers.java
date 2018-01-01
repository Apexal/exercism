import java.util.Arrays;
import java.util.Arrays.*;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String intStr = Integer.toString(numberToCheck);
		int numOfDigits = intStr.length();

		int total = intStr.chars()
			.mapToObj(i -> Character.getNumericValue(i))
			.reduce(0, (a, b) -> a + (int)Math.pow(b, numOfDigits));
		
		return total == numberToCheck;
	}
}
