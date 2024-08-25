public class DogExt extends Pet {

    public DogExt(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Gav!");
    }
}
