public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Tôi ăn xương");
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void sleep() {
        System.out.println("Dog real sleep");
    }
    public void Sua() {
        System.out.println("Gâu gâu");
    }
}
