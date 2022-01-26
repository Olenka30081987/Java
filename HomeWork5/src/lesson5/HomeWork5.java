package lesson5;

/**
 java 1 Homework5
 @author Olga Drevina
 @version 26.01.2022
 */

class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Oleg Petrov", "Engineer", "o.petrov@der.ru", "89873224125", 35000, 45);
        persArray[1] = new Person("Anton Denisov", "Technician", "a.denisov@der.ru", "89173601225", 38000, 25);
        persArray[2] = new Person("Olga Petrova", "Accountant", "o.petrova@der.ru", "81873224125", 45000, 39);
        persArray[3] = new Person("Anna Ivanova", "Manager", "a.ivanova@der.ru", "89063061887", 35000, 41);
        persArray[4] = new Person("Ivan Sosedov", "Engineer", "i.sosedov@der.ru", "89603061887", 38000, 44);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println (persArray[i]);
            }
        }


    }
}
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person:" + name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

}