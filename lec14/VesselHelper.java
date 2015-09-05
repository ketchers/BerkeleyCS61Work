public class VesselHelper {
	
	public static <T> T remove(Vessel<T> v) {
		T rVal = v.peek();
		v.put(null);
		return rVal;
	}


	public static <T extends Comparable<T>> T max (Vessel<T> x, Vessel<T> y) {
		T yVal = y.peek();
		T xVal = x.peek();
		if (xVal.compareTo(yVal) < 0)
			return yVal;
		return xVal;
	}
}