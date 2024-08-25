public class Main {
    public static void main(String[] args) {

        CatExt catExt1 = new CatExt("Murka", 5, 6);
        DogExt dogExt1 = new DogExt("Muchtar", 3, 11);


        catExt1.eat();
        catExt1.sleep();
        catExt1.play();
        catExt1.makeSound();

        dogExt1.eat();
        dogExt1.sleep();
        dogExt1.play();
        dogExt1.makeSound();
    }
}