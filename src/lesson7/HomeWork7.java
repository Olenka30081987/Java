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
            if (!cat.isFull) {
                plate.addFood(cat.appetite);
                System.out.println(cat.appetite + " food added ");
                cat.eat(plate);
                System.out.println(cat);
                System.out.println(plate);
            }
        }
    }

    static class Cat {
        private String name;
        private int appetite;
        private boolean isFull;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
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

    static class Plate {
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
}
