package Test11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test11 {
	
	
	
@Test
	
	public void fail()
	{
		
		Assert.assertEquals(1, 2);
	}
	
	@Test
	
	public void pass()
	{
		
		Assert.assertEquals(1, 1);
	}
	
	
	
	
	
	
	

}
