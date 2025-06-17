package JavaGroupProject;


abstract class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    // Mammals eat differently
    public void eat() {
        System.out.println(name + " the mammal is eating.");
    }

    public abstract void makeSound();

    public abstract void displayInformation();
}