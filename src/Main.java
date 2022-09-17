/**
 * @author Miguel Ferreira, n. 60517
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Super animal git demo.");
        Animal dog = new Dog("Bobby");
        Animal cat = new Cat("Kitty");
        System.out.println(dog.getName() + " says " + dog.speak());
        System.out.println(cat.getName() + " says " + cat.speak());
    }
}
