package JavaGroupProject;

class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " roars majestically!");
    }

    public void displayInformation() {
        System.out.println("Lion [Name: " + name + ", Age: " + age + "]");
    }
}

class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " trumpets loudly!");
    }

    public void displayInformation() {
        System.out.println("Elephant [Name: " + name + ", Age: " + age + "]");
    }
}