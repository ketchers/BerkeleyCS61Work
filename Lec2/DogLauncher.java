public class DogLauncher {
    public static void main(String[] args) {
	Dog rover = new Dog(100);
	Dog spike = new Dog(19);
	rover.bark();
	spike.bark();
	rover.weight = 150;
	rover.size = 200;
	rover.bark();
	spike.bark();

	Dog.maxDog(rover,spike).bark();
    }
}


