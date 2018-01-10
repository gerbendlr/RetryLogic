package RetryLogicTest;

import org.testng.annotations.Test;
import org.testng.Assert;

public class RetryTest {


	@Test
	public void test1 () {
		
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void test2() {
		
		Assert.assertEquals(false,true);
	}
	
	
	@Test
	public void test3() {
		
		Assert.assertEquals(true,true);
	}
}
