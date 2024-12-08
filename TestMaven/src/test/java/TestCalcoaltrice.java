import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCalcoaltrice {

	@Test
	public void testSomma() {
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(5,6);
		
		Assert.assertEquals(11, res, 0);
	}

}
