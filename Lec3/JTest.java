public class JTest {
   public static void main(String[] args){
      Bug b1 = new Bug("John",15);
      Bug b2 = new Bug("Jane");
      Bug b3 = new Bug();
      
      System.out.println(b1.getName() + ":" + b1.getAge());
      System.out.println(b2.getName() + ":" + b2.getAge());
      System.out.println(b2.getName() + ":" + b2.getAge());

      b3 = b2;
      b2 = null;
   }
}

class Bug {
   private String name;
   private int age;
   public static String type = "Bug";
   
   public Bug(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   public Bug(String name) {
      this(name, 25);
   }
   
   public Bug() {
      this("Harry", 30);
   }
   
   public String getName() {
      return name;
   }
   
   public int getAge() {
      return age;
   }
   
}