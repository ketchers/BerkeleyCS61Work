
/**
 * Defines a linked list of integers
 * @author RK
 */

public class IntList {
	public int head;
	public IntList tail;
	

	public IntList(int head, IntList tail) {
		this.head = head;
		this.tail = tail;
	}


	public IntList append(int head) {
		return new IntList(head, this);

	}  

	public static IntList Nil = null;

	public int size() {
		if (this.tail == null)
			return 0;
		else
			return 1 + tail.size();
	}

	@Override
	public String toString() {
		if (this.tail == null) 
			return "Nil";
		else
			return head + "::" + tail.toString();
	}
   
	public static void main(String[] args) {
		IntList L = new IntList(0, Nil);
		IntList L1 = L.append(1);
		IntList L2 = L1.append(2);
		L = L2;
		System.out.println(L.toString() + " has size " + L.size());
	}
}