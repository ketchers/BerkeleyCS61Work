
import org.junit.Test;
import static org.junit.Assert.*;

import edu.princeton.cs.introcs.*;

import java.util.Arrays;

public class VisSelectionSort {

	public static void sort(double[] a) {
		sort(0, a);
	}

	@Test
	public void sortTest() {
		double[] a = { 1.2, -3.5, 1.3, -4, 2.2 };
		sort(a);
		double[] b = { -4, -3.5, 1.2, 1.3, 2.2 };
		assertArrayEquals(b, a, .001);
	}

	/**
	 *
	 * @param n
	 *            the current position in the sort routine
	 * @param a
	 *            the array to be sorted (in place)
	 */
	private static void sort(int n, double[] a) {
		if (n == a.length - 1)
			return;
		int m = min(n, a);
		double tmp = a[n];
		if (n != m) {
			a[n] = a[m];
			a[m] = tmp;
		}

		//progress(a);
		//System.out.println(Arrays.toString(a));
		sort(++n, a);
	}

	/**
	 *
	 * @param n
	 *            the point from which to start looking for the max
	 * @param a
	 *            the input array
	 * @return the index of the minimal entry in the array
	 */
	private static int min(int n, double[] a) {
		int pt = n;
		for (int i = n + 1; i < a.length; i++)
			if (a[pt] > a[i])
				pt = i;
		return pt;
	}

	@Test
	public void minTest() {
		double[] a = { 1.2, -3.5, 1.3, -4, 2.2 };
		int j = min(0, a);
		assertEquals(3, j);
		a[3] = 4;
		j = min(0, a);
		assertEquals(1, j);
	}

	private static void progress(double[] a) {
		int N = a.length;
		StdDraw.clear(StdDraw.WHITE);
		for (int i = 0; i < N; i++) {
			double x = 1.0 * i / N;
			double y = a[i] / 2.0;
			double rw = 0.3 / N;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
		StdDraw.show(75);
	}

	public static void main(String[] args) {
		jh61b.junit.textui.runClasses(VisSelectionSort.class);
		/*
		int N = 100;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
			a[i] = StdRandom.uniform();
		sort(0, a);
		*/
	}

}
