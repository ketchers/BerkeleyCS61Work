public class ArrayBasics {

   private class Nothing {
         private String name;
         
         public Nothing(String nm) {
            name = nm;
            System.out.println(name);
         }
         
         public Nothing () {
            this("None");
         }
         
      }


	public static void main(String[] args) {
		int[] z = null;
		int[] x,y;

		x = new int[]{1,2,3,4,5};
		y = x;
		x = new int[]{-1,2,3,4,5};
		y = new int[3];
		z = new int[0];

		String[] s = new String[6];
		s[4] = "ketchup";
		
      ArrayBasics AB = new ArrayBasics();
            
      Nothing[] nt;
      //nt = (ArrayBasics.Nothing[]) new Object[5];
      nt = new Nothing[5];
      nt[0] = AB.new Nothing("John");
      
      nt = new ArrayBasics.Nothing[5];

      
	}
}