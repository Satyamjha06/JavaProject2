package JavaGroupProject;

interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}

abstract class Animal implements AnimalBehavior {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    abstract void displayInformation();
}

class Mammal extends Animal {
    Mammal(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Mammal is eating.");
    }

    public void makeSound() {
        System.out.println(name + " the Mammal makes a sound.");
    }

    void displayInformation() {
        System.out.println("Mammal: " + name + ", Age: " + age);
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Bird is eating.");
    }

    public void makeSound() {
        System.out.println(name + " the Bird chirps.");
    }

    void displayInformation() {
        System.out.println("Bird: " + name + ", Age: " + age);
    }
}

class Lion extends Mammal {
    Lion(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Lion is eating meat.");
    }

    public void makeSound() {
        System.out.println(name + " the Lion roars.");
    }

    void displayInformation() {
        System.out.println("Lion: " + name + ", Age: " + age);
    }
}

class Elephant extends Mammal {
    Elephant(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Elephant is eating grass.");
    }

    public void makeSound() {
        System.out.println(name + " the Elephant trumpets.");
    }

    void displayInformation() {
        System.out.println("Elephant: " + name + ", Age: " + age);
    }
}

class Parrot extends Bird {
    Parrot(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Parrot is eating seeds.");
    }

    public void makeSound() {
        System.out.println(name + " the Parrot says 'Hello!'");
    }

    void displayInformation() {
        System.out.println("Parrot: " + name + ", Age: " + age);
    }
}

class Eagle extends Bird {
    Eagle(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Eagle is eating fish.");
    }

    public void makeSound() {
        System.out.println(name + " the Eagle screeches.");
    }

    void displayInformation() {
        System.out.println("Eagle: " + name + ", Age: " + age);
    }
}

public class ZooSimulation {
    public static void main(String[] args) {
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("Freedom", 4);

        lion.displayInformation();
        lion.eat();
        lion.makeSound();
        lion.sleep();

        System.out.println();

        elephant.displayInformation();
        elephant.eat();
        elephant.makeSound();
        elephant.sleep();

        System.out.println();

        parrot.displayInformation();
        parrot.eat();
        parrot.makeSound();
        parrot.sleep();

        System.out.println();

        eagle.displayInformation();
        eagle.eat();
        eagle.makeSound();
        eagle.sleep();
    }
}
