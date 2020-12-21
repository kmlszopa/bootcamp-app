import animals.Dog;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.changeColor("rudy");
        System.out.println("Pies jest koloru:");
        System.out.println(dog.getColor());

        dog.setColor("brazowy");
        dog.bark(10);
    }
}
