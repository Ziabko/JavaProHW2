public class BirdExtAnimal extends Animal {

    public BirdExtAnimal(String typ, String name, int age, int weight) {
        super(typ, name, age, weight);
    }

    public void fly(){
        System.out.println(name + " is flying");
    }

    public void shout(){
        System.out.println(name + " is shouting");
    }
}
