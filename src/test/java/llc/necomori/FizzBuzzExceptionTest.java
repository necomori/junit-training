package llc.necomori;

import org.junit.Test;

public class FizzBuzzExceptionTest {

	@Test(expected = IllegalArgumentException.class)
	public void _101を入れると例外が発生する() {
		FizzBuzz sut = new FizzBuzz();
		sut.say(101);
		throw new IllegalArgumentException();
	}

}
