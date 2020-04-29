package testMethods;

import static org.junit.Assert.assertEquals;
import methodsDefinitions.ArithmaticOperaitons;
import org.junit.Test;

public class TestSum extends ArithmaticOperaitons {
	
	@Test
	public void ValidSum()
	{
		assertEquals(5, sum(3,2));
	}
	
	@Test
	public void InvalidSum()
	{
		assertEquals(7, sum(3,2));
	}

}
