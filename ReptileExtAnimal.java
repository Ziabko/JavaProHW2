public class ReptileExtAnimal extends Animal {

    public ReptileExtAnimal(String typ, String name, int age, int weight) {
        super(typ, name, age, weight);
    }

    public void SkinOut(){
        System.out.println(name + " is shedding its skin");
    }

    public void silent(){
        System.out.println(name + " is silent");
    }

    @Override
    public void makeSound(){
        silent();
    }
}
