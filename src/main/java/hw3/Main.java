package hw3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bushra", 23, "877 ALsalaam St");
        Person person2 = new Person("Sara", 28, "654 ALshafa st");
        Person person3 = new Person("Fahad", 25, "342 ALnada St");
        Person person4 = new Person("Waleed", 29, "866 ALsalaam St");
        Person person5 = new Person("Amal", 21, "176 ALolya St");


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        System.out.println("*********************************************");

        Student student1 = new Student("Ahmed", 20, "887 ALsalaam St", 11, "Computer Science");
        Student student2 = new Student("Basem", 22, "442 ALnada St", 22, "Computer Science");
        Student student3 = new Student("Nora", 20, "223 ALnada St", 33, "Computer Science");
        Student student4 = new Student("Sadeem", 22, "445 ALsalaam St", 44, "Computer Science");


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);



    }




}

