package viktor;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomethingTest {

	@Test
	public void testAdd() throws Exception {
		assertEquals(2, new Something().add(1, 1));
	}
}
