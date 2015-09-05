import org.junit.Test;
import static org.junit.Assert.*;

public class VesselTest {


	@Test
	public void testVessel () {
		Vessel<Integer> osv = new Vessel<>();
		int x = 5;
		osv.put(x);
		int y  = osv.peek();
		assertEquals(5, y);
		assertEquals(Integer.valueOf(x), osv.peek());

	}
 

	public static void main(String[] args) {
		jh61b.junit.textui.runClasses(OldSchoolVesselTest.class);
	}

}