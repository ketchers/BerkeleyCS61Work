/**
 * @author RK
 */

import java.util.Arrays;

public class TestSort {

	public static void testSort() {
		String[] input = {"a", "huge", "tiny", "scorpion"};
		Arrays.sort(input);
		String[] expected = {"a", "huge", "tiny", "scorpion"};
		org.junit.Assert.assertArrayEquals(expected, input);
	}
	
	public static void main(String[] args) {
		testSort();
	}

}