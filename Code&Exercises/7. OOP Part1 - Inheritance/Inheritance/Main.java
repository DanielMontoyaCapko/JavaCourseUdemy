public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Big", 400);
        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog,"Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
