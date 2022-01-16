package lesson2;
/**
java 1 Homework2
@author Olga Drevina
@version 16.01.2022
*/
class Homework2 {

    public static void main(String[] args) {
        System.out.println(within10and20(5,4));
        isPositiveOrNegative(5);
        System.out.println(isNegative(-8));
        printWordNTimes("Olga",8);
        System.out.println(leapYear(400));

    }
    static boolean within10and20(int x1, int x2) {
        return x1+x2>=10 && x1+x2<=20;
    }
    static void isPositiveOrNegative(int x) {
        System.out.println(x>=0? "Positive":"Negative");
    }
    static boolean isNegative(int x) {
        return x<0;
    }
    static void printWordNTimes (String word, int times) {
        for (times=0; times<5; times++) {
            System.out.println (word);
        }
    }
    static boolean leapYear (int x) {
        return x%400==0 || (x%4==0 && !(x%100==0));
    }
}