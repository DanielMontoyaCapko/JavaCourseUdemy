public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Big", 400);
        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog,"Fast");

        Dog yorkie = new Dog("Yorkie", 30);
        doAnimalStuff(yorkie,"Fast");
        Dog retriever = new Dog( "Retriever", 65,"Floppy","Swimmer");
        doAnimalStuff(retriever,"Slow");

        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"Slow");

        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(goldie,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makesNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
