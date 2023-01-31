package mymaventest.testmaven;
import org.junit.Assert;
import org.junit.Test;

public class Vextor2dTest {
	
	@Test
	public void newVectorShoudHaveZeroLegth() {
		Vector2d v1 = new Vector2d();
		
		Assert.assertEquals(0,v1.length(), 1e-9);
		
	}
	

}
