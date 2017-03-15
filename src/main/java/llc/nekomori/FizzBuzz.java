package llc.nekomori;

public class FizzBuzz {
	
	public String say(int input) {
		if(input % 3 == 0) {
			return "Fizz";
		}
		if(input % 5 == 0) {
			return "Buzz";
		}
		if(input % 3 == 0 && input % 5 == 0) {
			return "FizzBuzz";
		}
		return String.valueOf(input);
	}
}
