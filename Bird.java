package JavaGroupProject;

abstract class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the bird is pecking seeds or insects.");
    }

    public abstract void makeSound();

    public abstract void displayInformation();
}
class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " squawks and mimics words!");
    }

    public void displayInformation() {
        System.out.println("Parrot [Name: " + name + ", Age: " + age + "]");
    }
}
class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " lets out a sharp screech!");
    }

    public void displayInformation() {
        System.out.println("Eagle [Name: " + name + ", Age: " + age + "]");
    }
}