public class Zoo {
    public static void main(String[] args) {

        CatsExtAnimal puma = new CatsExtAnimal("Cats", "Vivien", 8, 15);
        BirdExtAnimal eagle = new BirdExtAnimal("Birds", "Charly", 5, 4);
        ReptileExtAnimal lizard = new ReptileExtAnimal("Reptilies", "Dina", 120, 9);

        puma.eat();
        puma.sleep();
        puma.makeSound();

        System.out.println("  ");

        eagle.eat();
        eagle.sleep();
        eagle.shout();
        eagle.fly();

        System.out.println("  ");

        lizard.eat();
        lizard.sleep();
        lizard.makeSound();



    }
}
