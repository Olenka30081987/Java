package lesson7;

/**
 java 1 Homework7
 @author Olga Drevina
 @version 03.02.2022
 */

class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Bruse", 3),
                new Cat("Veron", 5),
                new Cat("Barsik", 4)
        };
        Plate plate = new Plate(10);
        for (Cat cat : cats) {
            System.out.println(cat);
            System.out.println(plate);
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
            if (!cat.getIsFull()) {
                plate.addFood(cat.getAppetite());
                System.out.println(cat.getAppetite() + " food added ");
                cat.eat(plate);
                System.out.println(cat);
                System.out.println(plate);
            }
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void eat(Plate plate) {
        if (!isFull && plate.getFood() >= appetite) {
            isFull = true;
            plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return name + ", appetite: " + appetite + ", isFull: " + isFull;
    }
}
class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
        }
    }

    public void addFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
