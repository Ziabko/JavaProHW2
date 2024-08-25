public class CatExt extends Pet {

    public CatExt(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Miu!");
    }
}


