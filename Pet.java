public class Pet {

    String name;
    int age;
    int weight;


    public Pet(String name, int age, int weight) {
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

    public void play(){
        System.out.println(name + " is playing");
    }

    public void makeSound(){
        System.out.println(name + " is making a sound");
    }


}
