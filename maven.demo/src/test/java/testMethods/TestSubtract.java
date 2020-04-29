package testMethods;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import methodsDefinitions.ArithmaticOperaitons;

public class TestSubtract extends ArithmaticOperaitons {
	
	@Test
	public void ValidSubtract()
	{
		assertEquals(1, subtract(3,2));
	}
	
	@Test
	public void InvalidSubtrat()
	{
		assertEquals(10, subtract(3,2));
	}


}
