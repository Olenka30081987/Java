package lesson6;

/**
 java 1 Homework6
 @author Olga Drevina
 @version 31.01.2022
 */

public class Homework6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat("Bruce",200,0), new Dog("Rocky",500,10)};
        for (IAnimal animal : animals) {
            System.out.println(animal.run(100));
            System.out.println(animal.swim(2));
        }
    }
}

class Cat extends Animal {
   Cat(String name, int runLimit, int swimLimit) {
       super(name,runLimit,swimLimit);
   }
    @Override
    public String swim(int x) {
        return name + " can't swim ";
    }
}

class Dog extends Animal {
    Dog(String name, int runLimit, int swimLimit) {
        super(name,runLimit,swimLimit);
    }
}

interface IAnimal {
    String run(int x);
    String swim(int x);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public String run(int x) {
        if (runLimit >= x) {
            return name + " run " + x + "m";
        } else {
            return name + " can't run " + x + "m";
        }
    }

    public String swim(int x) {
        if (swimLimit >= x) {
            return name + " swim " + x + "m";
        } else {
            return name + " can't swim " + x + "m";
        }
    }
}
