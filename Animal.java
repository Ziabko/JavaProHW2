public class Animal {

    String typ;
    String name;
    int age;
    int weight;

    public Animal(String typ, String name, int age, int weight) {
        this.typ = typ;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
