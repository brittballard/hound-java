import static org.junit.Assert.*;

import org.junit.Test;


public class JavaListTest {

	@Test
	public void test() {
		JavaLint linter = new JavaLint();
		Boolean result = linter.testStyle();
		assertTrue(result);
	}

}
