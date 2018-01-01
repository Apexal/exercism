import java.util.Arrays;
import java.util.Arrays.*;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String intStr = Integer.toString(numberToCheck);
		int numOfDigits = intStr.length();

		int[] digits = new int[numOfDigits];
		for(int i = 0; i < numOfDigits; i++) {
			digits[i] = Character.getNumericValue(intStr.charAt(i));
		}

		int total = Arrays.stream(digits)
			.reduce(0, (a, b) -> a + (int)Math.pow(b, numOfDigits));
		
		return total == numberToCheck;
	}
}
