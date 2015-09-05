public class Vessel<T> {
	
	T occupant;

	public void put (T x) {
		occupant = x;
	}

	public T peek () {
		return occupant;
	}
}