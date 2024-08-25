public class CatsExtAnimal extends Animal {

    public CatsExtAnimal(String typ, String name, int age, int weight) {
        super(typ, name, age, weight);
    }

    public void roar(){
        System.out.println(name + " roars");
    }

    @Override
    public void makeSound(){
        roar();
    }
}
