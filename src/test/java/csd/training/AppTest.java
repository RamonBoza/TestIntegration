package csd.training;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@Test
	public void testName() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	@Ignore
	public void badTest() throws Exception {
		Assert.assertTrue(false);
	}
}
