import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnit {
@Test
	public void Unit() {
	  assertEquals(5, add(2,2));
}
private static Object add(int i, int j) {
	int b = i+ j;
	return b;
}
}
