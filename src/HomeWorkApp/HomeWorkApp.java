package HomeWorkApp;


class HomeWorkApp {
    public static void main (String [] args) {
        System.out.println ("Hello, World");
        printTreeWords();
        checkSumSign();
        printcolor();
        compareNumbers();
    }
    static void printTreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    static void checkSumSign() {
        int a = 5;
        int b = -7;
        System.out.println ( (a+b)>=0? "Сумма положительная" : "Сумма отрицательная");
    }
    static void printcolor() {
        int value = 100;
        if (value <= 0) {
            System.out.println ("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println ("Желтый");
        } else {
            System.out.println ("Зеленый");
        }
    }
    static void compareNumbers() {
        int a = 15;
        int b = 10;
        System.out.println ( a >= b? "a >= b" : "a < b");
    }
}