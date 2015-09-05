import org.junit.Test;
import static org.junit.Assert.*;

public class TestVesselHelper {

	@Test
	public void testRemove() {
		Vessel<Integer> v = new Vessel<>();
		v.put(5);
		int occupant = VesselHelper.remove(v);
		assertEquals(5, occupant);
		assertEquals(null, v.peek());

		Vessel<String> vs = new Vessel<>();
		vs.put("Hello");
		String occupantString = VesselHelper.remove(vs);
		assertEquals("Hello", occupantString);
		assertEquals(null, vs.peek());

	}

	@Test

	public  void testMax() {
		Vessel<Integer> x = new Vessel<>();
		Vessel<Integer> y = new Vessel<>();

		x.put(5);
		y.put(6);

		assertEquals((Integer) 6, VesselHelper.max(x,y));

		Vessel<String> xs = new Vessel<>();
		Vessel<String> ys = new Vessel<>();

		xs.put("apple");
		ys.put("bat");

		assertEquals("bat", VesselHelper.max(xs,ys));



	}

	public static void main(String[] args) {
		jh61b.junit.textui.runClasses(TestVesselHelper.class);
	}
}