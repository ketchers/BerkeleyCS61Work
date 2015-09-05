/**
 * @author RK 
 */

public class IntListOps {

	/**
	 * Increments each element of list by x
	 * @param  L original list
	 * @param  x amount of increment
	 * @return   a new list with the increments
	 */
	
	public static IntList incr(IntList L, int x) {
		if (L == null)
			return null;
		return new IntList(L.head + x, incr(L.tail, x));	
	}
   
   
}