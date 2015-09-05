
 * @author ketchers
 */
public class Dog {

    public int size;

    static int weight = 60;

    private String bark;

    public Dog(int startSize) {
	size = startSize;
    }

    public void bark() {

	if (size < 10) 
	    bark = "Yap";
	else if (size < 20)
	    bark = "Bark";
	else
	    bark = "Woof";
	    
	System.out.println(bark + " : " +  size + " : " + weight);
    }

    /*
     * The following is static since no particular dog
     * determines which of two dogs is bigger.
     */
    public static Dog maxDog(Dog d1, Dog d2) {
	if (d1.size > d2.size)
	    return d1;
	return d2;
    } 
}
