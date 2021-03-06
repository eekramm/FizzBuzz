package fizzbuzz;

public class FizzBuzz {

	public static String getAnswerFor(int number) {
    if (isDivisibleByThree(number) && isDivisibleByFive(number)) {
    		return "FizzBuzz";
	} else if (isDivisibleByThree(number)) {
			return "Fizz";
    } else if (isDivisibleByFive(number)) {
    	return "Buzz"; 
	} else {
		return "" + number;
	}
	
	}

	private static boolean isDivisibleByFive(int number) {
		return number % 5 == 0;
	}

	private static boolean isDivisibleByThree(int number) {
		return number % 3 == 0;
	}
}
