package llc.necomori;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzExpectionViaRuleTest {

	  @Rule
	  public ExpectedException thrown = ExpectedException.none();

	  @Test
	  public void exceptionRule() {
	    thrown.expect(IllegalArgumentException.class);
	    thrown.expectMessage("エラーメッセージ");
	    
	    throw new IllegalArgumentException("エラーメッセージ");
	  }
}
