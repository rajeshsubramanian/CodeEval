
import junit.framework.Assert;

import org.junit.Test;


public class MainTest {

	@Test
	public void testProcessLine() {
		Main main = new Main();
		Assert.assertEquals("1 2 F 4 B F 7 8 F B", main.processLine(3, 5, 10));
		Assert.assertEquals("1 F 3 F 5 F B F 9 F 11 F 13 FB 15", main.processLine(2, 7, 15));
	}

	@Test
	public void testProcessItem() {
		Assert.assertEquals("1", Main.processItem(1, 3, 5));
		Assert.assertEquals("2", Main.processItem(2, 3, 5));
		Assert.assertEquals("F", Main.processItem(3, 3, 5));
		Assert.assertEquals("B", Main.processItem(5, 3, 5));
		Assert.assertEquals("FB", Main.processItem(15, 3, 5));
	}

}
