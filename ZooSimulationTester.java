package JavaGroupProject;

public class ZooSimulationTester {
    public static void main(String[] args) {
        Animal[] zooAnimals = new Animal[4];

        zooAnimals[0] = new Lion("Simba", 5);
        zooAnimals[1] = new Elephant("Dumbo", 10);
        zooAnimals[2] = new Parrot("Polly", 2);
        zooAnimals[3] = new Eagle("Freedom", 4);

        System.out.println("=== Zoo Simulation Start ===\n");

        for (Animal animal : zooAnimals) {
            animal.displayInformation();
            animal.eat();
            animal.makeSound();
            animal.sleep();
            System.out.println("---------------------------");
        }

        System.out.println("=== Zoo Simulation End ===");
    }
}

