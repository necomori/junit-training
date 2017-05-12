package llc.necomori;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class FizzBuzzTheoriesTest {

    @DataPoints
    public static Fixture[] DATAS = {
    		new Fixture(1, "1")
    	};

    @Theory
    public void FizzBuzzの動作確認(Fixture fx) {
    	FizzBuzz sut = new FizzBuzz();
    	String actual = sut.say(fx.input);
    	assertThat(actual, is(fx.expected));
    }
    
    static class Fixture {
    	int input;
    	String expected;
    	
    	Fixture(int input, String expected) {
    		this.input = input;
    		this.expected = expected;
    	}
    }

}
