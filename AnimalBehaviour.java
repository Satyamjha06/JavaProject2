package JavaGroupProject;

public interface AnimalBehaviour {

    void eat();
    void sleep();
    void makeSound();
}

abstract class Animal implements AnimalBehaviour{
   protected String name;
   protected int age;

    public Animal(String name, int age){
        this.name= name;
        this.age= age;
    }
public void sleep(){
    System.out.println(name+" is sleeping");
}
public abstract void displayInformation();
}
